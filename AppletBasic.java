/*
important to note that Java Applets have been largely deprecated and are no longer supported in modern
web browsers. Applets were a technology used in the past for embedding Java applications in web pages.
this code will likely not work because Applets are no longer supported.
*/
import java.applet.*;
import java.awt.*;
public class AppletBasic extends Applet
{
    public void paint(Graphics g)
    {
       Font f=new Font("Gigi",Font.BOLD,25);
       g.setFont(f);
       g.drawString("Welcome to Ty",100,50);
       g.drawRect(100,100, 100, 150);
       g.setColor(Color.CYAN);
       g.fillRect(10, 10, 50, 150);
       g.drawOval(300, 200, 50, 100);
       g.fillOval(350, 200, 50, 100);
       g.drawLine(10, 300, 500, 350);
       g.setColor(Color.BLUE);
       g.drawArc(40, 400, 100, 150, 90, 290);

    }
}
