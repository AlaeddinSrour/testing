package testing;

import javax.swing.JOptionPane;

//import javax.swing.JOptionPane;

public class Algws {
	
	static int anzahlZeichen(String str, char c) {
		
		int count = 0;
		
		for (int i = 0; i < str.length(); i++) {
			
			if (str.indexOf(i)== c) {
				count++;
			}
			
			
		}
		return count;
		
		
		
	}
	
	static String [] eingabe () {
		
		String input =JOptionPane.showInputDialog("saddas");
		
		String [] arr =input.split(" ");
		

		
		return arr;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] eingaben = eingabe();
		
		int num = anzahlZeichen(eingaben[0],eingaben[1].charAt(0) );
		
	
		System.out.println(num);

	}

}
