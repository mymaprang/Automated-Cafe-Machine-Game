package Game;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Info_card extends JPanel implements ActionListener {
	


	int x = 0;
	private JPanel college_student = new JPanel();
	private JPanel count_donutcula = new JPanel();
	private JPanel sleepy_head = new JPanel();
	private JPanel local_nerd = new JPanel();
	private JPanel girlie_guy = new JPanel();
	
	private JButton prev_bt = new JButton();
	private JButton next_bt = new JButton();
	private JButton close_bt = new JButton();
	private CardLayout info_pane = new CardLayout();
	private JLayeredPane layered = new JLayeredPane();
	
	private JPanel bg_card = new JPanel();



	public Info_card(){
		this.setLayout(info_pane);
		
		ImageIcon bg = new ImageIcon(getClass().getResource("/menu/welcome_bg.png"));
		JLabel display_bg = new JLabel(bg);
		bg_card.add(display_bg);
		bg_card.setBounds(0, 0, 1000, 700);
				
		
		
		ImageIcon b_card = new ImageIcon(getClass().getResource("/info/b_card.png"));
		JLabel display_b = new JLabel(b_card);
		college_student.add(display_b);
		college_student.setOpaque(false);
		college_student.setBounds(200, 50, 600, 520);
		
		ImageIcon dn_card = new ImageIcon(getClass().getResource("/info/dn_card.png"));
		JLabel display_dn = new JLabel(dn_card);
		count_donutcula.add(display_dn);
		count_donutcula.setOpaque(false);
		count_donutcula.setBounds(200, 50, 600, 520);
		
		ImageIcon mp_card = new ImageIcon(getClass().getResource("/info/mp_card.png"));
		JLabel display_mp = new JLabel(mp_card);
		sleepy_head.add(display_mp);
		sleepy_head.setOpaque(false);
		sleepy_head.setBounds(200, 50, 600, 520);
		
		ImageIcon j_card = new ImageIcon(getClass().getResource("/info/j_card.png"));
		JLabel display_j = new JLabel(j_card);
		local_nerd.add(display_j);
		local_nerd.setOpaque(false);
		local_nerd.setBounds(200, 50, 600, 520);
		
		ImageIcon g_card = new ImageIcon(getClass().getResource("/info/g_card.png"));
		JLabel display_g = new JLabel(g_card);
		girlie_guy.add(display_g);
		girlie_guy.setOpaque(false);
		girlie_guy.setBounds(200, 50, 600, 520);
		
		ImageIcon close_bg = new ImageIcon(getClass().getResource("/info/closebt.png"));
		JLabel display_cbt = new JLabel(close_bg);
		close_bt.add(display_cbt);
		close_bt.setOpaque(false);
		close_bt.setContentAreaFilled(false);
		close_bt.setBorderPainted(false);
		close_bt.setBounds(195, 75 ,109, 110);
		close_bt.addActionListener(this);
		
		
		ImageIcon prev_bg = new ImageIcon(getClass().getResource("/info/prevbt.png"));
		JLabel display_prev = new JLabel(prev_bg);
		prev_bt.add(display_prev);
		prev_bt.setOpaque(false);
		prev_bt.setContentAreaFilled(false);
		prev_bt.setBorderPainted(false);
		prev_bt.setBounds(235,460, 100, 80);
		prev_bt.addActionListener(this);
		
		ImageIcon next_bg = new ImageIcon(getClass().getResource("/info/nextbt.png"));
		JLabel display_next = new JLabel(next_bg);
		next_bt.add(display_next);
		next_bt.setOpaque(false);
		next_bt.setContentAreaFilled(false);
		next_bt.setBorderPainted(false);
		next_bt.setBounds(675,460,100, 80);
		next_bt.addActionListener(this);
		
		

		this.add(layered);
		layered.add(close_bt,0);
		layered.add(prev_bt,1);
		prev_bt.setVisible(false);
		layered.add(next_bt,2);
		layered.add(college_student);
		layered.add(count_donutcula);
		layered.add(sleepy_head);
		layered.add(local_nerd);
		layered.add(girlie_guy);
		layered.add(bg_card);
		
		
		
	
		
		
}
//	public static void main(String[] args) {
//		
//		
//		JFrame frame = new JFrame("Info Card");
//		frame.add(new Info_card());
//		frame.getLayout();
//		frame.setSize(1000,700);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setVisible(true);
//		frame.setResizable(false);		
//	
//	}		

	void nextcard() {
		if (x==0) {
			this.prev_bt.setVisible(false);
		}
		if (x==1) {
		this.college_student.setVisible(false);
		this.prev_bt.setVisible(true);
		
		this.repaint();
		}
		
		if (x==2) {
		this.college_student.setVisible(false);
		this.count_donutcula.setVisible(false);
		this.repaint();
		}
		if (x==3) {
		this.college_student.setVisible(false);
		this.count_donutcula.setVisible(false);
		this.sleepy_head.setVisible(false);
		
		this.repaint();
		}
		if (x==4) {
		this.college_student.setVisible(false);
		this.count_donutcula.setVisible(false);
		this.sleepy_head.setVisible(false);
		this.local_nerd.setVisible(false);
		this.next_bt.setVisible(false);
		this.repaint();
		}
		
		}
	void prevcard() {
		if (x==3) {
			this.local_nerd.setVisible(true);
			this.next_bt.setVisible(true);
		}
		if (x==2) {
			this.sleepy_head.setVisible(true);
		}
		if (x==1) {
			this.count_donutcula.setVisible(true);
		}
		if (x==0) {
			this.college_student.setVisible(true);
			this.prev_bt.setVisible(false);
		}
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
		
		if (e.getSource() == next_bt) {
			x++; 
			System.out.println(x);
			nextcard();
		}
		
		if (e.getSource() == prev_bt) {
			x = x-1;
			System.out.println(x);
			prevcard();

		}
		
		}
		// TODO Auto-generated method stub
		
}

