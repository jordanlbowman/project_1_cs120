//Sub1 and Sub2 should have been reversed. Sub1 holds all of the Graphics including JFrame, JLabels, ImageIcon, and all of the PrintWriter stuffs.
//All of the methods in Sub1 run after the methods in Sub2.

package project_1_SP2016;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Sub1 extends Super{
		
	public static void Jf_yes (){
		JFrame.setDefaultLookAndFeelDecorated(true);
	    JFrame jf = new JFrame("Hello");
	    //adapted from https://docs.oracle.com/javase/tutorial/uiswing/components/label.html
	    jf.add(new JLabel(Sub2.favorite[0],JLabel.CENTER));	 
	    jf.add(new JLabel(new ImageIcon("src/animals/"+Sub2.favorite[0]+".jpg")));
	    jf.add(new JLabel(Sub2.favorite[1],JLabel.CENTER));
	    jf.add(new JLabel(new ImageIcon("src/states/state-"+Sub2.favorite[1]+".png")));
	    jf.add(new JLabel(Sub2.favorite[2],JLabel.CENTER));
	    jf.add(new JLabel(new ImageIcon("src/school/"+Sub2.favorite[2]+".jpg")));
	    jf.add(new JLabel(Sub2.favorite[3],JLabel.CENTER));
	    jf.add(new JLabel(new ImageIcon("src/NFL_logos/"+Sub2.favorite[4])));
	    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    jf.setLayout(new GridLayout(0,2));
	    //adapted from https://docs.oracle.com/javase/tutorial/uiswing/layout/grid.html
	    jf.setMinimumSize(new Dimension(400,600));
	    jf.setLocationRelativeTo(null);
	    jf.setVisible(true);
	    //System.out.println(Super.n);
	}
	public static void print() {
		//write to text file method
		try {

			PrintWriter writer = new PrintWriter("fileout.txt", "UTF-8");
			writer.println(Super.n[0]);
			writer.println(Super.n[1]);
			Random rand = new Random(); //random numbers brought to you by http://stackoverflow.com/questions/5887709/getting-random-numbers-in-java
			writer.println(rand.nextInt(100000));
			writer.println(Sub2.favorite[0]);
			writer.println(Sub2.favorite[1]);
			writer.println(Sub2.favorite[2]);
			writer.println(Sub2.favorite[3]);
			Date dNow = new Date();
			writer.println(dNow);
			writer.close();

			System.out.println("Done");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

