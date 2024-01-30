import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardEventsDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Keyboard Events Demo");
        JTextField textField = new JTextField();

        textField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                // This method is called when a key is typed (pressed and released).
                char keyChar = e.getKeyChar();
                System.out.println("Key Typed: " + keyChar);
            }

            @Override
            public void keyPressed(KeyEvent e) {
                // This method is called when a key is pressed.
                int keyCode = e.getKeyCode();
                System.out.println("Key Pressed: " + KeyEvent.getKeyText(keyCode));
            }

            @Override
            public void keyReleased(KeyEvent e) {
                // This method is called when a key is released.
                int keyCode = e.getKeyCode();
                System.out.println("Key Released: " + KeyEvent.getKeyText(keyCode));
            }
        });

        frame.add(textField);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}