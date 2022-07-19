
import java.util.Scanner;

public class BtvnB1 {

	public static void main(String[]args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int ngay, thang, nam;
		System.out.print("moi ban nhap ngay: ");
		ngay = sc.nextInt();
		
		System.out.print("moi ban nhap thang: ");
		thang = sc.nextInt();
		
		System.out.print("moi ban nhap nam: ");
		nam =sc.nextInt();
		
		if(ngay>=20 && ngay<=31 && thang==1 || ngay>=1 && ngay<=18 && thang==2) {
			System.out.print("cung Bao Binh");
		}
		else if(ngay>=19 && ngay<=31 && thang==2 || ngay>=1 && ngay<=20 && thang==3) {
			System.out.print("cung Song Ngu");
		}
		else if(ngay>=21 && ngay<=31 && thang==3 || ngay>=1 && ngay<=20 && thang==4) {
			System.out.print("cung Bach Duong");
		}
		else if(ngay>=21 && ngay<=31 && thang==4 || ngay>=1 && ngay<=20 && thang==5) {
			System.out.print("cung Kim Nguu");
		}
		else if(ngay>=21 && ngay<=31 && thang==5 || ngay>=1 && ngay<=21 && thang==6) {
			System.out.print("cung Song Tu");
		}
		else if(ngay>=22 && ngay<=31 && thang==6 || ngay>=1 && ngay<=22 && thang==7) {
			System.out.print("cung Cu Giai");
		}
		else if(ngay>=23 && ngay<=31 && thang==7 || ngay>=1 && ngay<=22 && thang==8) {
			System.out.print("cung Su Tu");
		}
		else if(ngay>=23 && ngay<=31 && thang==8 || ngay>=1 && ngay<=22 && thang==9) {
			System.out.print("cung Xu Nu");
		}
		else if(ngay>=23 && ngay<=31 && thang==9 || ngay>=1 && ngay<=23 && thang==10) {
			System.out.print("cung Thien Binh");
		}
		else if(ngay>=24 && ngay<=31 && thang==10 || ngay>=1 && ngay<=22 && thang==11) {
			System.out.print("cung Bo Cap");
		}
		else if(ngay>=23 && ngay<=31 && thang==11 || ngay>=1 && ngay<=21 && thang==12) {
			System.out.print("cung Nhan Ma");
		}
		else if(ngay>=22 && ngay<=31 && thang==12 || ngay>=1 && ngay<=19 && thang==1) {
			System.out.print("cung Ma Ket");
		}
		else {
			System.out.print("ban nhap khong dung yeu cau.");
		}

	}
}

