package Game;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import ActualGame.endgame;


public class Machine extends JPanel implements ActionListener {
	
	
	

	private static int matchaCounter = 0;
	private static int thaitCounter = 0;
	private static int milktCounter = 0;
	private static int oreoCounter = 0;
	private static int iceCounter = 0;
	private static int hotCounter = 0;
	private static int cupCounter = 0;
	private static int melonCounter = 0;
	private static int strawberryCounter = 0;
	private static int sodaCounter = 0;
	private static int milkCounter = 0;
	private static int blenderCounter = 0;

	
	private static int ingreCounter = 0;

	public JPanel background = new JPanel();

//	JPanel customer = new JPanel();

	JButton setting = new JButton();

	JButton matcha = new JButton();
	JButton thaitea = new JButton();
	JButton milktea = new JButton();
	JButton oreo = new JButton();
	JButton strawberry = new JButton();

	JButton melon = new JButton();

	JButton milk = new JButton();
	JButton soda = new JButton();

	JButton hot = new JButton();
	JButton ice = new JButton();
	JButton bin = new JButton();

	JButton blender = new JButton();

	JButton cup = new JButton();

	JButton send = new JButton();

	JButton trash = new JButton();

	JLayeredPane mc_pane = new JLayeredPane();
	CardLayout pane = new CardLayout();
	
	
	JPanel showCup = new JPanel();
	JPanel showIce = new JPanel();
	JPanel showHot = new JPanel();
	JPanel showMilk = new JPanel();
	JPanel showSoda = new JPanel();
	JPanel showOreo = new JPanel();

	
	JPanel show_soda_strawberry = new JPanel();
	JPanel show_soda_melon = new JPanel();
	
	JPanel show_ice_matcha = new JPanel();
	JPanel show_ice_thait = new JPanel();
	JPanel show_ice_milkt = new JPanel();
	JPanel show_hot_matcha= new JPanel();
	JPanel show_hot_thait = new JPanel();
	JPanel show_blend_oreo = new JPanel();
	JPanel show_blend_matcha = new JPanel();
	JPanel show_blend_thait= new JPanel();
	JPanel show_blend_milkt= new JPanel();
	JPanel show_blend_melon = new JPanel();
	JPanel show_pre_melon = new JPanel();

	
	JPanel show_wrongmenu = new JPanel();
	
	CustomerRandom customer = new CustomerRandom();
	JPanel customer_pane = new JPanel();

//	
//	RandomOrder randomOrder = new RandomOrder();
//	JPanel orderpane = new JPanel();
//	
	
	Boolean hotMatcha = false;
	Boolean hotThait = false;
	Boolean iceMatcha = false;
	Boolean iceMilkt = false;
	Boolean iceThait = false;
	Boolean sodaStrawberry = false;
	Boolean sodaMelon = false;
	Boolean blendOreo = false;
	Boolean blendMatcha = false;
	Boolean blendMilkt = false;
	Boolean blendThait= false;
	Boolean blendMelon = false;



	JButton level1bt = new JButton();
	JButton level1bt_cp = new JButton();
	JButton level1bt_f  = new JButton();
	
	JButton level2bt = new JButton();
	JButton level2bt_cp = new JButton();
	JButton level2bt_f  = new JButton();

	
	JButton level3bt = new JButton();
	JButton level3bt_cp = new JButton();
	JButton level3bt_f  = new JButton();

	
	JButton end = new JButton();




	
//	Level1 level1 = new Level1();
//	JPanel level1pane = new JPanel();
//	
	
	public Machine() {
		
        
		this.setLayout(pane);
		

		ImageIcon bg = new ImageIcon(getClass().getResource("/game_bg.png"));
		JLabel display_bg = new JLabel(bg);
		background.add(display_bg);
		background.setBounds(0, 0, 1000, 700);


		ImageIcon setting_i = new ImageIcon(getClass().getResource("/setting_i.png"));
		JLabel display_setting = new JLabel(setting_i);
		setting.add(display_setting);
		setting.setBounds(25, 20, 82, 80);
		setting.setOpaque(false);
		setting.setContentAreaFilled(false);
		setting.setBorderPainted(false);
		setting.addActionListener(this);
		
		ImageIcon level1 = new ImageIcon(getClass().getResource("/level/level1_start.png"));
		JLabel display_lvl1 = new JLabel(level1);
		level1bt.add(display_lvl1);
		level1bt.setBounds(0, 0, 1000, 700);
		level1bt.setOpaque(false);
		level1bt.setContentAreaFilled(false);
		level1bt.setBorderPainted(false);
		level1bt.addActionListener(this);

		ImageIcon level1_cp = new ImageIcon(getClass().getResource("/level/level1_cp.png"));
		JLabel display_lvl1_cp = new JLabel(level1_cp);
		level1bt_cp.add(display_lvl1_cp);
		level1bt_cp.setBounds(0, 0, 1000, 700);
		level1bt_cp.setOpaque(false);
		level1bt_cp.setContentAreaFilled(false);
		level1bt_cp.setBorderPainted(false);
		level1bt_cp.addActionListener(this);
		level1bt_cp.setVisible(false);
		
		ImageIcon level1_failed = new ImageIcon(getClass().getResource("/level/level1_failed.png"));
		JLabel display_lvl1_failed = new JLabel(level1_failed);
		level1bt_f.add(display_lvl1_failed);
		level1bt_f.setBounds(0, 0, 1000, 700);
		level1bt_f.setOpaque(false);
		level1bt_f.setContentAreaFilled(false);
		level1bt_f.setBorderPainted(false);
		level1bt_f.addActionListener(this);
		level1bt_f.setVisible(false);
		
		
		
		ImageIcon level2 = new ImageIcon(getClass().getResource("/level/level2_start.png"));
		JLabel display_lvl2 = new JLabel(level2);
		level2bt.add(display_lvl2);
		level2bt.setBounds(0, 0, 1000, 700);
		level2bt.setOpaque(false);
		level2bt.setContentAreaFilled(false);
		level2bt.setBorderPainted(false);
		level2bt.addActionListener(this);
		level2bt.setVisible(false);
		
		ImageIcon level2_cp = new ImageIcon(getClass().getResource("/level/level2_cp.png"));
		JLabel display_lvl2_cp = new JLabel(level2_cp);
		level2bt_cp.add(display_lvl2_cp);
		level2bt_cp.setBounds(0, 0, 1000, 700);
		level2bt_cp.setOpaque(false);
		level2bt_cp.setContentAreaFilled(false);
		level2bt_cp.setBorderPainted(false);
		level2bt_cp.addActionListener(this);
		level2bt_cp.setVisible(false);
		
		ImageIcon level2_failed = new ImageIcon(getClass().getResource("/level/level2_failed.png"));
		JLabel display_lvl2_failed = new JLabel(level2_failed);
		level2bt_f.add(display_lvl1_failed);
		level2bt_f.setBounds(0, 0, 1000, 700);
		level2bt_f.setOpaque(false);
		level2bt_f.setContentAreaFilled(false);
		level2bt_f.setBorderPainted(false);
		level2bt_f.addActionListener(this);
		level2bt_f.setVisible(false);
		
		
	
		ImageIcon level3 = new ImageIcon(getClass().getResource("/level/level3_start.png"));
		JLabel display_lvl3 = new JLabel(level3);
		level3bt.add(display_lvl3);
		level3bt.setBounds(0, 0, 1000, 700);
		level3bt.setOpaque(false);
		level3bt.setContentAreaFilled(false);
		level3bt.setBorderPainted(false);
		level3bt.addActionListener(this);
		level3bt.setVisible(false);
		
		ImageIcon level3_cp = new ImageIcon(getClass().getResource("/level/level3_cp.png"));
		JLabel display_lvl3_cp = new JLabel(level3_cp);
		level3bt_cp.add(display_lvl3_cp);
		level3bt_cp.setBounds(0, 0, 1000, 700);
		level3bt_cp.setOpaque(false);
		level3bt_cp.setContentAreaFilled(false);
		level3bt_cp.setBorderPainted(false);
		level3bt_cp.addActionListener(this);
		level3bt_cp.setVisible(false);
		
		ImageIcon level3_failed = new ImageIcon(getClass().getResource("/level/level3_failed.png"));
		JLabel display_lvl3_failed = new JLabel(level3_failed);
		level3bt_f.add(display_lvl1_failed);
		level3bt_f.setBounds(0, 0, 1000, 700);
		level3bt_f.setOpaque(false);
		level3bt_f.setContentAreaFilled(false);
		level3bt_f.setBorderPainted(false);
		level3bt_f.addActionListener(this);
		level3bt_f.setVisible(false);
		
		
		


		
		ImageIcon matcha_i = new ImageIcon(getClass().getResource("/matcha_i.png"));
		JLabel display_matcha = new JLabel(matcha_i);
		matcha.add(display_matcha);
		matcha.setBounds(549, 100, 82, 80);
		matcha.setOpaque(false);
		matcha.setContentAreaFilled(false);
		matcha.setBorderPainted(false);
		matcha.addActionListener(this);

		ImageIcon milkt_i = new ImageIcon(getClass().getResource("/milkt_i.png"));
		JLabel display_milkt = new JLabel(milkt_i);
		milktea.add(display_milkt);
		milktea.setBounds(650, 100, 82, 80);
		milktea.setOpaque(false);
		milktea.setContentAreaFilled(false);
		milktea.setBorderPainted(false);
		milktea.addActionListener(this);

		ImageIcon thait_i = new ImageIcon(getClass().getResource("/thait_i.png"));
		JLabel display_thait = new JLabel(thait_i);
		thaitea.add(display_thait);
		thaitea.setBounds(751, 100, 82, 80);
		thaitea.setOpaque(false);
		thaitea.setContentAreaFilled(false);
		thaitea.setBorderPainted(false);
		thaitea.addActionListener(this);

		ImageIcon oreo_i = new ImageIcon(getClass().getResource("/oreo_i.png"));
		JLabel display_oreo = new JLabel(oreo_i);
		oreo.add(display_oreo);
		oreo.setBounds(852, 100, 82, 80);
		oreo.setOpaque(false);
		oreo.setContentAreaFilled(false);
		oreo.setBorderPainted(false);
		oreo.addActionListener(this);

		ImageIcon straw_i = new ImageIcon(getClass().getResource("/strawberry_i.png"));
		JLabel display_strw = new JLabel(straw_i);
		strawberry.add(display_strw);
		strawberry.setBounds(549, 215, 82, 80);
		strawberry.setOpaque(false);
		strawberry.setContentAreaFilled(false);
		strawberry.setBorderPainted(false);
		strawberry.addActionListener(this);

		ImageIcon melon_i = new ImageIcon(getClass().getResource("/melon_i.png"));
		JLabel display_melon = new JLabel(melon_i);
		melon.add(display_melon);
		melon.setBounds(650, 220, 82, 80);
		melon.setOpaque(false);
		melon.setContentAreaFilled(false);
		melon.setBorderPainted(false);
		melon.addActionListener(this);

		ImageIcon soda_i = new ImageIcon(getClass().getResource("/soda_i.png"));
		JLabel display_soda = new JLabel(soda_i);
		soda.add(display_soda);
		soda.setBounds(751, 215, 82, 80);
		soda.setOpaque(false);
		soda.setContentAreaFilled(false);
		soda.setBorderPainted(false);
		soda.addActionListener(this);

		ImageIcon milk_i = new ImageIcon(getClass().getResource("/milk_i.png"));
		JLabel display_milk = new JLabel(milk_i);
		milk.add(display_milk);
		milk.setBounds(853, 220, 82, 80);
		milk.setOpaque(false);
		milk.setContentAreaFilled(false);
		milk.setBorderPainted(false);
		milk.addActionListener(this);

		ImageIcon blender_i = new ImageIcon(getClass().getResource("/blender_i.png"));
		JLabel display_blender = new JLabel(blender_i);
		blender.add(display_blender);
		blender.setBounds(549, 410, 80, 130);
		blender.setOpaque(false);
		blender.setContentAreaFilled(false);
		blender.setBorderPainted(false);
		blender.addActionListener(this);

		ImageIcon cup_i = new ImageIcon(getClass().getResource("/cup_i.png"));
		JLabel display_cup = new JLabel(cup_i);
		cup.add(display_cup);
		cup.setBounds(855, 389, 82, 80);
		cup.setOpaque(false);
		cup.setContentAreaFilled(false);
		cup.setBorderPainted(false);
		cup.addActionListener(this);

		ImageIcon hot_i = new ImageIcon(getClass().getResource("/hot_i.png"));
		JLabel display_hot = new JLabel(hot_i);
		hot.add(display_hot);
		hot.setBounds(663, 327, 65, 35);
		hot.setOpaque(false);
		hot.setContentAreaFilled(false);
		hot.setBorderPainted(false);
		hot.addActionListener(this);

		ImageIcon ice_i = new ImageIcon(getClass().getResource("/ice_i.png"));
		JLabel display_ice = new JLabel(ice_i);
		ice.add(display_ice);
		ice.setBounds(763, 327, 65, 35);
		ice.setOpaque(false);
		ice.setContentAreaFilled(false);
		ice.setBorderPainted(false);
		ice.addActionListener(this);

		ImageIcon bin_i = new ImageIcon(getClass().getResource("/bin_i.png"));
		JLabel display_bin = new JLabel(bin_i);
		bin.add(display_bin);
		bin.setBounds(865, 490, 64, 64);
		bin.setOpaque(true);
		bin.setContentAreaFilled(false);
		bin.setBorderPainted(false);
		bin.addActionListener(this);

		ImageIcon send_i = new ImageIcon(getClass().getResource("/send_i.png"));
		JLabel display_send = new JLabel(send_i);
		send.add(display_send);
		send.setBounds(679, 575, 120, 64);
		send.setOpaque(true);
		send.setContentAreaFilled(false);
		send.setBorderPainted(false);
		send.addActionListener(this);
		
		ImageIcon dsp_cup = new ImageIcon(getClass().getResource("/show_cup.png"));
		JLabel displaycup = new JLabel(dsp_cup);
		showCup.add(displaycup);
		showCup.setBounds(675, 400, 125, 150);
		showCup.setOpaque(false);
		showCup.setVisible(false);
		
		
		ImageIcon dsp_hot = new ImageIcon(getClass().getResource("/show_hot.png"));
		JLabel displayhot = new JLabel(dsp_hot);
		showHot.add(displayhot);
		showHot.setBounds(675, 400, 125, 150);
		showHot.setOpaque(false);
		showHot.setVisible(false);
		
		ImageIcon dsp_ice = new ImageIcon(getClass().getResource("/show_ice.png"));
		JLabel displayice = new JLabel(dsp_ice);
		showIce.add(displayice);
		showIce.setBounds(710, 450, 50, 70);
		showIce.setOpaque(false);
		showIce.setVisible(false);
		
		ImageIcon dsp_milk = new ImageIcon(getClass().getResource("/show_milk.png"));
		JLabel displaymilk = new JLabel(dsp_milk);
		showMilk.add(displaymilk);
		showMilk.setBounds(675, 400, 125, 150);
		showMilk.setOpaque(false);
		showMilk.setVisible(false);
		
		ImageIcon dsp_matcha = new ImageIcon(getClass().getResource("/show_matcha.png"));
		JLabel displaymatcha = new JLabel(dsp_matcha);
		show_ice_matcha.add(displaymatcha);
		show_ice_matcha.setBounds(675, 400, 125, 150);
		show_ice_matcha.setOpaque(false);
		show_ice_matcha.setVisible(false);
		
		ImageIcon dsp_milkt = new ImageIcon(getClass().getResource("/show_milkt.png"));
		JLabel displaymilkt = new JLabel(dsp_milkt);
		show_ice_milkt.add(displaymilkt);
		show_ice_milkt.setBounds(675, 400, 125, 150);
		show_ice_milkt.setOpaque(false);
		show_ice_milkt.setVisible(false);
		
		ImageIcon dsp_thait = new ImageIcon(getClass().getResource("/show_thait.png"));
		JLabel displaythait = new JLabel(dsp_thait);
		show_ice_thait.add(displaythait);
		show_ice_thait.setBounds(675, 400, 125, 150);
		show_ice_thait.setOpaque(false);
		show_ice_thait.setVisible(false);
		
		ImageIcon dsp_soda = new ImageIcon(getClass().getResource("/show_soda.png"));
		JLabel displaysoda = new JLabel(dsp_soda);
		showSoda.add(displaysoda);
		showSoda.setBounds(675, 400, 125, 150);
		showSoda.setOpaque(false);
		showSoda.setVisible(false);

		ImageIcon dsp_strw = new ImageIcon(getClass().getResource("/show_strw.png"));
		JLabel displaystrw = new JLabel(dsp_strw);
		show_soda_strawberry.add(displaystrw);
		show_soda_strawberry.setBounds(675, 400, 125, 150);
		show_soda_strawberry.setOpaque(false);
		show_soda_strawberry.setVisible(false);

		ImageIcon dsp_melon = new ImageIcon(getClass().getResource("/show_melon.png"));
		JLabel displaymelon = new JLabel(dsp_melon);
		show_soda_melon.add(displaymelon);
		show_soda_melon.setBounds(675, 400, 125, 150);
		show_soda_melon.setOpaque(false);
		show_soda_melon.setVisible(false);


		ImageIcon dsp_hot_thait = new ImageIcon(getClass().getResource("/show_hot_thait.png"));
		JLabel displayHthait = new JLabel(dsp_hot_thait);
		show_hot_thait.add(displayHthait);
		show_hot_thait.setBounds(675, 400, 125, 150);
		show_hot_thait.setOpaque(false);
		show_hot_thait.setVisible(false);

		ImageIcon dsp_hot_matcha = new ImageIcon(getClass().getResource("/show_hot_matcha.png"));
		JLabel displayHmatcha = new JLabel(dsp_hot_matcha);
		show_hot_matcha.add(displayHmatcha);
		show_hot_matcha.setBounds(675, 400, 125, 150);
		show_hot_matcha.setOpaque(false);
		show_hot_matcha.setVisible(false);
		
		ImageIcon dsp_oreo = new ImageIcon(getClass().getResource("/showOreo.png"));
		JLabel displayOreo = new JLabel(dsp_oreo);
		showOreo.add(displayOreo);
		showOreo.setBounds(675, 400, 125, 150);
		showOreo.setOpaque(false);
		showOreo.setVisible(false);
		
		
		ImageIcon dsp_pre_melon = new ImageIcon(getClass().getResource("/show_pre_melon.png"));
		JLabel displaypremelon = new JLabel(dsp_pre_melon);
		show_pre_melon.add(displaypremelon);
		show_pre_melon.setBounds(675, 400, 125, 150);
		show_pre_melon.setOpaque(false);
		show_pre_melon.setVisible(false);
		
		ImageIcon dsp_blend_oreo = new ImageIcon(getClass().getResource("/show_blend_oreo.png"));
		JLabel displayBOreo = new JLabel(dsp_blend_oreo);
		show_blend_oreo.add(displayBOreo);
		show_blend_oreo.setBounds(675, 400, 125, 150);
		show_blend_oreo.setOpaque(false);
		show_blend_oreo.setVisible(false);
		
		ImageIcon dsp_blend_melon = new ImageIcon(getClass().getResource("/show_blend_melon.png"));
		JLabel displayBmelon = new JLabel(dsp_blend_melon);
		show_blend_melon.add(displayBmelon);
		show_blend_melon.setBounds(675, 400, 125, 150);
		show_blend_melon.setOpaque(false);
		show_blend_melon.setVisible(false);
		
		ImageIcon dsp_blend_thait = new ImageIcon(getClass().getResource("/show_blend_thait.png"));
		JLabel displayBthait = new JLabel(dsp_blend_thait);
		show_blend_thait.add(displayBthait);
		show_blend_thait.setBounds(675, 400, 125, 150);
		show_blend_thait.setOpaque(false);
		show_blend_thait.setVisible(false);
		
		ImageIcon dsp_blend_milkt= new ImageIcon(getClass().getResource("/show_blend_milkt.png"));
		JLabel displayBmilkt = new JLabel(dsp_blend_milkt);
		show_blend_milkt.add(displayBmilkt);
		show_blend_milkt.setBounds(675, 400, 125, 150);
		show_blend_milkt.setOpaque(false);
		show_blend_milkt.setVisible(false);
		
		ImageIcon dsp_blend_matcha= new ImageIcon(getClass().getResource("/show_blend_matcha.png"));
		JLabel displayBmatcha = new JLabel(dsp_blend_matcha);
		show_blend_matcha.add(displayBmatcha);
		show_blend_matcha.setBounds(675, 400, 125, 150);
		show_blend_matcha.setOpaque(false);
		show_blend_matcha.setVisible(false);
		
		ImageIcon dsp_soda_melon= new ImageIcon(getClass().getResource("/show_melon.png"));
		JLabel displaySmelon = new JLabel(dsp_soda_melon);
		show_soda_melon.add(displaySmelon);
		show_soda_melon.setBounds(675, 400, 125, 150);
		show_soda_melon.setOpaque(false);
		show_soda_melon.setVisible(false);

		ImageIcon dsp_wrongmenu= new ImageIcon(getClass().getResource("/show_wrongmenu.png"));
		JLabel displaywrong = new JLabel(dsp_wrongmenu);
		show_wrongmenu.add(displaywrong);
		show_wrongmenu.setBounds(674, 384, 129, 171);
		show_wrongmenu.setOpaque(false);
		show_wrongmenu.setVisible(false);

		
        
    	

//    	level1pane.add(level1);
//		level1pane.setOpaque(false);
//		level1pane.setVisible(true);
//        level1pane.setBackground(new Color(0,0,0,0));
//		
//	
	
		
		this.add(mc_pane);
		this.setBackground(new Color(0,0,0,0));
//		mc_pane.add(customer_pane);
		
		mc_pane.add(level1bt);
		mc_pane.add(level1bt_cp);
		mc_pane.add(level2bt);
		mc_pane.add(level2bt_cp);
		mc_pane.add(level3bt);
		mc_pane.add(level3bt_cp);
		mc_pane.add(level1bt_f);
		mc_pane.add(level2bt_f);
		mc_pane.add(level3bt_f);






		mc_pane.add(setting);
	
		mc_pane.add(customer,0);
		
		
		
		mc_pane.add(matcha);
		mc_pane.add(milktea);

		mc_pane.add(thaitea);
		mc_pane.add(oreo);
		mc_pane.add(strawberry);
		mc_pane.add(melon);
		mc_pane.add(soda);
		mc_pane.add(milk);

		mc_pane.add(blender);
		mc_pane.add(cup);
		mc_pane.add(hot);
		mc_pane.add(ice);

		
		mc_pane.add(showCup,0);
		mc_pane.add(showHot,0);
		mc_pane.add(showIce,5);
		mc_pane.add(showMilk,0);
		mc_pane.add(showSoda,0);
		mc_pane.add(showOreo,0);

		mc_pane.add(show_ice_matcha,0);
		mc_pane.add(show_ice_milkt,0);
		mc_pane.add(show_ice_thait,0);
		mc_pane.add(show_soda_strawberry,0);
		mc_pane.add(show_soda_melon,0);
		
		mc_pane.add(show_hot_thait,0);
		mc_pane.add(show_hot_matcha,0);
		

		
		mc_pane.add(show_pre_melon,0);
		mc_pane.add(show_blend_oreo,0);

		mc_pane.add(show_blend_thait,0);
		mc_pane.add(show_blend_milkt,0);
		mc_pane.add(show_blend_matcha,0);
		mc_pane.add(show_blend_melon,0);


		mc_pane.add(show_wrongmenu,0);
		




		
		
		
		mc_pane.add(bin);

		mc_pane.add(send);

		mc_pane.add(background);

//	
   
    }
	public void removeDisplay() {
		this.showCup.setVisible(false);
		this.showHot.setVisible(false);
		this.showIce.setVisible(false);
		this.showMilk.setVisible(false);
		this.show_ice_matcha.setVisible(false);
		this.show_ice_milkt.setVisible(false);
		this.show_ice_thait.setVisible(false);
		this.showSoda.setVisible(false);
		this.show_soda_strawberry.setVisible(false);
		this.show_soda_melon.setVisible(false);
		this.show_hot_thait.setVisible(false);
		this.show_hot_matcha.setVisible(false);
		this.showOreo.setVisible(false);
		this.show_blend_oreo.setVisible(false);
		this.show_blend_thait.setVisible(false);
		this.show_blend_matcha.setVisible(false);
		this.show_blend_milkt.setVisible(false);

		this.show_pre_melon.setVisible(false);
		this.show_blend_melon.setVisible(false);
		this.show_wrongmenu.setVisible(false);

		mc_pane.revalidate();
		mc_pane.repaint();
		
	}
	public void display() {
		
		if ( cupCounter > 0) {
			this.showCup.setVisible(true);
			this.revalidate();
			this.repaint();
		}
		
		if (hotCounter >0) {
			this.showHot.setVisible(true);
			this.revalidate();
			this.repaint();
		}
		
		if (iceCounter >0) {
			this.showIce.setVisible(true);
			this.revalidate();
			this.repaint();
		}
		if (milkCounter >0) {
			this.showMilk.setVisible(true);
			this.revalidate();
			this.repaint();
		}
		
		if (iceCounter >0 && matchaCounter > 0) {
			this.show_ice_matcha.setVisible(true);
			this.revalidate();
			this.repaint();
		}

		if (iceCounter >0 && milktCounter > 0) {
			this.show_ice_milkt.setVisible(true);
			this.revalidate();
			this.repaint();
			}
		if (iceCounter >0 && thaitCounter > 0) {
			this.show_ice_thait.setVisible(true);
			this.revalidate();
			this.repaint();
			}
		if (sodaCounter > 0) {
			this.showSoda.setVisible(true);
			this.revalidate();
			this.repaint();
			
		}
		
		if (sodaCounter > 0 && strawberryCounter > 0) {
			this.show_soda_strawberry.setVisible(true);
			this.revalidate();
			this.repaint();
			
		}
		if (sodaCounter > 0 && melonCounter > 0) {
			this.show_soda_melon.setVisible(true);
			this.revalidate();
			this.repaint();
		}
		
		if (hotCounter > 0 && thaitCounter > 0) {
			this.show_hot_thait.setVisible(true);
			this.revalidate();
			this.repaint();
			
		}
		if (hotCounter > 0 && matchaCounter > 0) {
			this.show_hot_matcha.setVisible(true);
			this.revalidate();
			this.repaint();
			
		}
		
		if (milkCounter > 0 && melonCounter >0) {
			this.show_pre_melon.setVisible(true);
			this.revalidate();
			this.repaint();
			
		}

		if (oreoCounter > 0) {
			this.showOreo.setVisible(true);
			this.revalidate();
			this.repaint();
			
		}
		if (oreoCounter > 0 && blenderCounter >0) {
			this.show_blend_oreo.setVisible(true);
			this.revalidate();
			this.repaint();
			
		}
			if (melonCounter > 0 && blenderCounter >0) {
			this.show_blend_melon.setVisible(true);
			this.revalidate();
			this.repaint();
			
		}
		if (matchaCounter > 0 && blenderCounter >0) {
			this.show_blend_matcha.setVisible(true);
			this.revalidate();
			this.repaint();
			
		}
		
		if (milktCounter > 0 && blenderCounter >0) {
			this.show_blend_milkt.setVisible(true);
			this.revalidate();
			this.repaint();
			
		}
		if (thaitCounter > 0 && blenderCounter >0) {
			this.show_blend_thait.setVisible(true);
			this.revalidate();
			this.repaint();
			
		}

	}

	
	public void sendOrder() {

		if (ingreCounter < 2) {
			System.out.println("not enough ingredients");
		}

		if (ingreCounter == 3) {
			if (cupCounter > 0 && hotCounter > 0 && matchaCounter > 0) {
				hotMatcha = true;
				System.out.println("hot Matcha");
			} else if (cupCounter > 0 && hotCounter > 0 && thaitCounter > 0) {
				hotThait = true;
				System.out.println("hot Thait");
				
			} else {
				System.out.println("wrong order");
				removeDisplay();
				this.show_wrongmenu.setVisible(true);
				this.revalidate();
				this.repaint();			

			}
		}

		if (ingreCounter == 4) {
			if (cupCounter > 0 && iceCounter > 0 && milkCounter > 0 && matchaCounter > 0) {
				iceMatcha = true;
				System.out.println("ice Matcha");
			}

			else if (cupCounter > 0 && iceCounter > 0 && milkCounter > 0 && milktCounter > 0) {
				iceMilkt = true;
				System.out.println("ice milkt");

			} else if (cupCounter > 0 && iceCounter > 0 && milkCounter > 0 && thaitCounter > 0) {
				iceThait = true;
				System.out.println("ice thait");
			}

			else if (cupCounter > 0 && iceCounter > 0 && sodaCounter > 0 && melonCounter > 0) {
				sodaMelon = true;
				System.out.println("melon soda");
			}

			else if (cupCounter > 0 && iceCounter > 0 && sodaCounter > 0 && strawberryCounter > 0) {
				sodaStrawberry = true;
			
				System.out.println("strawberry soda");
			}
			else {
				System.out.println("wrong order");
				removeDisplay();
				this.show_wrongmenu.setVisible(true);
				this.revalidate();
				this.repaint();
			}
		}
		

		if (ingreCounter >= 5) {
			if (cupCounter > 0 && iceCounter > 0 && milkCounter > 0 && matchaCounter > 0 && blenderCounter > 0) {
				blendMatcha = true;
		
				System.out.println("blended ice matcha");
			} else if (cupCounter > 0 && iceCounter > 0 && milkCounter > 0 && melonCounter > 0 && blenderCounter > 0) {
				blendMelon = true;
	
				System.out.println("blended melon");
			} else if (cupCounter > 0 && iceCounter > 0 && milkCounter > 0 && milktCounter > 0 && blenderCounter > 0) {
				blendMilkt = true;
				System.out.println("blended milkt");
			} else if (cupCounter > 0 && iceCounter > 0 && milkCounter > 0 && thaitCounter > 0 && blenderCounter > 0) {
				blendThait = true;
				
				System.out.println("blended thait");
			} else if (cupCounter > 0 && iceCounter > 0 && milkCounter > 0 && oreoCounter > 0 && blenderCounter > 0) {
				blendOreo = true;
				
				System.out.println("blended oreo");
			} else {
				System.out.println("wrong order");
				removeDisplay();
				this.show_wrongmenu.setVisible(true);
				this.revalidate();
				this.repaint();
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == setting) {
			JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
			frame.getContentPane().removeAll();
			frame.getContentPane().add(new menu());
			frame.revalidate();
			frame.repaint();
		}
		
		if (e.getSource() == level1bt) {
			this.level1bt.setVisible(false);
			mc_pane.setLayer(customer, JLayeredPane.PALETTE_LAYER);
			customer.timer1.start();
			customer.level1Count += 1;
			
		}
		if (e.getSource() == level1bt_cp) {
			customer.level1Count = 0;
			customer.tCount = 0;
			this.level1bt_cp.setVisible(false);
			this.level2bt.setVisible(true)	;		
		}
		if (e.getSource() == level2bt) {
			this.level2bt.setVisible(false)	;		
			mc_pane.setLayer(customer, JLayeredPane.PALETTE_LAYER);
			customer.level2Count += 1;
			customer.timer1.restart();
			customer.timer1.start();
			
		
		}
		if (e.getSource() == level2bt_cp) {
			customer.level2Count = 0;
			customer.tCount = 0;
			this.level2bt_cp.setVisible(false);
			this.level3bt.setVisible(true)	;	}
		

		if (e.getSource() == level3bt) {
			this.level3bt.setVisible(false)	;		
			mc_pane.setLayer(customer, JLayeredPane.PALETTE_LAYER);
			customer.level3Count += 1;
			customer.timer1.restart();
			customer.timer1.start();
		}
		if (e.getSource() == level3bt_cp) {
			customer.level3Count = 0;
			customer.tCount = 0;
			JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
			frame.getContentPane().removeAll();
			frame.getContentPane().add(new endgame());
			frame.revalidate();
			frame.repaint();
		}
		
//		if (e.getSource() == level1bt_f || e.getSource() == level2bt_f || e.getSource() == level3bt_f) {
//			JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
//			frame.getContentPane().removeAll();
//			frame.getContentPane().add(new TaobinMachine());
//			frame.revalidate();
//			frame.repaint();
//		}
		
		
		
		if (e.getSource() == cup) { 
			cupCounter++;
			ingreCounter++;
			display();


		}

		if (e.getSource() == hot) {
			hotCounter++;
			ingreCounter++;
			display();

		}

		if (e.getSource() == ice) {
			iceCounter++;
			ingreCounter++;

			display();

		}

		if (e.getSource() == milk) {
			milkCounter++;
			ingreCounter++;

			display();

		}

		if (e.getSource() == matcha) {
			matchaCounter++;
			ingreCounter++;
			display();

		}
		if (e.getSource() == milktea) {
			

			milktCounter++;
			ingreCounter++;
			display();

		}

		if (e.getSource() == thaitea) {
			

			thaitCounter++;
			ingreCounter++;
			display();

		}

		if (e.getSource() == oreo) {
			

			oreoCounter++;
			ingreCounter++;
			System.out.println(ingreCounter);

			display();

		}

		if (e.getSource() == soda) {
	
			sodaCounter++;
			ingreCounter++;
			display();

		}

		if (e.getSource() == strawberry) {
		

			strawberryCounter++;
			ingreCounter++;
			display();

		}
		if (e.getSource() == melon) {
		
			melonCounter++;
			ingreCounter++;
			display();

		}

		if (e.getSource() == blender) {

			blenderCounter = blenderCounter+1;
			ingreCounter++;
			System.out.println(blenderCounter);

			System.out.println(ingreCounter);

			display();

		}

		if (e.getSource() == oreo) {

			oreoCounter++;
			ingreCounter++;
			display();

		}

		if (e.getSource() == bin) {
			ingreCounter = 0;
			matchaCounter = 0;
			thaitCounter = 0;
			milktCounter = 0;
			oreoCounter = 0;
			iceCounter = 0;
			hotCounter = 0;
			cupCounter = 0;
			melonCounter = 0;
			strawberryCounter = 0;
			sodaCounter = 0;
			milkCounter = 0;
			blenderCounter = 0;
			removeDisplay();
		

		}
		if (e.getSource() == send) {
			sendOrder();
			checkOrder();
			ingreCounter = 0;
			matchaCounter = 0;
			thaitCounter = 0;
			milktCounter = 0;
			oreoCounter = 0;
			iceCounter = 0;
			hotCounter = 0;
			cupCounter = 0;
			melonCounter = 0;
			strawberryCounter = 0;
			sodaCounter = 0;
			milkCounter = 0;
			blenderCounter = 0;
			

		}
	
		
	}
	
//	public static void checkFailed() {
//		if (customer.checkfail ==1) {
//		if(customer.tCount == 75000 && customer.level1Count == 1) {
//			if (customer.completeOrderCounter < 5) {
//				this.level1bt_f.setVisible(true);
//			}
//		}
//		else if(customer.tCount == 75000 && customer.level2Count ==1) {
//			if (customer.completeOrderCounter < 7) {
//				this.level2bt_f.setVisible(true);		
//		}
//		}
//		else if(customer.tCount == 75000 && customer.level3Count ==1) {
//			if (customer.completeOrderCounter < 10) {
//				this.level3bt_f.setVisible(true);
//			}
//		}
//	}}
	
	
	public void checkOrder() {
		System.out.println("need = "+customer.need_1);
		
		if (customer.need_1 == 0 && blendMatcha == true) {
			removeDisplay();
			customer.trayX = -1000;
			customer.orderX = -1000;
		
			customer.wait.stop();
			customer.leavingCustomer();
			if (blendMatcha == true){
			customer.completeOrderCounter ++; 
			
			}
			if (blendMatcha == false) {
			}
			


			
		}
		if (customer.need_1 == 1 && blendMelon == true){
			customer.completeOrderCounter ++; 
			removeDisplay();
			customer.trayX = -1000;
			customer.orderX = -1000;
		
			customer.wait.stop();
			customer.leavingCustomer();



		}
		if (customer.need_1 == 2 && blendMilkt == true){
			customer.completeOrderCounter ++; 
			removeDisplay();
			customer.trayX = -1000;
			customer.orderX = -1000;
	
			customer.wait.stop();
			customer.leavingCustomer();



		}
		if (customer.need_1 == 3 && blendOreo == true){
			customer.completeOrderCounter ++; 
			removeDisplay();
			customer.trayX = -1000;
			customer.orderX = -1000;
		
			customer.wait.stop();
			customer.leavingCustomer();



		}
		if (customer.need_1 == 4 && blendThait== true){
			customer.completeOrderCounter ++; 
			removeDisplay();
			customer.trayX = -1000;
			customer.orderX = -1000;
		
			customer.wait.stop();
			customer.leavingCustomer();



		}
		if (customer.need_1 == 5 && hotMatcha == true){
			customer.completeOrderCounter ++; 
			removeDisplay();	
			customer.trayX = -1000;
			customer.orderX = -1000;
		
			customer.wait.stop();
			customer.leavingCustomer();



		}
		if (customer.need_1 == 6 && hotThait == true){
			customer.completeOrderCounter ++; 
			removeDisplay();
			customer.trayX = -1000;
			customer.orderX = -1000;
		
			customer.wait.stop();
			customer.leavingCustomer();
			customer.nextCustomer();



		}
		if (customer.need_1 == 7 && iceMilkt== true){
			customer.completeOrderCounter ++; 
			removeDisplay();
			customer.trayX = -1000;
			customer.orderX = -1000;
		
			customer.wait.stop();
			
			customer.leavingCustomer();
			customer.nextCustomer();



		}		
		if (customer.need_1 == 8 && iceThait== true){
			customer.completeOrderCounter ++; 
			removeDisplay();
			customer.trayX = -1000;
			customer.orderX = -1000;
		
			customer.wait.stop();
			customer.leavingCustomer();



		}
		if (customer.need_1 == 9 && iceMatcha== true){
			customer.completeOrderCounter ++; 
			removeDisplay();
			customer.trayX = -1000;
			customer.orderX = -1000;
		
			customer.wait.stop();
			customer.leavingCustomer();			

			


		}
		if (customer.need_1 == 10 && sodaMelon== true){
			customer.completeOrderCounter ++; 
			removeDisplay();
			customer.trayX = -1000;
			customer.orderX = -1000;
		
			customer.wait.stop();
			customer.leavingCustomer();



		}
		if (customer.need_1 == 11 && sodaStrawberry== true){
			customer.completeOrderCounter ++; 
			removeDisplay();
			customer.trayX = -1000;
			customer.orderX = -1000;
		
			customer.wait.stop();
			customer.leavingCustomer();


		}
		System.out.println("completeCounter = " + customer.completeOrderCounter);
		customer.target_goal1();
		
		if (customer.level1Count == 1 && customer.completeOrderCounter == 5) {
			System.out.println("okay done");
			customer.x = -1000;
			customer.timer1.stop();
			customer.walk.stop();
			customer.leave.stop();
			customer.wait.stop();
			this.level1bt_cp.setVisible(true);
			
		}

		if (customer.level2Count == 1 && customer.completeOrderCounter == 7) {
			System.out.println("okay done");
			customer.x = -1000;
			customer.timer1.stop();
			customer.walk.stop();
			customer.leave.stop();
			customer.wait.stop();
			this.level2bt_cp.setVisible(true);
		}
		
		if (customer.level3Count == 1 && customer.completeOrderCounter == 10) {
			System.out.println("okay done");
			customer.x = -1000;
			customer.timer1.stop();
			customer.walk.stop();
			customer.leave.stop();
			customer.wait.stop();
			this.level3bt_cp.setVisible(true);
		}
	}
}
		
		
	


