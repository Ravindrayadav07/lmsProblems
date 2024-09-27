package com.lms;

public class Palindrome {
	public static void checkpalindrome(String name) {
		int st=0;
		int last=name.length()-1;
		int fleg=0;
		while(st<=last) {
			if(name.charAt(st)!=name.charAt(last)) {
				fleg=1;
				break;
			}
			st++;
			last--;
		}
		if(fleg==1) {
			System.out.println("string is not palindrome "+name);
		}
		else {
			System.out.println("string is a palindrome "+name);
		}
	}
	public static void main(String[] args) {
		String name="madam";
		checkpalindrome("madam");
		//System.out.println();
	}
	

}
