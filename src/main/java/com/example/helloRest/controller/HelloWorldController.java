package com.example.helloRest.controller;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Types;
import java.util.HashMap;

import javax.sql.DataSource;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;  
@RestController
public class HelloWorldController {
	  @Autowired
	    private DataSource dataSource;
	@RequestMapping("/")  
	public String hello()   
	{ 
	
JSONArray json = new JSONArray();
        
		try(Connection conn = this.dataSource.getConnection();
				CallableStatement cstmt=conn.prepareCall("{call PSN.sp_pss_life_certificate_rpt  (?,?)}"))
		{
            cstmt.registerOutParameter(1, Types.CLOB);
            cstmt.registerOutParameter(2, Types.VARCHAR);
            cstmt.execute();
            
			String outMessage = (String)cstmt.getString(1);
			if (outMessage==null) {
			       JSONObject jsonObject = new JSONObject();
                jsonObject.put("msg", "no data available");
                json.put(jsonObject);
			}
			else {			
			   json = new JSONArray(outMessage);
			}
		}catch(Exception e){
			e.printStackTrace();
		}	
		
		
	return json.toString() ;
	}  
	
	@PostMapping("/d")  
	
	
	public ResponseEntity<?> mapReturn() {
	    HashMap<String, String> map = new HashMap<String, String>();
	    map.put("name", "test1");
	    map.put("sex", "male");
	    map.put("address", "1324");
	    map.put("old", "123");
	    return new ResponseEntity(map, HttpStatus.OK); // you can change status code based on response
	}
	
	
	
	
}
