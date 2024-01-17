import java.awt.*;
import javax.swing.*;
public class GridLayoutDemo extends JFrame
{
   public GridLayoutDemo()
    {
        Container c=getContentPane();
        GridLayout grid=new GridLayout(2,3);
           c.setLayout(grid);
        JButton b1=new JButton("Button1");
        JButton b2=new JButton("Button2");
        JButton b3=new JButton("Button3");
        JButton b4=new JButton("Button4");
        JButton b5=new JButton("Button5");
        JButton b6=new JButton("Button6");
         c.add(b1);
          c.add(b2);
          c.add(b3);
           c.add(b4);
            c.add(b5);
          c.add(b6);
        setTitle("Grid Layout");
        setSize(400,200);
        setVisible(true);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }
public static void main(String args[])
  {
       new GridLayoutDemo();
   }
 }