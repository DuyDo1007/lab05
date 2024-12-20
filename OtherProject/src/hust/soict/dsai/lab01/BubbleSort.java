package hust.soict.dsai.lab01;
import java.util.Scanner;
public class BubbleSort {
	public static void main(String[] agrs) {
		Scanner keyboard =new Scanner(System.in);
		String Line = keyboard.nextLine();
		String[] Numbers=Line.split(" ");
		int[] number = new int[Numbers.length];
		int sum = 0;
		int n = Numbers.length;
		for (int i =0;i <n;i++) {
			int num= Integer.parseInt(Numbers[i]);
			number[i]=num;
			sum = sum + num;
		};
		int avg = sum / n;
		System.out.println("Trung binh cua chuoi so la " + avg );
		System.out.println("Tong cua chuoi la "+ sum );
		BubbleSortArr(number,n);
		System.out.print("Chuoi da sap xep la: ");
        	for (int i = 0; i < n ;i ++) {
            		System.out.print(number[i] + " ");
        	};
		
	};
	public static void BubbleSortArr(int[] number,int n) {
		for (int i = 0;i < n - 1;i ++) {
			if(number[i] > number[i + 1]) {
			 int temp = number[i+1];
			 number[i + 1] = number[i];
			 number[i] = temp;
			};
		};
	};
}
			

