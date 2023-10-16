import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class ScrollBar extends Frame implements AdjustmentListener,ActionListener
{
    JScrollBar s1,s2,s3;
    JTextField t1,t2,t3;
    JLabel l1,l2,l3;
    JButton b;
    ScrollBar()
    {
        setVisible(true);
        setSize(500,500);
        t1=new JTextField(3);
        t2=new JTextField(3);
        t3=new JTextField(3);
        l1=new JLabel("Red");
        l2=new JLabel("Green");
        l3=new JLabel("Blue");
        
        b=new JButton("Exit.");
        s1=new JScrollBar();
        s1.setMinimum(0);
        s1.setMaximum(255);
        s1.setOrientation(JScrollBar.HORIZONTAL);
        s2=new JScrollBar();
        s2.setMinimum(0);
        s2.setMaximum(255);
        s2.setOrientation(JScrollBar.HORIZONTAL);
        s3=new JScrollBar();
        s3.setMinimum(0);
        s3.setMaximum(255);
        s3.setOrientation(JScrollBar.HORIZONTAL);

        Panel p=new Panel();
        p.setLayout(new GridLayout(3,3));
        p.add(l1); p.add(l2); p.add(l3);

        p.add(s1);  p.add(s2);
        p.add(s3);  p.add(t1);
        p.add(t2);
        p.add(t3);
        add(p,BorderLayout.NORTH);
        Panel p1=new Panel();
        p1.add(b);
        add(p1,BorderLayout.SOUTH);
        s1.addAdjustmentListener(this);
        s2.addAdjustmentListener(this);
        s3.addAdjustmentListener(this);
        b.addActionListener(this);
    }
    public void adjustmentValueChanged(AdjustmentEvent ae)
    {
        Color c=new Color(s1.getValue(),s2.getValue(),s3.getValue());
        t1.setText(""+s1.getValue());
        t2.setText(""+s2.getValue());
        t3.setText(""+s3.getValue());
        setBackground(c);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b){
            dispose();
        }
    }
    public static void main(String arg[]) {
        new ScrollBar();
        
    }
}