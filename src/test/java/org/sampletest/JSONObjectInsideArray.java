package org.sampletest;



import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONObjectInsideArray {
public static void main(String[] args) throws IOException, ParseException {
	//Mention the path of your location in FileReader Class
			FileReader reader = new FileReader("C:\\Users\\intel\\eclipse-workspace\\APITask\\src\\test\\resources\\DATAINPUTS\\list_users.json");
			// Created a Object for Class: JSONParser
			JSONParser jp = new JSONParser(); 
			
			//Calling the parse method
			Object o = jp.parse(reader);
			
			//Downcasting ---->JSONObject
			//newDataType refname = (newDataType)oldDataType
			
			JSONObject jo = (JSONObject)o;
			
			// to get the data ->key
			
			Object dataObj = jo.get("data");
			
			// Downcasting ---> JSONARRAY
			
			JSONArray ja = (JSONArray)dataObj;
			
			// get the specific index of array from the data ->key
			
			Object object1 = ja.get(3);
			
			// Downcasting ---> JSONObject
			
			JSONObject jsonobject1 = (JSONObject)object1;
			
			System.out.print("email : ");
			System.out.println(jsonobject1.get("email").toString());
			
			String empfirstname = jsonobject1.get("first_name").toString();
			System.out.print("first_name : ");
			System.out.println(empfirstname);
			
			System.out.print("last_name : ");
			System.out.println(jsonobject1.get("last_name").toString());
			
			System.out.print("avatar : ");
			System.out.println(jsonobject1.get("avatar").toString());
			
}
}
