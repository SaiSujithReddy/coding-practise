//import java.util.HashTable;
import java.util.HashMap;
import java.util.ArrayList;
//import java.util.Hashtable;
import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
public class HashMapArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashMap<String, ArrayList<Integer>> map = new HashMap<String,ArrayList<Integer>>();

		
		/*Best way to iterate HashMap
		for(Map.Entry<Integer, String> entry : map.entrySet()){ System.out.printf("Key : %s and Value: %s %n", entry.getKey(), entry.getValue()); }

		Read more: http://java67.blogspot.com/2013/08/best-way-to-iterate-over-each-entry-in.html#ixzz3riIXSEgN
		
*/		
		/*
		Removing Entries from Map in Java
		

Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
while(iterator.hasNext()){
   Map.Entry<Integer, String> entry = iterator.next();
   System.out.printf("Key : %s and Value: %s %n", entry.getKey(), entry.getValue());
   iterator.remove(); // right way to remove entries from Map, 
                      // avoids ConcurrentModificationException
}


Read more: http://java67.blogspot.com/2013/08/best-way-to-iterate-over-each-entry-in.html#ixzz3riLX9XMf
		*/
		
		
		String[] array = {"abc","bvc","abc","hi","bye"};
		
		//al = al.add
		for(int i=0; i<5;i++)
		{
			
			if(map.containsKey(array[i])){
				
				map.get(array[i]).add(i);	
			}
			
			else{
				map.put(array[i], new ArrayList<Integer>());
				map.get(array[i]).add(i);
				
			}

		}
		
		for(Entry<String, ArrayList<Integer>> entry : map.entrySet()){
			if(entry.getValue().size() ==1){
			System.out.println("Key is " + entry.getKey() + "Value is " + entry.getValue());
			}
			if(entry.getValue().size() >1){
				for(int i =0 ;i <entry.getValue().size();i++){
				System.out.println("Key is " + entry.getKey() + "Value is " + entry.getValue().get(i));
				}
				} 
		}
		
		}
		
	

}
