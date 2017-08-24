package org.whuims.testc;

import java.io.FileWriter;
import java.io.IOException;

import org.whuims.testc.WordCounter;
import org.whuims.testc.BigramCounter;
import org.whuims.testc.TrigramCounter;



public class MyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path="D://十八大报告全文.txt";
		FileLoader map=new FileLoader(path);
		String content=null;
		
		try {
			content=map.read();
			BigramCounter counter=new BigramCounter(content);
			 WordCounter one=new  WordCounter(content);
			TrigramCounter three = new TrigramCounter(content);
			 
			counter.count();
			one.count();
			three.count();
			
			FileWriter fw2=new FileWriter("D://2.txt");
			for(Pair p:counter.list)
			{		
				fw2.write(p.getText()+"\t"+p.getCount());
			}
			fw2.close();
			
			FileWriter fw1=new FileWriter("D://1.txt");
			for(Pair p:one.list)
			{
				fw1.write(p.getText()+"\t"+p.getCount());
			}
			fw1.close();
			
			FileWriter fw3=new FileWriter("D://3.txt");
			for(Pair p:three.list)
			{		
				fw3.write(p.getText()+"\t"+p.getCount());

			}
			fw3.close();
			
			
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	

}
