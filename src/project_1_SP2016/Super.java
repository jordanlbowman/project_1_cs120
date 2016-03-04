//Super class holds the meat and potatos of the program. progstart prints the date and asks the user if they really want to proceed
//and prints the data from the last run. Then it asks your name once you tell it you're ready to go again.

package project_1_SP2016;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;


public class Super {
	public static String[] n;
	
	public static void progstart() throws IOException{
		//create a Date to allow program to get current date/time
		//adapted from http://www.tutorialpoints.com/java/java_date_time.htm
		Date dNow = new Date( );
		SimpleDateFormat ft =
		new SimpleDateFormat ("EEEEEEEE MMMMMMM dd, yyyy h:mm:ss a z");
		
		System.out.println("Program start\nRunning " + ft.format(dNow) + "\n"); //print line with date/time in console
		try {
			FileReader fr = new FileReader("fileout.txt");
			char [] read = new char [100];
			fr.read(read);
			for(char c : read) System.out.print(c);
			fr.close();
			System.out.println();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int yes_no = JOptionPane.showConfirmDialog(null, "Welcome! Are you ready?",
				 "Dialog", JOptionPane.YES_NO_OPTION); //adapted from https://docs.oracle.com/javase/tutorial/uiswing/components/dialog.html
		if(yes_no == JOptionPane.YES_OPTION){ 
			System.out.println("Awesome. Let's do this.");
			Super.name();
		}
		else if(yes_no == JOptionPane.NO_OPTION){ 
			System.out.println("Bye. Bye. Bye.");
			System.exit(0);
		}
	}
	
	private static void name (){
		String name = JOptionPane.showInputDialog("First thing's first. What's your first and last name?");
		if (name.matches( "([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)" )){ //adapted from http://www.java2s.com/Tutorial/Java/0120__Development/Validatethefirstnameandlastname.htm
			Super.n = name.split(" "); // split on space
			System.out.println(Super.n[0]);
			System.out.println(Super.n[1]); //borrowed from Deitel & Associates 
			
			Sub2.favorite();
		}
		else{
			Super.name();
		}
	}
		
}
