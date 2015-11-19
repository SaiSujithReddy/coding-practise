import java.util.HashMap;
import java.util.Map.Entry;
public class HashMapHashMap {
	
	public static void main(String[] args){
		
		HashMap<String,HashMap<Integer,Integer>> map = new HashMap<String,HashMap<Integer,Integer>>();
		HashMap<Integer,Integer> insideMap = new HashMap<Integer,Integer>();
		String[] array = {"asd","dsa","df","qwer","qwer"};
		
		for(int i=0; i<array.length;i++){
			
			if(map.containsKey(array[i])){
				
				map.put(array[i], new HashMap<Integer,Integer>());
				
				if(map.get(array[i]).get(i) == null){
				
				map.get(array[i]).put(i, 1);
				}
				if(map.get(array[i]).get(i) != null){
					map.get(array[i]).put(i, map.get(array[i]).get(i)+1);
				}
			}
			
			else{
				map.put(array[i], new HashMap<Integer,Integer>());
				map.get(array[i]).put(i, 1);
			}
			
			
		}
		
		
		for(Entry<String,HashMap<Integer,Integer>> entry : map.entrySet() ){
			System.out.println(entry.getKey() + " " +entry.getValue());
				
		}
		
		
	}
}
