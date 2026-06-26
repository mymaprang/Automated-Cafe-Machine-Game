package ActualGame;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStream;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.CardLayout;
import Game.Machine;
import Game.TaobinMachine;
import javax.swing.JLayeredPane;

public class endgame extends JPanel implements ActionListener{
	
JButton press = new JButton();

double score = Math.pow(2,3)*3*5.99*100;

	JLayeredPane pane = new JLayeredPane();
	CardLayout card = new CardLayout();
	Font myFont = null;
	
	public endgame() {
		
		this.setLayout(card);
		ImageIcon end = new ImageIcon(getClass().getResource("/menu/end.png"));
		JLabel display_end = new JLabel(end);
		press.add(display_end);
		press.setVisible(true);
		press.setOpaque(false);

		press.setBounds(0, 0, 1000, 700);
		press.addActionListener(this);
	
		this.add(pane);
		pane.add(press);
		
		
	
	
	
	}
	
//	public void paint (Graphics g) {
//		
//			try (InputStream is = getClass().getResourceAsStream("/font.ttf")) {
//			    myFont = Font.createFont(Font.TRUETYPE_FONT, is).deriveFont(80f);
//			} catch (IOException | FontFormatException e) {
//			    e.printStackTrace();
//			}
//			Graphics2D gg = (Graphics2D) g;
//			g.setFont(myFont.deriveFont(30f));
//		  g.setColor(new Color(61,37,48));
//			gg.drawString("Your score is"+score, 100, 100);
//	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == press) {
			JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
			frame.getContentPane().removeAll();
			frame.getContentPane().add(new TaobinMachine());
			frame.revalidate();
			frame.repaint();

}
	}
}
