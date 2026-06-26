package ActualGame;

import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import Game.TaobinMachine;

public class htp extends JPanel implements ActionListener{
	CardLayout menu = new CardLayout();
	JPanel menu_panel = new JPanel();

	JTextField typehere = new JTextField();
	
	JLayeredPane pane = new JLayeredPane();

	JPanel background= new JPanel();
		
	JLabel htp = new JLabel();
	
	JButton close_bt = new JButton();
	
	public htp(){
		
		this.setLayout(menu);
		
		ImageIcon bg = new ImageIcon(getClass().getResource("/menu/welcome_bg.png"));
		JLabel display_bg = new JLabel(bg);
		background.add(display_bg);
		background.setBounds(0, 0, 1000, 700);

		ImageIcon htp_card = new ImageIcon(getClass().getResource("/htp.png"));
		JLabel display_card = new JLabel(htp_card);
		htp.add(display_card);
		htp.setBounds(200, 100, 600,1000);
		htp.setOpaque(false);
		htp.setLayout(new GridLayout(2,1));
		
		ImageIcon close_bg = new ImageIcon(getClass().getResource("/info/closebt.png"));
		JLabel display_cbt = new JLabel(close_bg);
		close_bt.add(display_cbt);
		close_bt.setOpaque(false);
		close_bt.setContentAreaFilled(false);
		close_bt.setBorderPainted(false);
		close_bt.setBounds(195, 85 ,109, 110);
		close_bt.addActionListener(this);
		
		
		this.add(pane);
		pane.add(close_bt);
		pane.add(htp);
		pane.add(background);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == close_bt) {
			JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
			frame.getContentPane().removeAll();
			frame.getContentPane().add(new TaobinMachine());
			frame.revalidate();
			frame.repaint();
		}
		// TODO Auto-generated method stub
		
	}

}
