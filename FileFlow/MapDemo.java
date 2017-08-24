package tests;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class MapDemo {
    private String filePath;
	
	public MapDemo(String filePath){
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
	
	public static void main(String [] args){
		String path="d:\\JAVA\\creation.txt";
		MapDemo map=new MapDemo(path);
/*		try {
			String content=map.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		String content=null;
		try {
			content=map.read();
			System.out.println(content);
			Counter counter=new TermCounter(content);
			counter.count();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
