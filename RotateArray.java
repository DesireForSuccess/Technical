package codility;
import java.util.*;

public class RotateArray {
	public static void main(String[] arsg) {
		int[] intArr= {7,57,89};
		int rotTime=2;
		getRotated(intArr,rotTime);
		System.out.println(getRotatedArrayList(intArr,rotTime));
	
		
		
	}
	public static int[] getRotated(int[] orgArr, int rotTime){
		ArrayList<Integer> intArr=new ArrayList<Integer>();
		ArrayList<Integer> rotArr=new ArrayList<Integer>(intArr.size());
		int[] rotIntArr;
		for(int a:orgArr) {
			intArr.add(a);
			rotArr.add(a);
		}
		int arrSize=intArr.size();
	
		
			
		
		for( int i=0;i<rotTime;i++) {
			int nextElement=1;
			for(int a=0;a<intArr.size();a++) {
			if(a==(intArr.size()-1)) {			
				rotArr.set(0, intArr.get(intArr.size()-1));
			}
			else  if (a<(arrSize-1)) {
			
				rotArr.set(nextElement, intArr.get(a));
			}
			nextElement++;
			}
			intArr.clear();
			intArr.addAll(rotArr);
		}	
		intArr.clear();
		
		rotIntArr = new int[rotArr.size()];
		for (int w = 0; w < rotIntArr.length; w++) {
			rotIntArr[w] = rotArr.get(w);
		}		
		
		return rotIntArr;
	
		
	}
	public static ArrayList<Integer> getRotatedArrayList(int[] intArrList, int rotTime){

		ArrayList<Integer> intArr=new ArrayList<Integer>();
		ArrayList<Integer> rotArr=new ArrayList<Integer>(intArr.size());
		int[] rotIntArr;
		for(int a:intArrList) {
			intArr.add(a);
			rotArr.add(a);
		}
		int arrSize=intArr.size();
	
		
			
		
		for( int i=0;i<rotTime;i++) {
			int nextElement=1;
			for(int a=0;a<intArr.size();a++) {
			if(a==(intArr.size()-1)) {			
				rotArr.set(0, intArr.get(intArr.size()-1));
			}
			else  if (a<(arrSize-1)) {
			
				rotArr.set(nextElement, intArr.get(a));
			}
			nextElement++;
			}
			intArr.clear();
			intArr.addAll(rotArr);
		}	
		intArr.clear();	
		
		return rotArr;
	
		
	
		
	}

}
