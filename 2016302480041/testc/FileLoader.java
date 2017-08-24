package org.whuims.testc;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileLoader {
	private String filePath;
	public FileLoader(String filePath)
	{
		this.filePath=filePath;
	}
	public String read() throws IOException{
		StringBuilder sb = new StringBuilder();
		BufferedReader reader=new BufferedReader(new InputStreamReader(new FileInputStream(this.filePath),"gbk"));
		String line=reader.readLine();
		while(line!=null){
			sb.append(line).append(" ");
			line=reader.readLine();
		}
		String content=sb.toString().trim();
		return content;
	}
	
	
		
}
