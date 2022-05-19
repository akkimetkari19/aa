package demo;
import java.util.Scanner;

import javax.sql.rowset.JoinRowSet;

public class Main {
public static void main(String[] args)  {
	System.out.println("take inout from user");
	Scanner sc = new Scanner(System.in);
	System.out.println("inout first number");
	int a = sc.nextInt();
	
	System.out.println("inout second number");
	int b = sc.nextInt();
	System.out.println("sum of given numbers is " + (a+b));
}
}
