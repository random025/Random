import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CardLayoutDemo extends JFrame implements ActionListener
{
    CardLayout card;
Container c;
   public CardLayoutDemo()
    {
         c=getContentPane();
         card=new CardLayout();
           c.setLayout(card);
        JButton b1=new JButton("Button1");
        JButton b2=new JButton("Button2");
        JButton b3=new JButton("Button3");
        JButton b4=new JButton("Button4");
        JButton b5=new JButton("Button5");
         c.add("First Card",b1);
          c.add("Second Card",b2);
          c.add("Third Card",b3);
           c.add("Fourth Card",b4);
            c.add("Fifth Card",b5);
          b1.addActionListener(this);
           b2.addActionListener(this);
           b3.addActionListener(this);
           b4.addActionListener(this);
           b5.addActionListener(this);
         }
         public void actionPerformed(ActionEvent ae)
          {
             card.next(c);
            // card.show(c,"Third card");
          } 
        
     
public static void main(String args[])
  {
      CardLayoutDemo cdemo= new CardLayoutDemo();
       cdemo.setTitle("Card Layout");
        cdemo.setSize(400,200);
        cdemo.setVisible(true);
       cdemo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
 }