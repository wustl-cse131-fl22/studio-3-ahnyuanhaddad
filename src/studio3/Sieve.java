package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the number you want to find primes up to:");
		Scanner in = new Scanner(System.in);
		int target = in.nextInt();
		int[] arr= new int[target+1];
		
		int cMultiple = 0;
		int mult = 1;
		
		
		for(int i = 2; i<arr.length;i++) {
			//System.out.println("passed:"+i);
			if(arr[i]==0) {
				System.out.println(i);
				arr[i]=i;
			}
			while(cMultiple<=target) {
				cMultiple= arr[i]*mult;
				mult++;
				if(cMultiple<=target)
				arr[cMultiple]=cMultiple;
				//System.out.println(cMultiple);
				
			}
			mult =1;
			cMultiple=0;
		}
		
	}

}
