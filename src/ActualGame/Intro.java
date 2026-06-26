package ActualGame;

import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import Game.CustomerRandom;
import Game.Info_card;
import Game.Machine;

public class Intro extends JPanel implements ActionListener {
	

	JButton press = new JButton();
	
	
	
	
	
	public Intro() {
		this.setLayout(new FlowLayout());
		ImageIcon intro = new ImageIcon(getClass().getResource("/intro.png"));
		JLabel display_bg = new JLabel(intro);
		press.add(display_bg);
		press.setBounds(0, 0, 1000, 700);
		press.addActionListener(this);
	


		this.add(press);



	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == press) {
			JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
			frame.getContentPane().removeAll();
			frame.getContentPane().add(new Name_Card());
			frame.revalidate();
			frame.repaint();
	

}
	}


}
