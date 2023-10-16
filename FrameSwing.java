import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class FrameSwing extends JFrame implements ActionListener
{
    JButton b1,b2;
    JTextField t1;
    JPasswordField t2;
    JLabel l1,l2;
    Font f1;
    FrameSwing()
    {
        setVisible(true);
        setSize(500,500);
        setLayout(new FlowLayout());

        b1=new JButton("Login");
        b2=new JButton("Reset");
        t1=new JTextField(10);
        t2=new JPasswordField(10);
        l1=new JLabel("Enter User name");
        l2=new JLabel("Enter PassWord");

        f1=new Font("Monospaced",Font.BOLD,15);
        t1.setFont(f1);

        Panel p=new Panel();
        p.setBackground(Color.CYAN);
        p.setLayout(new GridLayout(3,2));
        p.add(l1); p.add(t1); p.add(l2); p.add(t2); p.add(b1); p.add(b2); add(p);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==b1)
        {
            String m=t1.getText();
            String n=t2.getText();//getPassWord(); but they cannot convert
            if(m.equals("Onkar")&&n.equals("Onkar@123"))
            {
                JOptionPane.showMessageDialog(this,"Login successfull");
            }
            else
            {
                
                if(m.equals("Onkar"))
                {
                    JOptionPane.showMessageDialog(this,"Invalid PassWord..");
                    t2.setText("");
                }
                else if(n.equals("Onkar@123"))
                {
                    JOptionPane.showMessageDialog(this,"Invalid User name..");
                    t1.setText("");
                }
                else
                {
                   JOptionPane.showMessageDialog(this,"Login Data Invalid");
                   t1.setText("");
                   t2.setText("");
                }
            }
        }
        if(ae.getSource()==b2)
        {
            t1.setText("");
            t2.setText("");
        }
        
    }
    public static void main(String arg[]){
        new FrameSwing();
    }

}