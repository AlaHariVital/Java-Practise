package Strings;

import java.util.Scanner;

public class ReversingStrings {
	public static void main(String args[]) {
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter String :");
		String str=sc.nextLine();
		sc.close();
		StringBuffer obj=new StringBuffer(str);
		System.out.println("The reverse String is :"+obj.reverse()); 
		
		String words[] = str.split(" ");
		
		String reverseWords = "";
		
		int len = words.length;
		for(int i=0;i<len;i++) {
			StringBuffer obj2 = new StringBuffer(words[i]);
			reverseWords += obj2.reverse().toString()+" ";
			
		}
		System.out.print("Reversing each word at its place :"+reverseWords);
	}
}
