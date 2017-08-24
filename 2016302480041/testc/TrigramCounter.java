package org.whuims.testc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TrigramCounter implements Counter {
	String content;
    int count;
    String str;
    List<Pair> list;
    
	public TrigramCounter(String content){
		this.content=content;
	}
	public void count(){
		Map<String,Integer> map=new HashMap<String,Integer>();
		for(int i=0;i<(content.length()-2);i++){
			str=content.substring(i,i+3);
			if(!map.containsKey(str)){
				map.put(str,0);
			}
			count=map.get(str);
			count++;
			map.put(str, count);
		}
		list=new ArrayList<Pair>();
		for(Map.Entry<String, Integer> entry:map.entrySet()){
			Pair pair=new Pair();
			pair.setText(entry.getKey());
			pair.setCount(entry.getValue());
			list.add(pair);
		}
		Collections.sort(list);
		
	}
}
