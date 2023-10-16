import java.awt.*;
import java.awt.event.*;
class FrameTable extends Frame implements ActionListener
{
    Label l1,l2;
    TextField t1;
    List L1;
    Button b1,b2;
    FrameTable()
    {
    setVisible(true);
    setSize(900,400);
    setBackground(Color.pink);
    setLayout(new FlowLayout());
    l1=new Label("Table:");
    l2=new Label("Enter Number");
    b1=new Button("calculate");
    b2=new Button("Exit");
    L1=new List(10);
    t1=new TextField(5);
    add(l1); add(L1); add(l2); add(t1); add(b1); add(b2);
    b1.addActionListener(this);
    b2.addActionListener(this);
    }
    public void  actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
       {
        int num=Integer.parseInt(t1.getText());  
            for(int i=1;i<=10;i++)
            {
               int t=num*i;
               L1.add(""+t);
            }
       }
       if(ae.getSource()==b2)
       dispose();
    }
    public static void main(String arg[]) {
        new FrameTable(); 
    }
}