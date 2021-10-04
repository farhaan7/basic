package javabasics;

public class Constructor {
	static class Test {
	    static int noOfObjects = 0;
	    
	    public Test(){
	    	noOfObjects+=1;
	    }
	    
	    public Test(int n){
	    	noOfObjects+=1;
	    }
	    
	    public Test(String s){
	    	noOfObjects+=1;
	    }
	  
	    public static void main(String args[]){
	        Test t1 = new Test();
	        Test t2 = new Test(5);
	        Test t3 = new Test("GFG");
	        
	        System.out.println(Test.noOfObjects);
	    }
	}
}