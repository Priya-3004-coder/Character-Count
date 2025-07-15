package count;
import java.awt.*;
import javax.swing.*;  
import java.awt.event.*;  
@SuppressWarnings("serial")
public class CharCount extends JFrame implements ActionListener
{  
    JLabel lb1,lb2,label;  
    JTextArea ta;  
    JButton b;  
    JButton bg,text;
    JLabel res;
    
    CharCount()
    {  
        super(" Word Count Tool ");
        label=new JLabel("WORD COUNT",JLabel.CENTER);
        label.setBounds(10,10,100,20);
        label.setFont(new Font("Serif",Font.BOLD,14));
        lb1=new JLabel("CHARACTERS: ");  
        lb1.setBounds(50,50,100,20);  
        lb2=new JLabel("WORDS: ");  
        lb2.setBounds(50,80,100,20);  
        res=new JLabel();
        res.setBounds(70,600,90,100);
        res.setFont(new Font("Italic",Font.BOLD,14)); 
        
        ta=new JTextArea();  
        ta.setBounds(70,120,450,450);
        ta.setLayout(null);
        ta.setVisible(true);
        b=new JButton("click");  
        b.setBounds(70,600, 60,40);  
        b.addActionListener(this);  
      
        bg=new JButton("Background Color");  
        bg.setBounds(160,600, 90,40);  
        bg.addActionListener(this);  
  
        text=new JButton("Text Color");  
        text.setBounds(280,600, 90,40);  
        text.addActionListener(this);
        
        add(lb1);
        add(lb2);
        add(ta);
        add(b);
        add(bg);
        add(text);  
        add(label);
        add(res);
        
        setSize(500,500);
        setLayout(null);//using no layout manager  
        setVisible(true);  
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
    }  
    public void actionPerformed(ActionEvent e)
    {  
        if(e.getSource()==b)
        {  
            String text=ta.getText();  
            lb1.setText("CHARACTERS: "+text.length());  
            String words[]=text.split("\\s");  
            lb2.setText("WORDS: "+words.length); 
            res.setText("calc success");
      
        }
        else if(e.getSource()==bg)
        {  
            Color c=JColorChooser.showDialog(this,"Choose Color",Color.BLACK);  
            ta.setBackground(c); 
            res.setText("BGC added");
        }
        else if(e.getSource()==text)
        {  
            Color c=JColorChooser.showDialog(this,"Choose Color",Color.BLACK);  
            ta.setForeground(c);  
            res.setText("TC added");
            
        }  
    }  
    public static void main(String[] args) 
    {  
        new CharCount();  
    }
}  
