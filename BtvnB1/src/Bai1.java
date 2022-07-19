
import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		float a, b, c;
		System.out.print("nhap a= ");
		a = sc.nextFloat();
		System.out.print("nhap b= ");
		b = sc.nextFloat();
		System.out.print("nhap c= ");
		c = sc.nextFloat();
		//
		if(a+b>c || a+c>b || b+c>a) {
			 if(a==b && a==c && b==c) {
				System.out.print(" tam giac deu");
			}
			else if(a==b || b==c || a==c) {
				System.out.print(" tam giac can");
			}
			else if(a==b && (c*c)==(a*a)+(b*b) || a==c && (b*b)==(a*a)+(c*c) || b==c && (a*a)==(b*b)+(c*c)) {
				System.out.print(" tam giac vuong can");
			}
			else if((c*c)==(a*a)+(b*b) || (b*b)==(a*a)+(c*c) || (a*a)==(b*b)+(c*c)) {
				System.out.print(" tam giac vuong");
			}
			else {
				System.out.print("tam giac thuong");
			}
		}
		
	}
}
