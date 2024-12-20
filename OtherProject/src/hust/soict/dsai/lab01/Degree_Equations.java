package hust.soict.dsai.lab01;

import javax.swing.JOptionPane;
public class Degree_Equations {
		public static void main(String[] agrs) {
			String strChoose;
	        strChoose= JOptionPane.showInputDialog(null, "1.First-degree 1 var\n2.First-degree 2 var\n3.Second-degree",JOptionPane.INFORMATION_MESSAGE );
	        Double Choose = Double.parseDouble(strChoose);
	        if (Choose == 1) {
	        	A();
	        } else if (Choose == 2) {
	        	B();
	        } else {
	        	C();
	        };
		};
		public static void A() {
			String strNum1,strNum2;	
			String strNotification = "Nghiem cua phuong trinh la: ";
			strNum1 = JOptionPane.showInputDialog(null,"He so cua x: ","In put the fist number",JOptionPane.INFORMATION_MESSAGE);
			strNum2=JOptionPane.showInputDialog(null,"He so tu do:"," In put the second number",JOptionPane.INFORMATION_MESSAGE);
			double Num1=Double.parseDouble(strNum1);
			double Num2=Double.parseDouble(strNum2);	
			if (Num1 == 0 ) {
				if (Num2 == 0) {
				JOptionPane.showMessageDialog(null,"Phuong trinh co vo so nghiem",null,JOptionPane.INFORMATION_MESSAGE);
				System.exit(0);
			} else {
				JOptionPane.showMessageDialog(null,"Phuong trinh vo nghiem" ,null,JOptionPane.INFORMATION_MESSAGE);
				System.exit(0);
			};
			};
			double x = -Num2/Num1;
			strNotification+=x;
			JOptionPane.showMessageDialog(null,strNotification ,null,JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		};
		public static void B() {
	          String stra11,stra12,strb1,stra21,stra22,strb2;
	            stra11=JOptionPane.showInputDialog(null,"input a11: " ,JOptionPane.INFORMATION_MESSAGE);
	            stra12=JOptionPane.showInputDialog(null,"input a12: " ,JOptionPane.INFORMATION_MESSAGE);
	            strb1=JOptionPane.showInputDialog(null,"input b1: " ,JOptionPane.INFORMATION_MESSAGE);
	            stra21=JOptionPane.showInputDialog(null,"input a21: " ,JOptionPane.INFORMATION_MESSAGE);
	            stra22=JOptionPane.showInputDialog(null,"input a22: " ,JOptionPane.INFORMATION_MESSAGE);
	            strb2=JOptionPane.showInputDialog(null,"input b2: " ,JOptionPane.INFORMATION_MESSAGE);
	            double a11= Double.parseDouble(stra11);
	            double a12= Double.parseDouble(stra12);
	            double b1= Double.parseDouble(strb1);
	            double a21= Double.parseDouble(stra21);
	            double a22= Double.parseDouble(stra22);
	            double b2= Double.parseDouble(strb2);
	            Double D=a11*a22-a21*a12;
	            Double D1=b1*a22-b2*a12;
	            Double D2=a11*b2-a21*b1;
	            double x = D1/D;
	            double y = D2/D;
	            JOptionPane.showMessageDialog(null,"x = "+x,null,JOptionPane.INFORMATION_MESSAGE);
	            JOptionPane.showMessageDialog(null,"y ="+y,null,JOptionPane.INFORMATION_MESSAGE);
				System.exit(0);
		};
		public static void C() {
			String stra,strb,strc;
            stra=JOptionPane.showInputDialog(null,"input a: " ,JOptionPane.INFORMATION_MESSAGE);
            strb=JOptionPane.showInputDialog(null,"input b: " ,JOptionPane.INFORMATION_MESSAGE);
            strc=JOptionPane.showInputDialog(null,"input c: " ,JOptionPane.INFORMATION_MESSAGE);
            double a= Double.parseDouble(stra);
            double b= Double.parseDouble(strb);
            double c= Double.parseDouble(strc);

            double delta =b*b - 4*a*c;
            if (delta < 0) {
	            JOptionPane.showMessageDialog(null,"Phuong trinh vo nghiem",null,JOptionPane.INFORMATION_MESSAGE);
	            System.exit(0);
            } else if(delta == 0) {
   	            double x = -b/(2*a);
	            JOptionPane.showMessageDialog(null,"Phuong trinh co nghiem kep la " + x,null,JOptionPane.INFORMATION_MESSAGE);
	            System.exit(0);
            } else {
            	double x1 = (-b + Math.sqrt(delta))/2*a;
            	double x2 = (-b - Math.sqrt(delta))/2*a;
	            JOptionPane.showMessageDialog(null,"Phuong trinh co nghiem x1 la "+x1,null,JOptionPane.INFORMATION_MESSAGE);
	            JOptionPane.showMessageDialog(null,"Phuong trinh co nghiem x2 la " +x2,null,JOptionPane.INFORMATION_MESSAGE);
	            System.exit(0);
            	
            }
		}
		

}
