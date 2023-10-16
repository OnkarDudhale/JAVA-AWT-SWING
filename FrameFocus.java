import java.awt.*;
import java.awt.event.*;
class FrameFocus extends Frame implements FocusListener
{
    TextField t1,t2,t3,t4;
    Label l1,l2,l3,l4;
    FrameFocus()
    {
        setVisible(true);
        setBackground(Color.CYAN);
        setSize(400,300);
        setLayout(new FlowLayout());
        t1=new TextField(10);
        t2=new TextField(10);
        t3=new TextField(10);
        t4=new TextField(10);
        
        l1=new Label("Enter num 1:");
        l2=new Label("Enter num 2:");
        l3=new Label("addition:");
        l4=new Label("multiplication:");

        add(t1);add(t2);add(t3);add(t4);add(l1);add(l2);add(l3);add(l4);
        t1.addFocusListener(this);
        t2.addFocusListener(this);
        t3.addFocusListener(this);
        t4.addFocusListener(this);      
    }
    public void focusLost(FocusEvent fe) {
         if(fe.getSource()==t1)
         t1.setBackground(Color.yellow);
         if(fe.getSource()==t2)
         t2.setBackground(Color.green);
        
    }
    public void focusGained(FocusEvent fe) {
        if(fe.getSource()==t1)
        t1.setBackground(Color.BLUE);
        if(fe.getSource()==t2)
        t2.setBackground(Color.GREEN);
        if(fe.getSource()==t3)
        {
            int a=Integer.parseInt(t1.getText());
            int b=Integer.parseInt(t2.getText());
            int c=a+b;
            t3.setText(""+c);
        }
        if(fe.getSource()==t4)
        {
            int m=Integer.parseInt(t1.getText());
            int n=Integer.parseInt(t2.getText());
            int x=m*n;
            t4.setText(""+x);
        }
       } 
    public static void main(String arg[]) {
        new FrameFocus();
    }
}
