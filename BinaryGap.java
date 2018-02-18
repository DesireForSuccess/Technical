package codility;
/*
 * This Solution obtained 100 percent score in codility. 
 */

public class BinaryGap {
	public static void main(String[] args) {
		solution(1204655643);
		solution(1041);
	}
public static int solution(int n) {
	int binaryGap=0;
	int tempGap=0;
	String binary=Integer.toBinaryString(n);
	System.out.println(binary);
	for(char a:binary.toCharArray()) {
		if("0".equals(String.valueOf(a)) ){
			tempGap=tempGap +1;
		}
		else {
			if(tempGap>binaryGap)
			binaryGap=tempGap;
			tempGap=0;			
		}
		
	}
	
	System.out.println(binaryGap);
	return binaryGap;
	}
}
