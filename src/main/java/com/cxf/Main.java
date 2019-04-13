package com.cxf;

import java.io.File;

/**
 * cxf
 * 2017-06-29
 */
public class Main {
	
	public static void main(String[] args) throws Exception{		
		int len = args.length;
		if(len<1){
			throw new Exception("Error: the hive sql file must be set!"); 
		}
		File file = new File(args[0]);
		if(!file.exists()){
			throw new Exception("Error: the hive sql file "+ args[0] +" does not exist!"); 
		}
		ParseCommand pc = new ParseCommand(args);
		String command=Utils.parseCommand(Utils.getCommandFromFile(file), pc.getParamMap());
		System.out.println(command);
	}
	
	
	
}
