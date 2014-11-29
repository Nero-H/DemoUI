package utility;

import java.util.ArrayList;
import java.util.HashMap;


public class LikeHashMap<K,V extends Containsable> extends HashMap<K,V> {
	public ArrayList<V> fuzzySearch(String id){
		 ArrayList<V> resultList = new  ArrayList<V>();
		 ArrayList<V> valueList = (ArrayList<V>)this.values();
		 for(V v : valueList){
			 if(v.contains(id)){
				 resultList.add(v);
			 }
		 }
		 return valueList;
	}
}
