package com.vm.java.tests;

public class StringProgram {
public static void main(String[] args) {
	String text="hello welcome to india";  
	String words[]=text.split("\\s");  
	int length=words.length;
	System.out.println("word:"+length);
	int clength=text.length();
	System.out.println("Character:"+clength);
}
}
