import java.awt.*;
import java.awt.event.*;
class NotePad extends Frame implements ActionListener
{
    TextArea ta;
    Menu file,edit,view,help,format;
    MenuItem open,font,cut,copy,paste,save,saveAs,New,size,color,contact,selectAll,print,exit;
    MenuBar mb;
    Font f;
    NotePad()
    {
        setVisible(true);
        setSize(1000,1000);
        f=new Font("Monospaced",Font.BOLD,25);
        mb=new MenuBar();
        ta=new TextArea();
        ta.setFont(f);
        file=new Menu("File");
        edit=new Menu("Edit");
        view=new Menu("View");
        help=new Menu("Help");
        format=new Menu("Format");

        open=new MenuItem("Open");
        save=new MenuItem("Save");
        size=new MenuItem("Size");
        color=new MenuItem("Color");
        font=new MenuItem("Font");
        contact=new MenuItem("Contact");
        selectAll=new MenuItem("SelectAll");
        saveAs=new MenuItem("SaveAs");
        cut=new MenuItem("Cut");
        copy=new MenuItem("Copy");
        paste=new MenuItem("Paste");
        New=new MenuItem("New");
        print=new MenuItem("Print");
        exit=new MenuItem("Exit");

       file.add(open);
       file.add(save);
       file.add(saveAs);
       file.add(New);
       file.add(print);
       file.add(exit);

       view.add(size);

       format.add(font);
       format.add(color);

       help.add(contact);

       edit.add(cut);
       edit.add(copy);
       edit.add(paste);
       edit.add(selectAll);

       add(ta);
       mb.add(file);
       mb.add(edit);
       mb.add(view);
       mb.add(help);
       mb.add(format);

       setMenuBar(mb);
       exit.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==exit);
        dispose();
    }
    public static void main(String arg[]){
        new NotePad();
    }
}