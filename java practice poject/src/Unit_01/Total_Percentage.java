package Unit_01;

import java.util.Scanner;

public class Total_Percentage {
	public static void main(String args[]) {
		System.out.println("Welcome to CBSE percentage");
		float total;
		Scanner sc = new Scanner(System.in);
		System.out.println("student name: Prerna");
		System.out.println("enter marks in 5 subjects out of 100");
		System.out.println("enetr marks in sub1: ");
		float m1=sc.nextFloat();
		System.out.println("enetr marks in sub2: ");
		float m2= sc.nextFloat();
		System.out.println("enetr marks in sub3: ");
		float m3=sc.nextFloat();
		System.out.println("enetr marks in sub4: ");
		float m4= sc.nextFloat();
		System.out.println("enetr marks in sub5: ");
		float m5 = sc.nextFloat();
		total = m1+m2+m3+m4+m5;
		float percentage = (total / 500.0f)*100;
		System.out.println("the percentage of prerna is :  "+percentage);
		
	}
}
