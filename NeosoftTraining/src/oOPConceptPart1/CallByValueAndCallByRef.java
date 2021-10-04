package oOPConceptPart1;

public class CallByValueAndCallByRef
{
//call by value: passing parameters to a function just to call them is called call by value
	int p;
	int q;
	
	public static void main(String[] args)
	{
		CallByValueAndCallByRef obj = new CallByValueAndCallByRef();
		int x = 10;
		int y =20;
		obj.testsum(x,y); //call by value or pass by value
		obj.p = 50;
		obj.q=60;
		
		obj.swap(obj);
		
		//after swapping
		System.out.println(obj.p);
		System.out.println(obj.q);
	}
	//call by value
	public int testsum(int a, int b)
	{
		int c=a+b;
		return c;
	}
	//call by reference using object reference.
	public void swap(CallByValueAndCallByRef t)
	{
		int temp;
		temp = t.p;  //50 value of p given to temp as t and obj are referring same object
		t.p = t.q;  //p = 60
		t.q = temp; //q=50,hence swapping is done
	}
	
	
}

