package org.whuims.testc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordCounter implements Counter{
	String content;
    int count;
    String ch;
    List<Pair> list;
    
	public WordCounter(String content)
	{
		this.content=content;
	}
	public void count()
	{
		Map<String,Integer> maps=new HashMap<String,Integer>();
		for(int i=0;i<content.length();i++)
		{
			ch=String.valueOf(content.charAt(i));
			if(!maps.containsKey(ch)){
				maps.put(ch,0);
			}
			count=maps.get(ch);
			count++;
			maps.put(ch, count);
		}
		list=new ArrayList<Pair>();
		for(Map.Entry<String, Integer> entry:maps.entrySet()){
			Pair pair=new Pair();
			pair.setText(entry.getKey());
			pair.setCount(entry.getValue());
			list.add(pair);
		}
		Collections.sort(list);
	}


}
