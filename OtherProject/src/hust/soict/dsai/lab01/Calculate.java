package hust.soict.dsai.lab01;

import javax.swing.JOptionPane;
public class Calculate {
	public static void main(String[] agrs) {
		String strNum1,strNum2;
		String Tong= "Tong hai so la ";
		String Hieu="Hieu hai so la ";
		String Tich="Tich hai so la ";
		String Thuong="Thuong hai so la ";
		String Error = "Khong tinh duoc thuong hai so!!!";
	
			
	strNum1 = JOptionPane.showInputDialog(null,"Please input the first number: ","In put the fist number",JOptionPane.INFORMATION_MESSAGE);
	strNum2=JOptionPane.showInputDialog(null,"Please input the second number:"," In put the second number",JOptionPane.INFORMATION_MESSAGE);
	double Num1=Double.parseDouble(strNum1);
	double Num2=Double.parseDouble(strNum2);
	double sum = Num1+Num2;
	double difference = Num1 - Num2;
	double product = Num1 * Num2;
	Tong =  Tong + sum;
	Hieu = Hieu+difference;
	Tich = Tich +product;
	JOptionPane.showMessageDialog(null,Tong ,"Sum",JOptionPane.INFORMATION_MESSAGE);
	JOptionPane.showMessageDialog(null, Hieu,"Difference",JOptionPane.INFORMATION_MESSAGE);
	JOptionPane.showMessageDialog(null, Tich,"Product",JOptionPane.INFORMATION_MESSAGE);
	if (Num1 == 0) {
		JOptionPane.showMessageDialog(null, Error,"",JOptionPane.INFORMATION_MESSAGE);
	} else {
	double quotient = Num1/Num2;
	Thuong = Thuong + quotient;
	JOptionPane.showMessageDialog(null, Thuong,"Sum",JOptionPane.INFORMATION_MESSAGE);
	};
	System.exit(0);
	}
}
