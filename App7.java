package Application1;

import java.util.Scanner;

public class App7 {

	public static void main(String[] args) {
	
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the string");
		String text=input.nextLine();
		
		switch(text){
		case "start": System.out.println("machine started");break;
		case "stop": System.out.println("Macachine stpped");break;
		default: System.out.println("Cannot regonized");
		
		
		}
		
		
	}

}
