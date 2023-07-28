package com.gradedproject.q2;

import java.util.Scanner;

public class Main{
    public static int Power(int X, int N) {
       if(N==0) {
    	   return 1;
       }
       else {
    	   return X*Power(X,N-1);
       }
    }
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Enter the base number X:");
    	int X = sc.nextInt();
    	
    	System.out.println("Enter the base number N:");
    	int N = sc.nextInt();
    	
    	int result = Power(X,N);
    	System.out.println("X power N is: "+ result);
       
    }
}
