package baithuchan;


	import java.util.Scanner;

	public class Slide30 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("nhap vao so n =");
			int n = sc.nextInt();
			int tong = 0;
			while(n>0) {
				tong +=n%10;
				n/= 10;
				
				
			}
			System.out.println("tong cua cac so vua nhap la ="+ tong);
		}
			
		
	}

