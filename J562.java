package ClassHour;

import java.util.Scanner;

public class J562 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int sum = 0;	//¦�� ��
		int sum2=0;		//Ȧ�� ��տ� ����� ��
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		//¦�� ��. �ε���=1, 3, 5, 7, 9
		for(int i=1; i<arr.length; i=i+2) {
			sum += arr[i];
		}
		
		//Ȧ�� ���. �ε���=0, 2, 4, 6, 8
		for(int i=0; i<arr.length; i=i+2) {
			sum2 += arr[i];
		}
		double avg = (double)sum2/(arr.length/2);
		
		System.out.println("sum : "+sum);
		System.out.printf("avg : %.1f",avg);
		
		sc.close();
	}
}
