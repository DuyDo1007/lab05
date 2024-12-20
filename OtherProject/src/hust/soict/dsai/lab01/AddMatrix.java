package hust.soict.dsai.lab01;
import java.util.Scanner;
public class AddMatrix {
	public static void main(String[] agrs) {
		Scanner keyboard = new Scanner(System.in);
		int m,n;
		System.out.println("Vui long nhap co ma tran! ");
		System.out.println("m = ");
		m = keyboard.nextInt();
		System.out.println("n =");
		n = keyboard.nextInt();
		int[][] M= new int[m][n];
		int[][] N= new int[m][n];
		int[][] A= new int[m][n];
		System.out.println("Vui long nhap ma tran thu nhat:");
		for (int i = 0;i < n; i++) {
			for (int j = 0; j < m;j ++) {
				M[i][j] = keyboard.nextInt();								
			};
		};
		System.out.println("Vui long nhap ma tran thu hai: ");
		for (int i = 0;i < n; i++) {
			for (int j = 0; j < m;j ++) {
				N[i][j] = keyboard.nextInt();
			};
		};
		System.out.println("Tong cua hai ma tran tren la: ");
		for (int i = 0;i < n; i++) {
			for (int j = 0; j < m;j ++) {
				A[i][j] = M[i][j]+N[i][j];
				System.out.print(A[i][j]+" ");
			};
			System.out.println();
		};
		
		
		
	}
}
