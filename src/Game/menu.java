package Game;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import ActualGame.htp;


	

public class menu extends JPanel implements ActionListener{
	
	
	CardLayout menu = new CardLayout();

	JPanel menu_panel = new JPanel();

	JButton quit_panel = new JButton();
	JButton info_panel = new JButton();
	JButton htp_panel = new JButton();
	JLayeredPane pane = new JLayeredPane();

	JPanel bg_wc = new JPanel();
	
	CustomerRandom customer = new CustomerRandom();
	
	
	menu() {
		this.setLayout(menu);

		ImageIcon bg = new ImageIcon(getClass().getResource("/menu/welcome_bg.png"));
		JLabel display_bg = new JLabel(bg);
		bg_wc.add(display_bg);
		bg_wc.setBounds(0, 0, 1000, 700);

		ImageIcon menu_bg = new ImageIcon(getClass().getResource("/menu/menu_bg.png"));
		JLabel display_menu = new JLabel(menu_bg);
		menu_panel.add(display_menu);
		menu_panel.setBounds(275, 100, 400, 480);
		menu_panel.setOpaque(false);

		ImageIcon quit_bg = new ImageIcon(getClass().getResource("/quit_game.png"));
		JLabel display_quit = new JLabel(quit_bg);
		quit_panel.add(display_quit);
		quit_panel.setOpaque(false);
		quit_panel.setContentAreaFilled(false);
		quit_panel.setBorderPainted(false);
		quit_panel.setBounds(350, 225, 270, 80);
		quit_panel.addActionListener(this);
//		
		ImageIcon info_bg = new ImageIcon(getClass().getResource("/menu/info_bt.png"));
		JLabel display_info = new JLabel(info_bg);
		info_panel.add(display_info);
		info_panel.setOpaque(false);
		info_panel.setContentAreaFilled(false);
		info_panel.setBorderPainted(false);
		info_panel.setBounds(350, 325, 270, 80);
		info_panel.addActionListener(this);

		ImageIcon htp_bg = new ImageIcon(getClass().getResource("/menu/htp_bt.png"));
		JLabel display_htp = new JLabel(htp_bg);
		htp_panel.add(display_htp);
		htp_panel.setOpaque(false);
		htp_panel.setContentAreaFilled(false);
		htp_panel.setBorderPainted(false);
		htp_panel.setBounds(350, 425, 270, 80);
		htp_panel.addActionListener(this);

		this.add(pane);

		pane.add(menu_panel, 0);

		pane.add(quit_panel, 0);
		pane.add(info_panel, 0);
		pane.add(htp_panel, 0);
		pane.add(bg_wc);

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == info_panel) {
			JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
			frame.getContentPane().removeAll();
			frame.getContentPane().add(new Info_card());
			frame.revalidate();
			frame.repaint();
		} else if (e.getSource() == quit_panel) {
			System.exit(0);
		}
		else if (e.getSource() == htp_panel) {
			JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
			frame.getContentPane().removeAll();
			frame.getContentPane().add(new htp());
			frame.revalidate();
			frame.repaint();
		}
		
		

}
	}
