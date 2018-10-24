//mio il programma, miei i commenti. wooooauuuuw!

package it.marconicivitavecchia.as2018_19.c5Binf;
import javax.swing.*;

public class Main extends JFrame {
	
	public Main() {
		super("Project X");
		super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		// Use string builder for speed and memory
		StringBuilder sb = new StringBuilder();
		sb.append("<html>");
		sb.append("<h1>Command list</h1>");
		// create a table
		sb.append("<div style='display:table'>");
		
		// create a row
		sb.append("<div style='display:table-row'>");
		
		sb.append("<div style='display:table-cell'>");
		sb.append("Name");
		sb.append("</div>");
		sb.append("<div style='display:table-cell'>");
		sb.append("Description");
		sb.append("</div>");
		
		sb.append("</div>");
		
		sb.append("</div>");
		sb.append("</html>");
		
		// convert string builder to string when done with string manipulation
		String htmlText = sb.toString();
		
		super.add(new JLabel(htmlText));
		super.pack();
		super.setVisible(true);
		 
		System.out.println("I am a monolithics application written in Java Swing.");
		
		
	}
	
	public static void main (String[] args) {
		new Main();
	}
}

