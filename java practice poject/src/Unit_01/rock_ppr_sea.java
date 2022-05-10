package Unit_01;

import java.util.Random;
import java.util.Scanner;

public class rock_ppr_sea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter 0 for Rock , 1 for Paper , 2 for scissor");
		Scanner sc = new Scanner(System.in);
		int user_input = sc.nextInt();
		
		Random r = new Random();
		int comp_input = r.nextInt(3);
		
		if(user_input == comp_input)
			System.out.println("DRAW");
		
		else if (user_input == 0 && comp_input== 2 || user_input == 1 && comp_input== 0 || user_input == 2 && comp_input== 1)
			System.out.println("YOU WIN");
		
		else
			System.out.println("COMPUTER WIN");
		
		if(comp_input==0)
			System.out.println("computer choice: Rock");
		else if(comp_input == 1)
			System.out.println("computer choice: Paper");
		else
			System.out.println("computer choice: scissor");
	}
	
	
}
