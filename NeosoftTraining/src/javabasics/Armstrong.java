package javabasics;

public class Armstrong {
	public static void main(String[] args) {
		int num=153,rem,temp,arm=0;
		temp=num;
		while(temp!=0) {
			rem=temp%10;
			arm=arm+(rem*rem*rem);
			temp=temp/10;
		}
		if(arm==num) {
			System.out.println(num + " It is an armstrong number ");
		}
		else {
			System.out.println(num + " It is not an armstrong number ");
		}
	}
}