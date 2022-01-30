package com.headfirst;

import java.util.ArrayList;

public class Interview {
	
	public String recedingChars(String s) {
		String b="";
		String[] al = s.split("");
		int count = al.length;
		int index=0;
		while(count>0) {
			for(int i=0;i<count;i++) {
				b+=al[index];
			}
			index++;
			count--;
		}
		return b;
	}
  
	public static void main(String[] args) {
		String a ="gouthamkamath";
		Interview i=new Interview();
		String b = i.recedingChars(a);
		System.out.println(b);

	}

}

//output - gggggggggggggoooooooooooouuuuuuuuuuutttttttttthhhhhhhhhaaaaaaaammmmmmmkkkkkkaaaaammmmaaatth
