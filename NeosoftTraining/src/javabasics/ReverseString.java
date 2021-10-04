package javabasics;

public class ReverseString 
{
public static void main(String args[])
{
	String name = "thereisanapple";
	String rev="";	
	int len=name.length();
	//System.out.println(name.length());
    for(int i=len-1;i>=0;i--)
    {
    	rev=rev+name.charAt(i);
    }
    System.out.println(rev);
}

}
