package com.example.demo.util;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;
import com.example.demo.logging.ManagementLoggerFactory;



@Component
public class FormatValidator {
	
	 private final Logger logger = ManagementLoggerFactory.getLogger(CustomCollectionValidator.class);	 
	 
	 public boolean checkDateList(List<HashMap<String, String>> dateList) {		 
		 	boolean result = true;      		        	
        	for(HashMap<String, String> dateMap : dateList) {
        		for(String key : dateMap.keySet()) {
        			if(!dateMap.get(key).isEmpty()) {
        				result = checkDateFormat(dateMap.get(key));
        				if(!result)
        					break;
        			}
        		}      		
        		if(!result)
        			break;
        	}     	
        	return result;
	 } 
	 
	 
	 public boolean checkDateFormat(String checkDate) {
	        try {
	            SimpleDateFormat dateFormatParser = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'"); 
	            dateFormatParser.setLenient(false); 
	            dateFormatParser.parse(checkDate); 
	            return true;
	        } catch (Exception e) {
	            return false;
	        }
	 }

	 
}

