// reading the json file --->object_created_basicdetails.json
package org.sampletest;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONObjectReading {
public static void main(String[] args) throws IOException, ParseException  {
	//Mention the path of your location in FileReader Class
	FileReader reader = new FileReader("C:\\Users\\intel\\eclipse-workspace\\APITask\\src\\test\\resources\\DATAINPUTS\\object_created_basicdetails.json");
	// Created a Object for Class: JSONParser
	JSONParser jp = new JSONParser(); 
	
	//Calling the parse method
	Object o = jp.parse(reader);
	
	//Downcasting ---->JSONObject
	//newDataType refname = (newDataType)oldDataType
	
	JSONObject jo = (JSONObject)o;
	
	// printing of Object ----> value 
	Object gender = jo.get("gender");
	
	System.out.println(gender);
	
	// printing of ObjecttoString ----> value
	String empName = jo.get("name").toString();
	
	System.out.println(empName);
	
	System.out.println(jo.get("age").toString());
	
}
}
