//Sub2 is a SubClass of the Superclass super. Sub2 includes all the methods with JOptionPanes of the different animals, states,
//schools, and NFL teams you can choose from.

package project_1_SP2016;

import javax.swing.JOptionPane;

public class Sub2 extends Super{
	//Variables
	public static String [] favorite = {
			null,null,null,null,null};
	
	public static String[] favorite(){
		school();//calls the school method
		NFL_team();//calls the NFL method
		animal();//calls the animal method
		states();//calls the states method
		return favorite;
	}
	private static void animal(){
		String[] animals = {
				"Bear","Bunny","Domestic Cat","Human","Labradorca","Zebra"};
		Sub2.favorite[0] = (String) JOptionPane.showInputDialog(null, "What's your favorite animal?",
				 "Animals?", JOptionPane.QUESTION_MESSAGE, null, animals, animals[3]); 
		 			//creates JOptionPane with a dropdown of animals 
		//return animal;
	}

	private static void states(){
		String[] states = { //initializes an array of states
				"Alabama","Alaska","Arizona","Arkansas","California","Colorado","Connecticut","Delaware","Florida","Georgia","Hawaii","Idaho","Illinois","Indiana","Iowa","Kansas","Kentucky","Louisiana","Maine","Maryland","Massachusetts","Michigan","Minnesota","Mississippi","Missouri","Montana","Nebraska","Nevada","New Hampshire","New Jersey","New Mexico","New York","North Carolina","North Dakota","Ohio","Oklahoma","Oregon","Pennsylvania","Rhode Island","South Carolina","South Dakota","Tennessee","Texas","Utah","Vermont","Virginia","Washington","West Virginia","Wisconsin","Wyoming"};
		//adapted from http://www.java2s.com/Tutorial/Java/0240__Swing/Todisplaysadialogwithalistofchoicesinadropdownlistbox.htm
		 Sub2.favorite[1] = (String) JOptionPane.showInputDialog(null, "What's your favorite state?",
						 "States?", JOptionPane.QUESTION_MESSAGE, null, states, states[0]); 
				 			//creates JOptionPane with a dropdown of states 
		//return state;
	}
	
	private static void school(){
		String[] schools = { //initlializes an array of schools
				"Carroll College","Montana Tech", "University of Montana", "Montana State", "Rocky Mountain College"};
		Sub2.favorite[2] = (String) JOptionPane.showInputDialog(null, "What's your favorite place of higher education in the state of Montana?",
				 "Schools?", JOptionPane.QUESTION_MESSAGE, null, schools, schools[1]);
	}
	
	private static void NFL_team(){
		String [] teams = {"Arizona Cardinals", "Atlanta Falcons","Baltimore Ravens","Buffalo Bills","Carolina Panthers","Chicago Bears","Cincinnati Bengals","Cleveland Browns","Dallas Cowboys","Denver Broncos","Detroit Lions","Green Bay Packers","Houston Texans","Indianapolis Colts","Jacksonville Jaguars","Kansas City Chiefs","Miami Dolphins","Minnesota Vikings","New England Patriots","New Orleans Saints","New York Giants","New York Jets","Oakland Raiders","Philadelphia Eagles","Pittsburgh Steelers","San Diego Chargers","San Francisco 49ers","Seattle Seahawks","St. Louis Rams","Tampa Bay Buccaneers","Tennessee Titans","Washington Redskins"};
		Sub2.favorite[3] = (String) JOptionPane.showInputDialog(null, "What is your team?", "Question",
			 	JOptionPane.QUESTION_MESSAGE, null, teams, teams[0]); //JOptionPane with dropdown of NFL Teams
		String [] teams_files = {
				"Arizona_Cardinals.jpg","Atlanta_Falcons.jpg","Baltimore_Ravens.jpg","Buffalo_Bills.jpg","Carolina_Panthers.jpg","Chicago_Bears.jpg","Cincinnati_Bengals.jpg","Cleveland_Browns.jpg","Dallas_Cowboys.jpg","Denver_Broncos.jpg","Detroit_Lions.jpg","Green_Bay_Packers.jpg","Houston_Texans.jpg","Indianapolis_Colts.jpg","Jacksonville_Jaguars.jpg","Kansas_City_Chiefs.jpg","Miami_Dolphins.jpg","Minnesota_Vikings.jpg","New_England_Patriots.jpg","New_Orleans_Saints.jpg","New_York_Giants.jpg","New_York_Jets.jpg","Oakland_Raiders.jpg","Philadelphia_Eagles.jpg","Pittsburgh_Steelers.jpg","San_Diego_Chargers.jpg","San_Francisco_49ers.jpg","Seattle_Seahawks.jpg","St_Louis_Rams.jpg","Tampa_Bay_Buccaneers.jpg","Tennessee_Titans.jpg","Washington_Redskins.jpg"
				}; //array of all of the file names for each team's logo
		int team_id = 0;
		for(int i = 0; i < teams.length; i++){ //for loop that goes through each column of the teams array
			 if(Sub2.favorite[3].equals(teams[i])){ //if statement for when it gets to your team
				 team_id = i;}}
		Sub2.favorite[4] = teams_files[team_id];
	}

	
}
