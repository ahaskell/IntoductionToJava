// Exercise 10.11 Solution: PigLatin.java
// Program translates English to Pig Latin.

// Java core packages
import java.awt.*;
import java.awt.event.*;
import java.util.*;

// Java extension packages
import javax.swing.*;

public class PigLatin extends JFrame {
   private JLabel prompt;
   private JTextField inputField;
   private JTextArea outputArea;
   private int count;

   // constructor
   public PigLatin()
   {
      super( "Pig Latin Generator" );
      prompt = new JLabel( "Enter English phrase:" );
      //TODO: Using a method that already exists set inputField equal to a new input field
      //inputField = 
      
      outputArea = new JTextArea( 10, 30 );
      
      //TODO: Using some method on the output area make it so users can not edit it
      
      
      //TODO: The GUI is represented by a container, we've supplied that code for you. 
      //Using the supplied Container add the label, the input field and the output area
      //so it all displays on the screen when run
      
      Container container = getContentPane();
      container.setLayout( new FlowLayout() );
      

      setSize( 500, 150 );
      show();

   }  // end constructor

   private JTextField createInputField() {
	   JTextField input = new JTextField( 30 );
	   input.addActionListener(

	         // anonymous inner class
	         new ActionListener() {

	            // translate user input
	            public void actionPerformed( ActionEvent event )
	            {
	               String inputString =
	                  event.getActionCommand().toString();
	               StringTokenizer tokens =
	                  new StringTokenizer( inputString );

	               count = tokens.countTokens();

	               while ( tokens.hasMoreTokens() ) {
	                  count--;
	                  printLatinWord( tokens.nextToken() );
	               }
	            }

	         }  // end anonymous inner class

	      ); // end call to addActionListener
	   return input;
}

// translate English into Pig Latin
   private void printLatinWord( String token )
   {
      char letters[] = token.toCharArray();
      StringBuffer translation = new StringBuffer();

      translation.append( letters, 1, letters.length - 1 ) ;
      translation.append( Character.toLowerCase( letters[ 0 ] ) );
      translation.append( "ay" );

      outputArea.append( translation.toString() + " " );

      if ( count == 0 )
         outputArea.append( "\n" );

   }  // end method printLatinWord

   // execute application
   public static void main( String args[] )
   {
      PigLatin app = new PigLatin();

      app.addWindowListener(

         // anonymous inner class
         new WindowAdapter() {

            // terminate application when user closes window
            public void windowClosing( WindowEvent e )
            {
               System.exit( 0 );
            }

         }  // end anonymous inner class

      ); // end call to addWindowListener

   }  // end method main

}  // end class PigLatin