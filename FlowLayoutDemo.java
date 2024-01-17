import java.awt.*;
import javax.swing.*;
public class FlowLayoutDemo extends JFrame
{
   public FlowLayoutDemo()
    {
        Container c=getContentPane();
        FlowLayout obj=new FlowLayout();
           c.setLayout(obj);
        JButton b1=new JButton("Button1");
        JButton b2=new JButton("Button2");
        JButton b3=new JButton("Button3");
        JButton b4=new JButton("Button4");
        JButton b5=new JButton("Button5");
         c.add(b1);
          c.add(b2);
          c.add(b3);
           c.add(b4);
            c.add(b5);
        setTitle("FlowLayout");
        setSize(400,200);
        setVisible(true);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }
public static void main(String args[])
  {
      new FlowLayoutDemo();
   }
 }