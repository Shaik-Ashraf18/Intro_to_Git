package clc;

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
		int num=c.add(1,2);
		System.out.println(num);
		
	}

}
