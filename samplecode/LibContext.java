import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.text.*;
import java.io.*;
public class LibContext {
  
   
  private static LibContext context;
   
  private static JFrame LibFrame; 
   
 
 

  public JFrame getFrame()
  { return LibFrame;}

  private LibContext() { //constructor
    System.out.println("In Libcontext constructor");
     
    LibFrame = new JFrame("Library GUI");
	LibFrame.addWindowListener(new WindowAdapter()
       {public void windowClosing(WindowEvent e){System.exit(0);}});
    LibFrame.setSize(400,400);
    LibFrame.setLocation(400, 400);
    LibFrame.setVisible(true);
    }


  public static LibContext instance() {
    if (context == null) {
       System.out.println("calling constructor");
      context = new LibContext();
    }
    return context;
  }

  
  public static void main (String[] args){
    LibContext.instance(); 
    //states[currentState].run();
  }


}
