package ActualGame;

import java.awt.BasicStroke;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import Game.CustomerRandom;
import Game.Info_card;
import Game.Machine;


public class Name_Card extends JPanel implements ItemListener, ActionListener, MouseListener, MouseMotionListener{
	
	CardLayout menu = new CardLayout();
	JPanel menu_panel = new JPanel();

	JTextField typehere = new JTextField();
	
	JLayeredPane pane = new JLayeredPane();

	JPanel background= new JPanel();
		
	JLabel employee = new JLabel();
	
	JPanel signhere = new JPanel();
	JLabel feild = new JLabel();
	
	JButton next = new JButton();
	
	JTextArea text = new JTextArea("Let's get you set up. Here is your part-time employee card.");
	JTextArea text2 = new JTextArea("Type your name and sign right here! :) ");

	JRadioButton pink = new JRadioButton("Pink / Brown");
	
	
    int r = 20;
    int x;
    int y;
    
    Font myFont =null;
    
    int width = 10;
    int height = 10;

	
    Color clear = new Color(0,0,0,0);
    Color brownColor = new Color (61,37,48);
    Color pinkColor = new Color(255,126,148);
    Color color;
    
	Name_Card() {
		
			  BufferedImage cursorImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		      Graphics2D g = cursorImage.createGraphics();
		        
		        g.setColor(new Color(61,37,48));
		        g.fillOval(0,0 , width - 1, height - 1);
		        g.dispose();
		        java.awt.Cursor myCursor = Toolkit.getDefaultToolkit().createCustomCursor(cursorImage, new Point(0, 0),"");
		        setCursor(myCursor); 
			
	
		
		
	   
	        
	        
		try (InputStream is = getClass().getResourceAsStream("/font.ttf")) {
		    myFont = Font.createFont(Font.TRUETYPE_FONT, is).deriveFont(80f);
		} catch (IOException | FontFormatException e) {
		    e.printStackTrace();
		}

		this.setLayout(menu);
		
		pink.setBounds(295, 507, 300, 20);
		pink.setBackground(clear);
		pink.setBorder(null);
		pink.setFont(myFont.deriveFont(20f));
		pink.setForeground(brownColor);
		pink.addItemListener(this);
		

		ImageIcon bg = new ImageIcon(getClass().getResource("/menu/welcome_bg.png"));
		JLabel display_bg = new JLabel(bg);
		background.add(display_bg);
		background.setBounds(0, 0, 1000, 700);

		ImageIcon employee_card = new ImageIcon(getClass().getResource("/employee_card.png"));
		JLabel display_card = new JLabel(employee_card);
		employee.add(display_card);
		employee.setBounds(200, 100, 600,1000);
		employee.setOpaque(false);
		employee.setLayout(new GridLayout(2,1));
		
		typehere.setBounds(350, 255, 300,50);
		typehere.setHorizontalAlignment(JTextField.CENTER);
		typehere.setBackground(clear);
		typehere.setBorder(null);
		typehere.setFont(myFont);
		typehere.setForeground(new Color(61,37,48));
		String name = typehere.getText();
		
		text.setBounds(300, 90, 400,50);
		text.setBackground(clear);
		text.setBorder(null);
		text.setFont(myFont.deriveFont(20f));
		text.setForeground(Color.white);
		
		
		text2.setBounds(375, 100, 500,50);
		text2.setBackground(clear);
		text2.setBorder(null);
		text2.setFont(myFont.deriveFont(20f));
		text2.setForeground(Color.white);
		
		
		ImageIcon next_bt = new ImageIcon(getClass().getResource("/info/nextbt.png"));
		JLabel display_bt = new JLabel(next_bt);
		next.add(display_bt);
		next.setBounds(700, 500, 100, 100);
		next.setContentAreaFilled(false);
		next.setBorderPainted(false);	
		next.setOpaque(false);
		next.addActionListener(this);




		

		
		pane.addMouseListener(this);
        pane.addMouseMotionListener(this);
        pane.setOpaque(false);
		

		this.add(pane);
		pane.add(text);
		pane.add(text2);
		pane.add(pink);
		

		pane.add(next);

		pane.add(typehere);
		pane.add(employee);
	

//		
		pane.add(background);


	}



  
	
	
		// TODO Auto-generated method stub
		
	

    public void mousePressed(MouseEvent e) {
        x = e.getX();
        y = e.getY();
    }
    public void mouseReleased(MouseEvent e) {

    }
    public void mouseClicked(MouseEvent e) {
    }
    public void mouseExited(MouseEvent e) {

    }
    public void mouseEntered(MouseEvent e) {

    }
    public void mouseDragged(MouseEvent e) {
    	
    	
    
        Graphics g = getGraphics();
        if(e.getModifiersEx() == InputEvent.BUTTON1_DOWN_MASK) {
        	 Graphics2D gg = (Graphics2D) g.create();
             gg.setColor(color);
             gg.setStroke(new BasicStroke(3)); 
             gg.drawLine(x, y, e.getX(), e.getY());
        }
        else {
            g.setColor(getBackground());
            g.fillOval(x-r, y-r, 2*r, 2*r);
        }
        x = e.getX();
        y = e.getY();
    }
    public void mouseMoved(MouseEvent e) {

    }




	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == next) {
			JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
			frame.getContentPane().removeAll();
			frame.getContentPane().add(new Machine());
			frame.revalidate();
			frame.repaint();
		}

		// TODO Auto-generated method stub
		
	}






	@Override
	public void itemStateChanged(ItemEvent e) {
		if(pink.isSelected() && e.getStateChange() == 1) {
			  BufferedImage cursorImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		      Graphics2D g = cursorImage.createGraphics();
		        
		        g.setColor(new Color(255,126,148));
		        g.fillRect(0, 0, width - 1, height - 1);
		        g.dispose();
		        java.awt.Cursor myCursor = Toolkit.getDefaultToolkit().createCustomCursor(cursorImage, new Point(0, 0), "");
		        setCursor(myCursor); 
		        color = pinkColor;
		        
		        
			
		}
		else {
			  BufferedImage cursorImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		      Graphics2D g = cursorImage.createGraphics();
		        
		        g.setColor(new Color(61,37,48));
		        g.fillOval(0,0 , width - 1, height - 1);
		        g.dispose();
		        java.awt.Cursor myCursor = Toolkit.getDefaultToolkit().createCustomCursor(cursorImage, new Point(0, 0), "");
		        setCursor(myCursor); 
		        color = brownColor;
		}
			
		}}