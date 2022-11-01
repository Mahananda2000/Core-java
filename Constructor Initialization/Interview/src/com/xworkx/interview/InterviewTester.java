package com.xworkx.interview;

public class InterviewTester {
	public static  void reverse(String data) {
		char newData[] = data.toCharArray();
		//char newData[] = {'M','a','h','a','n','a','n','d','a'};
		for(int index = newData.length-1; index >=0;index--) {
			System.out.print(newData[index] + " ");
		}
		for(int index =0; index<newData.length;index++) {
			System.out.print(newData[index] + " ");
		}
		
		
	}
	
	
	public static void main(String args[]) {
		reverse("Mahananda");
		convertFirstCharacterToUppercase("my name is mahananda");
		/*task this is print first alphabet is uppercase print;
		 
		 
		 task for ascending and descending orders*/
		reverseMiddleWords("My Name is Mahananda");
		//
	}

}
