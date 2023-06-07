package q562;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[]a = new int [5];
//		Scanner sc = new Scanner(System.in);
//		int sum= 0;
//		double avg = 0;
		
//		for(int i = 0; i < a.length; i++) {
//			a[i] =sc.nextInt();
//			if(i%2 !=0) {
//				sum += a[i];
//				System.out.println(sum);
//			}else {
//				avg += a[i];
//				System.out.println(avg);
//			}
//	
//		}
//		int cnt = 0;
//		for (int i = 0; i < a.length; i++) {
//			a[i] =sc.nextInt();
//			if (a[i] == 0 ) {
//				return;
//			} else {
//				if (a[i] % 5 == 0) {
//					sum+= a[i];
//					avg += a[i];
//					cnt++;
//				}
//			}
//		}
//		String test = "dsadad";
//		if (test.length() >= 5 && test.length() <= 100) {
//			System.out.println(test.substring(0,  5));
//		}
//		Scanner sc = new Scanner(System.in);
//		String a = sc.next();
//		String b = sc.next();
//		
//		if(a.length() < b.length()) {
//			System.out.println(b.length());
//		}else {
//			System.out.println(a.length());
//		}
		
	
/*
 * 해당 배열에서 문자의 길이가 가장큰 녀석을 출력, 문자의 길이가 가장 작은 녀석을 왼쪽에서부터 두글자만 출력
 * */
		String[] str = {"flower", "rose", "liloiibhky", "daffodil"};
		String st = "flower";
		String[] str = {"flower"};
	
		int len = 0;
		String st = "";
		for(int i = 0; i < str.length; i++) {
			if (len  < str[i].length()) {
				len = str[i].length();
				st = str[i];
			}
		}
		String as = "abdef";
		System.out.println(len);
		System.out.println(st);
		//		System.out.println("cnt :" + cnt);		
//		System.out.println("sum :" + sum);
//		System.out.printf("avg : %.1f\n" , (avg/cnt));
		
//		sc.close();
	}
}