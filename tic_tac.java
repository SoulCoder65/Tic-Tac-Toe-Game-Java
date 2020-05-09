
import javax.swing.JFrame;

import java.awt.Color;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
class Tic extends JFrame 
{
    int n=0,l,draw=0;
    //BUTTONS
    JButton b1=new JButton();
    JButton b2=new JButton();
    JButton b3=new JButton();
    JButton b4=new JButton();
    JButton b5=new JButton();
    JButton b6=new JButton();
    JButton b7=new JButton();
    JButton b8=new JButton();
    JButton b9=new JButton();
    JButton start=new JButton("New Game");
    Font fo;
    
    //TEXTFIELD
    JTextField winner=new JTextField();
    
    Tic()
    {
        //VIEW
        setSize(410, 450);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(3);
        setResizable(false);
    
        //BOUNDS
        b1.setBounds(80, 50, 80, 80);
        b2.setBounds(161, 50, 80, 80);
        b3.setBounds(242, 50, 80, 80);
        b4.setBounds(80, 131, 80, 80);
        b5.setBounds(161, 131, 80, 80);
        b6.setBounds(242, 131, 80, 80);
        b7.setBounds(80, 212, 80, 80);
        b8.setBounds(161, 212, 80, 80);
        b9.setBounds(242, 212, 80, 80);
        start.setBounds(140, 320, 130, 40);
        winner.setBounds(110, 380, 190, 30);
        
        //FONT SIZE
        fo=new Font("Biaukai",Font.ITALIC, 25);
        b1.setFont(fo);
        b2.setFont(fo);
        b3.setFont(fo);
        b4.setFont(fo);
        b5.setFont(fo);
        b6.setFont(fo);
        b7.setFont(fo);
        b8.setFont(fo);
        b9.setFont(fo);
        
        	    
        
        
        //BACKGROUND COLOR
        b1.setBackground(new Color(229, 255, 204));
        b2.setBackground(new Color(229, 255, 204));
        b3.setBackground(new Color(229, 255, 204));
        b4.setBackground(new Color(229, 255, 204));
        b5.setBackground(new Color(229, 255, 204));
        b6.setBackground(new Color(229, 255, 204));
        b7.setBackground(new Color(229, 255, 204));
        b8.setBackground(new Color(229, 255, 204));
        b9.setBackground(new Color(229, 255, 204));
        getContentPane().setBackground(new Color(153,204,255));
        
        //ADD
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(start);
        add(winner); 
        
        //ACTIONLISTENER
        b1.addActionListener(new C1());
        b2.addActionListener(new C2());
        b3.addActionListener(new C3());
        b4.addActionListener(new C4());
        b5.addActionListener(new C5());
        b6.addActionListener(new C6());
        b7.addActionListener(new C7());
        b8.addActionListener(new C8());
        b9.addActionListener(new C9());
        start.addActionListener(new Start());
        
    }

    //CHECKING
    public int check()
        {
            draw++;
            //FOR PLAYER A
            if(b1.getText()=="X"&&b2.getText()=="X"&&b3.getText()=="X")
            {
                return 1;
            }
            else if(b1.getText()=="X"&&b4.getText()=="X"&&b7.getText()=="X")
            {
                return 1;
            }
            else if(b1.getText()=="X"&&b5.getText()=="X"&&b9.getText()=="X")
            {
                return 1;
            }
            else if(b2.getText()=="X"&&b5.getText()=="X"&&b8.getText()=="X")
            {
                return 1;
            }
            else if(b3.getText()=="X"&&b5.getText()=="X"&&b7.getText()=="X")
            {
                return 1;
            }
            else if(b3.getText()=="X"&&b6.getText()=="X"&&b9.getText()=="X")
            {
                return 1;
            }
            else if(b4.getText()=="X"&&b5.getText()=="X"&&b6.getText()=="X")
            {
                return 1;
            }
            else if(b7.getText()=="X"&&b8.getText()=="X"&&b9.getText()=="X")
            {
                return 1;
            }

            //FOR PLAYER B
            else if(b1.getText()=="O"&&b2.getText()=="O"&&b3.getText()=="O")
            {
                return 2;
            }
            else if(b1.getText()=="O"&&b4.getText()=="O"&&b7.getText()=="O")
            {
                return 2;
            }
            else if(b1.getText()=="O"&&b5.getText()=="O"&&b9.getText()=="O")
            {
                return 2;
            }
            else if(b2.getText()=="O"&&b5.getText()=="O"&&b8.getText()=="O")
            {
                return 2;
            }
            else if(b3.getText()=="O"&&b5.getText()=="O"&&b7.getText()=="O")
            {
                return 2;
            }
            else if(b3.getText()=="O"&&b6.getText()=="O"&&b9.getText()=="O")
            {
                return 2;
            }
            else if(b4.getText()=="O"&&b5.getText()=="O"&&b6.getText()=="O")
            {
                return 2;
            }
            else if(b7.getText()=="O"&&b8.getText()=="O"&&b9.getText()=="O")
            {
                return 1;
            }
            else if(draw==9)
            {
                return 3;
            }
            else
            {
                return 0;
            }
        }
        public void AfterMatch()
        {   
            //DISABLE BUTTONS AFTER MATCH
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
            
    }
    //CALLING CLASSESS
     class C1 implements ActionListener
        {
            public void actionPerformed(ActionEvent e)
            {
                if(n==0)
                {
                    b1.setText("X");
                    n=1;
                    b1.setEnabled(false);
                    l=check();
                    if(l==1)
                    {
                        JOptionPane.showMessageDialog(b1,"PLAYER A WON!!");
                        winner.setText("Player A won!!");
                        AfterMatch();
                    } 
                    else if(l==2)
                    {
                        JOptionPane.showMessageDialog(b1,"PLAYER b WON!!");
                        winner.setText("Player B won!!");
                        AfterMatch();
                    }
                    else if(l==3)
                    {
                        winner.setText("Match draw!!");
                    }
                          
                }
                else
                {
                    b1.setText("O");
                    n=0;
                    b1.setEnabled(false);
                    l=check();
                    if(l==1)
                    {
                        JOptionPane.showMessageDialog(b1,"PLAYER A WON!!");
                        winner.setText("Player A won!!");
                        AfterMatch();
                    } 
                    else if(l==2)
                    {
                        JOptionPane.showMessageDialog(b1,"PLAYER B WON!!");
                        winner.setText("Player B won!!");
                        AfterMatch();
                    }
                    else if(l==3)
                    {
                        winner.setText("Match draw!!");
                        
                    }
                }
             }
        }
    class C2 implements ActionListener
        {
            public void actionPerformed(ActionEvent e)
            {
                if(n==0)
                {
                    b2.setText("X");
                    n=1;
                    b2.setEnabled(false);
                    l=check();
                    if(l==1)
                    {
                        JOptionPane.showMessageDialog(b2,"PLAYER A WON!!");
                        winner.setText("Player A won!!");
                        AfterMatch();
                    } 
                    else if(l==2)
                    {
                        JOptionPane.showMessageDialog(b2,"PLAYER B WON!!");
                        winner.setText("Player B won!!");
                        AfterMatch();
                    }
                    else if(l==3)
                    {
                        winner.setText("Match draw!!");
                        
                    }     
                }
                else
                {
                    b2.setText("O");
                    n=0;
                    b2.setEnabled(false);
                    l=check();
                    if(l==1)
                    {
                        JOptionPane.showMessageDialog(b2,"PLAYER A WON!!");
                        winner.setText("Player A won!!");
                        AfterMatch();
                    } 
                    else if(l==2)
                    {
                        JOptionPane.showMessageDialog(b2,"PLAYER B WON!!");
                        winner.setText("Player B won!!");
                        AfterMatch();
                    }
                    else if(l==3)
                    {
                        winner.setText("Match draw!!");
                        
                    }
                }
            }
        }
    class C3 implements ActionListener
        {
            public void actionPerformed(ActionEvent e)
            {
                if(n==0)
                {
                    b3.setText("X");
                    n=1;
                    b3.setEnabled(false);
                    l=check();
                    if(l==1)
                    {
                        JOptionPane.showMessageDialog(b3,"PLAYER A WON!!");
                        winner.setText("Player A won!!");
                        AfterMatch();
                    } 
                    else if(l==2)
                    {
                        JOptionPane.showMessageDialog(b3,"PLAYER B WON!!");
                        winner.setText("Player B won!!");
                        AfterMatch();
                    }
                    else if(l==3)
                    {
                        winner.setText("Match draw!!");
                        AfterMatch();
                    }
                }
                else
                {
                    b3.setText("O");
                    n=0;
                    b3.setEnabled(false);
                    l=check();
                    if(l==1)
                    {
                        JOptionPane.showMessageDialog(b3,"PLAYER A WON!!");
                        winner.setText("Player A won!!");
                        AfterMatch();
                    } 
                    else if(l==2)
                    {
                        JOptionPane.showMessageDialog(b3,"PLAYER B WON!!");
                        winner.setText("Player B won!!");
                        AfterMatch();
                    }
                    else if(l==3)
                    {
                        winner.setText("Match draw!!");
                    }
                }
            }
        }
    class C4 implements ActionListener
        {
        public void actionPerformed(ActionEvent e)
        {
            if(n==0)
                {
                    b4.setText("X");
                    n=1;
                    b4.setEnabled(false);
                    l=check();
                    if(l==1)
                    {
                        JOptionPane.showMessageDialog(b4,"PLAYER A WON!!");
                        winner.setText("Player A won!!");
                        AfterMatch();
                    } 
                    else if(l==2)
                    {
                        JOptionPane.showMessageDialog(b4,"PLAYER B WON!!");
                        winner.setText("Player B won!!");
                        AfterMatch();
                    }
                    else if(l==3)
                    {
                        winner.setText("Match draw!!");
                        AfterMatch();
                    }
                }
                else
                {
                    b4.setText("O");
                    n=0;
                    b4.setEnabled(false);
                    l=check();
                    if(l==1)
                    {
                        JOptionPane.showMessageDialog(b4,"PLAYER A WON!!");
                        winner.setText("Player A won!!");
                        AfterMatch();
                    } 
                    else if(l==2)
                    {
                        JOptionPane.showMessageDialog(b4,"PLAYER B WON!!");
                        winner.setText("Player B won!!");
                        AfterMatch();
                    }
                    else if(l==3)
                    {
                        winner.setText("Match draw!!");
                        AfterMatch();
                    }
                }
        }
    }
    class C5 implements ActionListener
        {
        public void actionPerformed(ActionEvent e)
        {
            if(n==0)
                {
                    b5.setText("X");
                    n=1;
                    b5.setEnabled(false);
                    l=check();
                    if(l==1)
                    {
                        JOptionPane.showMessageDialog(b5,"PLAYER A WON!!");
                        winner.setText("Player A won!!");
                        AfterMatch();
                    } 
                    else if(l==2)
                    {
                        JOptionPane.showMessageDialog(b5,"PLAYER B WON!!");
                        winner.setText("Player B won!!");
                        AfterMatch();
                    }
                    else if(l==3)
                    {
                        winner.setText("Match draw!!");
                        AfterMatch();
                    }
                }
                else
                {
                    b5.setText("O");
                    n=0;
                    b5.setEnabled(false);
                    l=check();
                    if(l==1)
                    {
                        JOptionPane.showMessageDialog(b5,"PLAYER A WON!!");
                        winner.setText("Player A won!!");
                        AfterMatch();
                    } 
                    else if(l==2)
                    {
                        JOptionPane.showMessageDialog(b5,"PLAYER B WON!!");
                        winner.setText("Player B won!!");
                        AfterMatch();
                    }
                    else if(l==3)
                    {
                        winner.setText("Match draw!!");
                        
                    }
                }
        }
    }
    class C6 implements ActionListener
        {
        public void actionPerformed(ActionEvent e)
        {
            if(n==0)
                {
                    b6.setText("X");
                    n=1;
                    b6.setEnabled(false);
                    l=check();
                    if(l==1)
                    {
                        JOptionPane.showMessageDialog(b6,"PLAYER A WON!!");
                        winner.setText("Player A won!!");
                        AfterMatch();
                    } 
                    else if(l==2)
                    {
                        JOptionPane.showMessageDialog(b6,"PLAYER B WON!!");
                        winner.setText("Player B won!!");
                        AfterMatch();
                    }
                    else if(l==3)
                    {
                        winner.setText("Match draw!!");
                        
                    }
                }
                else
                {
                    b6.setText("O");
                    n=0;
                    b6.setEnabled(false);
                    l=check();
                    if(l==1)
                    {
                        JOptionPane.showMessageDialog(b6,"PLAYER A WON!!");
                        winner.setText("Player A won!!");
                        AfterMatch();
                    } 
                    else if(l==2)
                    {
                        JOptionPane.showMessageDialog(b6,"PLAYER B WON!!");
                        winner.setText("Player B won!!");
                        AfterMatch();
                    }
                    else if(l==3)
                    {
                        winner.setText("Match draw!!");
                        
                    }
                }
        }
    }
    class C7 implements ActionListener
        {
        public void actionPerformed(ActionEvent e)
        {
            if(n==0)
                {
                    b7.setText("X");
                    n=1;
                    b7.setEnabled(false);
                    l=check();
                    if(l==1)
                    {
                        JOptionPane.showMessageDialog(b7,"PLAYER A WON!!");
                        winner.setText("Player A won!!");
                        AfterMatch();
                    } 
                    else if(l==2)
                    {
                        JOptionPane.showMessageDialog(b7,"PLAYER B WON!!");
                        winner.setText("Player B won!!");
                        AfterMatch();
                    }
                    else if(l==3)
                    {
                        winner.setText("Match draw!!");
                    }
                }
                else
                {
                    b7.setText("O");
                    n=0;
                    b7.setEnabled(false);
                    l=check();
                    if(l==1)
                    {
                        JOptionPane.showMessageDialog(b7,"PLAYER A WON!!");
                        winner.setText("Player A won!!");
                        AfterMatch();
                    } 
                    else if(l==2)
                    {
                        JOptionPane.showMessageDialog(b7,"PLAYER B WON!!");
                        winner.setText("Player B won!!");
                        AfterMatch();
                    }
                    else if(l==3)
                    {
                        winner.setText("Match draw!!");
                    }
                }
        }
    }
    class C8 implements ActionListener
        {
        public void actionPerformed(ActionEvent e)
        {
            if(n==0)
                {
                    b8.setText("X");
                    n=1;
                    b8.setEnabled(false);
                    l=check();
                    if(l==1)
                    {
                        JOptionPane.showMessageDialog(b8,"PLAYER A WON!!");
                        winner.setText("Player A won!!");
                        AfterMatch();
                    } 
                    else if(l==2)
                    {
                        JOptionPane.showMessageDialog(b8,"PLAYER B WON!!");
                        winner.setText("Player B won!!");
                        AfterMatch();
                    }
                    else if(l==3)
                    {
                        winner.setText("Match draw!!");
                    }
                }
                else
                {
                    b8.setText("O");
                    n=0;
                    b8.setEnabled(false);
                    l=check();
                    if(l==1)
                    {
                        JOptionPane.showMessageDialog(b8,"PLAYER A WON!!");
                        winner.setText("Player A won!!");
                        AfterMatch();
                    } 
                    else if(l==2)
                    {
                        JOptionPane.showMessageDialog(b8,"PLAYER B WON!!");
                        winner.setText("Player B won!!");
                        AfterMatch();
                    }
                    else if(l==3)
                    {
                        winner.setText("Match draw!!");
                    }
                }
        }
    }
    class C9 implements ActionListener
        {
            public void actionPerformed(ActionEvent e)
            {
                if(n==0)
                {
                    b9.setText("X");
                    n=1;
                    b9.setEnabled(false);
                    l=check();
                    if(l==1)
                    {
                        JOptionPane.showMessageDialog(b9,"PLAYER A WON!!");
                        winner.setText("Player A won!!");
                        AfterMatch();
                    } 
                    else if(l==2)
                    {
                        JOptionPane.showMessageDialog(b9,"PLAYER B WON!!");
                        winner.setText("Player B won!!");
                        AfterMatch();
                    }
                    else if(l==3)
                    {
                        winner.setText("Match draw!!");
                    }
                }
                    else
                    {
                    b9.setText("O");
                    n=0;
                    b9.setEnabled(false);
                    l=check();
                    if(l==1)
                    {
                        JOptionPane.showMessageDialog(b9,"PLAYER A WON!!");
                        winner.setText("Player A won!!");
                        AfterMatch();
                    } 
                    else if(l==2)
                    {
                        JOptionPane.showMessageDialog(b9,"PLAYER B WON!!");
                        winner.setText("Player B won!!");
                        AfterMatch();
                    }
                    else if(l==3)
                    {
                        winner.setText("Match draw!!");
                    }
            
            }
        }
    }          //TO RESTART GAME!!
            class Start implements ActionListener
            {
                public void actionPerformed(ActionEvent e)
                {
                    n=0;
                    draw=0;
                    b1.setEnabled(true);
                    b2.setEnabled(true);
                    b3.setEnabled(true);
                    b4.setEnabled(true);
                    b5.setEnabled(true);
                    b6.setEnabled(true);
                    b7.setEnabled(true);
                    b8.setEnabled(true);
                    b9.setEnabled(true);
                    b1.setText("");
                    b2.setText("");
                    b3.setText("");
                    b4.setText("");
                    b5.setText("");
                    b6.setText("");
                    b7.setText("");
                    b8.setText("");
                    b9.setText("");
                    winner.setText("");
                }
            }
    public static void main(String[] args) 
    {
        new Tic();
    }
}