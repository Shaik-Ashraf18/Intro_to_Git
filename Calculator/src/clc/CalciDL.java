package clc;

import java.util.Scanner;

public class CalciDL {

	
	public int add(int a,int b)
	{
	   return a+b;	
	}

	public int sub(int a,int b)
	{
	   return a-b;	
	}

	public int mul(int a,int b)
	{
	   return a*b;	
	}

	public int div(int a,int b)
	{
	   return a/b;	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Calci c=new Calci();   
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
		int num=c.add(num1,num2);
		System.out.println(num);
		
	}

}
