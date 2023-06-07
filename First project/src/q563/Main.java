package q563;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      Scanner sc=new Scanner(System.in);
	      int arr[]=new int[10];
	     
	      for(int i=0; i<arr.length; i++) {
	         arr[i]=sc.nextInt();
	         for (int j = 0; j < i; j++) {
				if(arr[i] > arr[j]) {
					int temp;
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
	      } sc.close();
//	      for(int i=0; i<arr.length; i++) {
//	         for(int j=i+1; j<arr.length; j++) {
//	            if(arr[i]<arr[j]) {
//	      	      int a;
//	               a=arr[i];
//	               arr[i]=arr[j];
//	               arr[j]=a;
//	            }
//	         }
//	      }
	      for(int i=0; i<arr.length; i++) {
	         System.out.print(arr[i]+" ");
	      }


	}

}
