package baithuchan;

import java.util.Scanner;

public class Slide34 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap vao so a =");
		double a = sc.nextDouble();
		System.out.println("nhap vao so b =");
		double b = sc.nextDouble();
		System.out.println("nhap vao so c =");
		double c = sc.nextDouble();
		double delta = b*b - 4*a*c;
		if(delta<0){
			System.out.println("phuong trinh vo nghiem");
			
		}else if(delta==0) {
			double x = -b / (2 * a);
            System.out.println("Phương trình có nghiệm kép: x1 = x2 = " + x);
		}else {
			System.out.println("phuong trinh co 2 nghiem phan biet: x1, x2");
			double x1 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.println("nghiem thu nhat cua phuong trinh la "+ x1);
			double x2 = (-b + Math.sqrt(delta)) / (2 * a);
			System.out.println("nghiem thu hai cua phuong trinh la "+ x2);
		}
			
		
		
		}
}
