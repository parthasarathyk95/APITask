package org.sampletest;


import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONArrayReading {
public static void main(String[] args) throws IOException, ParseException {
	//Mention the path of your location in FileReader Class
		FileReader reader = new FileReader("C:\\Users\\intel\\eclipse-workspace\\APITask\\src\\test\\resources\\DATAINPUTS\\array_created_example.json");
		// Created a Object for Class: JSONParser
		JSONParser jp = new JSONParser(); 
		
		//Calling the parse method
		Object o = jp.parse(reader);
		
		//Downcasting ---->JSONObject
		//newDataType refname = (newDataType)oldDataType
		
		JSONObject jo = (JSONObject)o;
		
		// to get the employee ->key
		
		Object employeeObj = jo.get("employee");
		
		// Downcasting ---> JSONARRAY
		
		JSONArray ja = (JSONArray)employeeObj;
		
		// get the specific index of array
		
		Object object1 = ja.get(0);
		
		// Downcasting ---> JSONObject
		
		JSONObject jsonobject1 = (JSONObject)object1;
		
		String empfirstname = jsonobject1.get("firstname").toString();
		System.out.println(empfirstname);
		
		System.out.println(jsonobject1.get("lastname").toString());
}
}
