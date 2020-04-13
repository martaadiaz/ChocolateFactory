<<<<<<< HEAD
package ui;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import pojos.*;
import db.interfaces.*;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Menu {

	
	
	
	
	//Used for parsing dates
		private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		
		
		
		
		private static BufferedReader reader;

		public static void main(String[] args) throws Exception {
			// TODO Auto-generated method stub
			//LO SACO DE SQLSearch de jdbc YAYYY
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//PARA PREGUNTAR AL USUARIO is going to read form the screen
			System.out.println("Welcome");
			System.out.println("Who are u?");
			System.out.println("1.Willy Wonka");
			System.out.println("2.Oompa Loompa CEO");
			int choice = Integer.parseInt(reader.readLine());// SQLInsertPrepared
			switch(choice) {
			case 1:
				break;
			case 2:
				willyWonkaMenu();
				break;
			default	:
				break;
			}
		
			
			

		}
		
		private static void willyWonkaMenu() throws Exception{
			System.out.println("Which área of your marvelous factory Will you be attending today?");
			System.out.println("1. Clients");
			System.out.println("2. Chocolate");
			System.out.println("3. Workers");
			System.out.println("4. Animals ");
			
			int choice = Integer.parseInt(reader.readLine());
			switch(choice) {
			case 1:
				System.out.println("1. Add client");
				System.out.println("2. See client's iformation");
				System.out.println("3. Change information");
				System.out.println("4. Give a golden ticket ");
				System.out.println("4.  ");
				System.out.println("4. Animals ");
				break;
				// aqui habria que hacer un swithc???????????????????????????????????????????????????????????????????????
			case 2:
				
				break;
			case 3	:
				break;
			default:
				break;
			}
			
		}
}
=======
>>>>>>> branch 'master' of https://github.com/martaadiaz/ChocolateFactory
