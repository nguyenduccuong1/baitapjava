package baithuchan;

import java.util.Scanner;

public class Slide35 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap vao so nguyen thu nhat =");
		int a = sc.nextInt();
		System.out.println("nhap vao so nguyen thu hai =");
		int b = sc.nextInt();
		if(a>b) {
			System.out.println("so nguyen nho nhat la ="+b);
		}else {
			System.out.println("so nguyen nho nhat la ="+a);
		}
			
	}
}
