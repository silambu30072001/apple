package cat1;

import java.util.Scanner;

public class nameprinting {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first name");
		String t=sc.nextLine();
		System.out.println("enter the second name");
		String r=sc.nextLine();
		String u=t+"    "+r;
		System.out.println(u);
	}

}
