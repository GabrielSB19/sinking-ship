package ui;

import java.util.Scanner;
import model.*;

public class Main {
	
	
	
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		Ship ship = new Ship();
		
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i<n; i++) {
			String data = sc.nextLine();
			ship.addCrew(ship.newName(data)[0], ship.newName(data)[1], ship.newComp(ship.newName(data)[1]));
		}
		ship.sortByCrew();
		System.out.println(ship.toString());

		
		sc.close();
	}
}
