package com.util;

import java.util.logging.Logger;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class UtilCommon {
	private static final Logger log = Logger.getLogger(UtilCommon.class.getName());
	
	public String converObjectToJson (Object object) throws JsonParseException {
		try {
			
			ObjectMapper objectMapper = new ObjectMapper();
			return objectMapper.writeValueAsString(object);
			
		} catch (JsonParseException e) {
			// TODO: handle exception
			log.info("-------------에러발생2--------------");
			e.printStackTrace();
			return null;
		
		} catch (Exception e) {
			
			log.info("-------------에러발생--------------");
			e.printStackTrace();
			return null;
		}
		
		
		
	}
}
