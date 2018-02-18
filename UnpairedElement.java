package codility;
import java.util.*;
import  java.util.Map.*;

public class UnpairedElement {
	static int unpared;
	public static void main(String[] args) {
		
	int[] arr= {1,2,3,5,7,5,3,1,2,7,7};	
	solution(arr);
	
	
	}
	public static int solution(int[] arr) {
		HashMap<Integer,Integer> arrMap = new HashMap<Integer, Integer>();
		for( Integer a:arr) {
			arrMap.put(a, (arrMap.containsKey(a)? arrMap.get(a) + 1 :1));
		}
	for(Entry<Integer, Integer> a:arrMap.entrySet()) {
		if(1==a.getValue()||1==a.getValue()%2){
			System.out.println("No Pair Element " + a.getKey());
			unpared=a.getKey();
				}
	}
		
		return unpared;
        
    }
	
}
	


