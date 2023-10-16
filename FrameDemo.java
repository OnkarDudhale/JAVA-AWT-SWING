import java.awt.*;
import java.awt.event.*;
class FrameDemo extends Frame implements ActionListener
{
    Label l1,l2;
    TextField t1,t2;
    Button b1,b2;
    FrameDemo()
    {
        setVisible(true);
        setSize(300,400);
        setLayout(new FlowLayout());
        setBackground(Color.orange);
        l1=new Label("Enter number:");
        l2=new Label("Result:");
        t1=new TextField(10);
        t2=new TextField(10);
        b1=new Button("Check negative or positive");
        b2=new Button("Close..");
        add(l1);
        add(l2);
        add(t1);
        add(t2);
        add(b1);
        add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae) 
    {
        if(ae.getSource()==b1)
        {
            int a=Integer.parseInt(t1.getText());
            if(a>0)
            t2.setText("Number is Positive..");
            else
            t2.setText("Number is Negative..");
        }
        if(ae.getSource()==b2)
        dispose();
        
    }
    public static void main(String arg[]){
    FrameDemo ob=new FrameDemo(); 
    }  
}