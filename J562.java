package ClassHour;

import java.util.Scanner;

public class J562 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int sum = 0;	//Â¦¼ö ÇÕ
		int sum2=0;		//È¦¼ö Æò±Õ¿¡ »ç¿ëÇÒ ÇÕ
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		//Â¦¼ö ÇÕ. ÀÎµ¦½º=1, 3, 5, 7, 9
		for(int i=1; i<arr.length; i=i+2) {
			sum += arr[i];
		}
		
		//È¦¼ö Æò±Õ. ÀÎµ¦½º=0, 2, 4, 6, 8
		for(int i=0; i<arr.length; i=i+2) {
			sum2 += arr[i];
		}
		double avg = (double)sum2/(arr.length/2);
		
		System.out.println("sum : "+sum);
		System.out.printf("avg : %.1f",avg);
		
		sc.close();
	}
}

//¿µÈ¯
//public class J562 {
//	   public static void main(String[] args) {
//	      Scanner sc = new Scanner(System.in);
//	      
//	      int[] arr = new int[10];
//	      int sum = 0;		//Â¦¼ö ¹øÂ° ÀÔ·ÂµÈ °ªÀÇ ÇÕ. ÀÎµ¦½º = 1 3 5 7 9
//	      double avg = 0;	//È¦¼ö ¹øÂ° ÀÔ·ÂµÈ °ªÀÇ Æò±Õ. ÀÎµ¦½º = 2 4 6 8
//	      int j = 0;
//	      
//	      for(int i = 0; i < arr.length; i++) {
//	         arr[i] = sc.nextInt();
//	         
//	         if(i % 2 != 0) { 
//	        	 sum += arr[i]; 
//	        } else {
//	            j++;
//	            avg += arr[i];
//	        }
//	      }
//	         
//	      avg = avg / j;
//	      
//	      System.out.printf("sum : %d\n", sum);
//	      System.out.printf("avg : %.1f", avg);
//	}
//}