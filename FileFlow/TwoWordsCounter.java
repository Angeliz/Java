package tests;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class TwoWordsCounter implements Counter {

    String content;
    int count;
    String str;
    
	public TwoWordsCounter(String content){
		this.content=content;
	}
	public void count(){
		System.out.println(content.length());
		Map<String,Integer> map=new HashMap<String,Integer>();
		for(int i=0;i<(content.length()-1);i++){
			str=content.substring(i,i+2);
			if(!map.containsKey(str)){
				map.put(str,0);
			}
			count=map.get(str);
			count++;
			map.put(str, count);
		}
		List<Pair> list=new ArrayList<Pair>();
		for(Map.Entry<String, Integer> entry:map.entrySet()){
			//System.out.println(entry.getKey()+"\t"+entry.getValue());
			Pair pair=new Pair();
			pair.setText(entry.getKey());
			pair.setCount(entry.getValue());
			list.add(pair);
		}
		Collections.sort(list);
		for(Pair p:list){
			System.out.println(p.getText()+"\t"+p.getCount());
		}
		System.out.println(map.size());
	}
	

}
