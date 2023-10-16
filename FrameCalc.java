import java.awt.*;
import java.awt.event.*;
class FrameCalc extends Frame implements ActionListener
{
    TextField t1;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bcal,bexit,bmul,bdiv,bplus,bminus,bmod;
    Panel p1;
    
    Float n,m,c;
    int ch;
    FrameCalc()
    {
    setVisible(true);
    setSize(500,500);
    setTitle("Calculator");
    setBackground(Color.orange);
    setLayout(new FlowLayout());
    b1=new Button("1");
    b2=new Button("2");
    b3=new Button("3");
    b4=new Button("4");
    b5=new Button("5");
    b6=new Button("6");
    b7=new Button("7");
    b8=new Button("8");
    b9=new Button("9");
    b0=new Button("0");
    bcal=new Button("calculate");
    bexit=new Button("Exit");
    bmod=new Button("%");
    bdiv=new Button("/");
    bplus=new Button("+");
    bminus=new Button("-");
    bmul=new Button("*");
    t1=new TextField(20);
    p1=new Panel();
    p1.setLayout(new GridLayout(4,4,10,20));
    p1.add(b1);p1.add(b2);p1.add(b3);p1.add(b4);p1.add(b5);p1.add(b6);p1.add(b7);
   p1.add(b8);p1.add(b9);p1.add(b0);p1.add(bdiv);p1.add(bmul);p1.add(bplus);p1.add(bminus);p1.add(bmod);p1.add(bcal);
   p1.add(bexit);
   add(p1);
   add(t1);
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(this);
    b5.addActionListener(this);
    b6.addActionListener(this);
    b7.addActionListener(this);
    b8.addActionListener(this);
    b9.addActionListener(this);
    b0.addActionListener(this);
    bexit.addActionListener(this);
    bcal.addActionListener(this);
    bmul.addActionListener(this);
    bdiv.addActionListener(this);
    bminus.addActionListener(this);
    bplus.addActionListener(this);
    bmod.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==b1)
           t1.setText(t1.getText()+"1");
        if(ae.getSource()==b2)
           t1.setText(t1.getText()+"2");
        if(ae.getSource()==b3)
           t1.setText(t1.getText()+"3");
        if(ae.getSource()==b4)
           t1.setText(t1.getText()+"4");
        if(ae.getSource()==b5)
           t1.setText(t1.getText()+"5");
        if(ae.getSource()==b6)
           t1.setText(t1.getText()+"6");
        if(ae.getSource()==b7)
           t1.setText(t1.getText()+"7");
        if(ae.getSource()==b8)
           t1.setText(t1.getText()+"8");
        if(ae.getSource()==b9)
           t1.setText(t1.getText()+"9");
        if(ae.getSource()==b0)
           t1.setText(t1.getText()+"0");
        if(ae.getSource()==bplus)
        {
            ch=1;
            n=Float.parseFloat(t1.getText());
            t1.setText("");
        }
        if(ae.getSource()==bminus)
        {
            ch=2;
            n=Float.parseFloat(t1.getText());
            t1.setText("");
        }
        if(ae.getSource()==bmul)
        {
            ch=3;
            n=Float.parseFloat(t1.getText());
            t1.setText("");
        }
        if(ae.getSource()==bdiv)
        {
            ch=4;
            n=Float.parseFloat(t1.getText());
            t1.setText("");
        }
        if(ae.getSource()==bmod)
        {
            ch=5;
            n=Float.parseFloat(t1.getText());
            t1.setText("");
        }
        if(ae.getSource()==bcal)
        {
            m=Float.parseFloat(t1.getText());
            switch(ch)
            {
            case 1:c=m+n;break;
            case 2:c=m-n;break;
            case 3:c=m*n;break;
            case 4:c=m/n;break;
            case 5:c=m%n;break;
            }
        t1.setText(""+c);  
        }  
        if(ae.getSource()==bexit)
        dispose();
    }  
    
    public static void main(String arg[]) {
        new FrameCalc(); 
    }
}