package com.classes;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pojo.TeamPojo;

/**
 * 
 * @author Revanth Kumar
 * 
 * This class function will read the data from a file and 
 * convert that to the POJO and return
 *
 */

public class TeamInfo {
	
	
	public TeamPojo readData(String filePath) {
		ObjectMapper mapper = new ObjectMapper();
		TeamPojo team = null;
		
		 try {
			team = mapper.readValue(new File(filePath), TeamPojo.class);
			
		} catch (StreamReadException e) {
			e.printStackTrace();
		} catch (DatabindException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		 return team;
	}

}
