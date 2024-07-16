package NotePad;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Note extends JFrame implements ActionListener{
    JMenu File,Edit,Help;
    JMenuBar mb;
    JMenuItem cut,copy,paste,selectAll;
    JTextArea text;
    Note(){

        File=new JMenu("File");
        Edit=new JMenu("Edit");
        Help=new JMenu("Help");
        cut=new JMenuItem("cut");
        copy=new JMenuItem("copy");
        paste=new JMenuItem("paste");
        selectAll=new JMenuItem("selectAll");
//        //cut.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent actionEvent) {
//
//            }
//        });
        mb=new JMenuBar();
        Edit.add(cut);Edit.add(copy);Edit.add(paste);Edit.add(selectAll);
        mb.add(File);mb.add(Edit);mb.add(Help);
        text=new JTextArea();
        text.setBounds(5,5,360,320);
        setJMenuBar(mb);
        add(text);

        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        selectAll.addActionListener(this);
        setSize(500,400);
        setVisible(true);
        setLayout(null);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==copy){
            text.copy();
        } else if (e.getSource()==paste) {
            text.paste();

        } else if (e.getSource()==cut) {
            text.cut();
        } else if (e.getSource()==selectAll) {
            text.selectAll();
        }
    }
    public static void main(String[] args){
        new Note();
    }
}
