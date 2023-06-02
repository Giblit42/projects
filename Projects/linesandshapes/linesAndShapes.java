package linesandshapes;
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
public class linesAndShapes extends JPanel {
  public static void main(String[] args) {
   //let's setup the frame so we can keep adding to our program
   JFrame f = new JFrame("Twilight Zone");
   f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   f.getContentPane().add(new linesAndShapes());
   f.setSize(290, 325);
   f.setLocation(550, 25);
   f.setVisible(true);
  }

  public void paint(Graphics g) {
    //custom color
    String hexColor = new String("0x45e5B");
    g.setColor(Color.decode(hexColor));
    //draw a line (starting x,y; ending x,y)
    g.drawLine(10, 10, 40, 10);

    /* 
    //draw rectangle
    Graphics2D g2 = (Graphics2D) g;
    g2.drawRect(10, 20, 150, 40);
    g2.setColor(Color.decode(hexColor));
    //fill rectangle
    g2.fillRect(10, 20, 150, 40);
    */

    //rounded rectangle
    Graphics2D g2 = (Graphics2D) g;
    RoundRectangle2D rd = new RoundRectangle2D.Float(10, 20, 150, 40, 5, 5);
    g2.draw(rd);
    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    g2.fillRoundRect(10, 20, 150, 40, 15, 15);
  }
}