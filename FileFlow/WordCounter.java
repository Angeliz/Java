package tests;
import java.util.HashMap;
import java.util.Map;

public class WordCounter implements Counter{
	String content;
    int count;
    char ch;
    
	public WordCounter(String content){
		this.content=content;
	}
	public void count(){
		System.out.println(content.length());
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		for(int i=0;i<content.length();i++){
			ch=content.charAt(i);
			if(!map.containsKey(ch)){
				map.put(ch,0);
			}
			count=map.get(ch);
			count++;
			map.put(ch, count);
		}
		for(Map.Entry<Character, Integer> entry:map.entrySet()){
			System.out.println(entry.getKey()+"\t"+entry.getValue());
		}

		System.out.println(map.size());
	}

}
