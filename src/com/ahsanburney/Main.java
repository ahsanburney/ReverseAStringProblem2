package com.ahsanburney;

public class Main {

//    Write a function that takes a string as input and returns the string reversed.

//    Example:
//    Given s = "hello", return "olleh".

    public static void main(String[] args) {
	// write your code here

        System.out.println(reverse("HELLO"));

    }


    public static String reverse(String s){
        char[] ch = s.toCharArray();
        int i=0;
        int j=s.length()-1;
        while(i<j){
            char temp = ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            i++;
            j--;
        }
        return new String(ch);

    }

}
