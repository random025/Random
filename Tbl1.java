import java.io.*;

import java.util.*;

import java.awt.*;

import javax.swing.*;

import javax.swing.event.*;

class A extends JFrame 
{
  
public A () 
  {
    
setSize (400, 400);
    
setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    
GridLayout g = new GridLayout (0, 3);
    
setLayout (g);
    
try 
    {
      
FileInputStream fin = new FileInputStream ("C:\\Users\\Admin\\Documents\\227R1A1279");
      
Scanner sc = new Scanner (fin).useDelimiter (",");
      
String[]arrayList;
      
String a;
      
while (sc.hasNextLine ())
	
	{
	  
a = sc.nextLine ();
	  
arrayList = a.split (",");
	
for (String i:arrayList)
	    
	    {
	      
add (new JLabel (i));
	    
}
	
}
    
}
    
catch (Exception ex) 
    {
    
}
    
setDefaultLookAndFeelDecorated (true);
    
pack ();
    
setVisible (true);
  
}

}


public class Tbl1
{
  
public static void main (String[] 
 args) 
  {
    
A a = new A ();

} 
}
