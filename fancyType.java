package fancyType;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;
import java.util.Arrays;
import java.io.FileWriter;
import java.io.IOException;


public class fancyType {

	public static void main(String[] args) throws InterruptedException {

		
		Scanner userIn = new Scanner(System.in);
		
		System.out.print("Type your word: ");
		String word = userIn.nextLine();
		
		// OUR LAST OUTPUT
		String result = "";
		
		// THE CHARACTERS 
		String[] alphabet = {
						"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", 
						"M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", 
						"Y", "Z", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", 
						"k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", 
						"w", "x", "y", "z", "0", "1", "2", "3", "4", "5", "6", "7", 
						"8", "9", " "
						};

			// USER INPUT LENGTH
			for(int j = 0; j < word.length(); j++) {
				
				String currentChar = String.valueOf(word.charAt(j)); //CHATGPT made this part
				
				// ALPHABET FOR LOOP
				for(int i = 0; i < 63 ;i++) {
					
					// SLOWİNG DOWN THE PROGRAM SO WE CAN SEE 
					Thread.sleep(10);
					
				if(alphabet[i].equals(currentChar)) {
					
					result = result + alphabet[i];
					System.out.println(result);
					break;
					
					}
				
				else {
					
					System.out.println(result + alphabet[i]);
					
					}
				
				}
			
			}
			
		}

}
