//Driver drives the program. It starts each piece after they return to Driver.
package project_1_SP2016;

import java.io.IOException;

public class Driver {

	public static void main(String[] args) throws IOException {
		Super.progstart(); //Starts the main part of the program
		Sub1.Jf_yes(); //JFrame with images and labels
		Sub1.print(); //method to write to text file
	}
}
