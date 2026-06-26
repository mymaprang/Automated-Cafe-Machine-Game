package Game;

import java.awt.BasicStroke;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public  class CustomerRandom extends JLayeredPane {

	protected Font myFont = null;

	protected Level1Timer game_timer_1 = new Level1Timer();
	public Timer timer1 = new Timer(1000, game_timer_1);

	protected WaitTimer waitTimer = new WaitTimer();
	public Timer wait = new Timer(1000, waitTimer);

	protected WalkTimer walktimer = new WalkTimer();
	public Timer walk = new Timer(300, walktimer);

	LeaveTimer leavetimer = new LeaveTimer();
	public Timer leave = new Timer(300, leavetimer);

	private Image bI1;
	private Image bI2;

	private Image bL1;
	private Image bL2;

	private Image customer;

	Boolean customerOrder = false;

	private Image timer;
	private Image cstm;
	private Image cstmCount;

	int x = -80;
	public int waitCount = 0;

	Image waiting;
	public int customerNum;
	public int random_amount;
	public int need_1;


	JPanel needtray = new JPanel();
	Image tray;
	Image order;


	public int trayX = 100;
	public int orderX = 170;

	static int tCount = 0;

	public static int completeOrderCounter = 0;
	protected Random r = new Random();

	Image level1_complete;

	public static int level1Count = 0;
	public static int level2Count = 0;
	public static int level3Count = 0;
	public static int level4Count = 0;
	public static int level5Count = 0;
	
	public static int checkfail =0;

	protected int number;

	public int zz = 0;
	private int xx = -1000;

	public void target_goal1() {

		System.out.println("lvl1" + level1Count);
		System.out.println("lvl2" + level2Count);
		System.out.println("lvl3" + level3Count);

		ImageIcon cstm_i = new ImageIcon(getClass().getResource("/cstm_i.png"));
		Image cstm_1 = cstm_i.getImage();
		Image newcstm_i = cstm_1.getScaledInstance(60, 55, java.awt.Image.SCALE_SMOOTH);
		ImageIcon cstm_i_new = new ImageIcon(newcstm_i);
		cstm = cstm_i_new.getImage();

		if (level1Count == 1) {

			if (completeOrderCounter == 0) {
				number = 5;
				repaint();
			}
			if (completeOrderCounter == 1) {
				number = 4;
				repaint();
			}
			if (completeOrderCounter == 2) {
				number = 3;
				repaint();
			}
			if (completeOrderCounter == 3) {
				number = 2;
				repaint();
			}
			if (completeOrderCounter == 4) {

				number = 1;
				repaint();
			}
			if (completeOrderCounter == 5) {

				number = 0;
				repaint();

			}
		}

		if (level2Count == 1) {
			if (completeOrderCounter == 0) {
				number = 7;
				repaint();
			}
			if (completeOrderCounter == 1) {
				number = 6;
				repaint();
			}
			if (completeOrderCounter == 2) {
				number = 5;
				repaint();
			}
			if (completeOrderCounter == 3) {
				number = 4;
				repaint();
			}
			if (completeOrderCounter == 4) {

				number = 3;
				repaint();
			}
			if (completeOrderCounter == 5) {

				number = 2;
				repaint();

			}
			if (completeOrderCounter == 6) {

				number = 1;
				repaint();
			}
			if (completeOrderCounter == 7) {

				number = 0;
				repaint();

			}
		}
		if (level3Count == 1) {
			if (completeOrderCounter == 0) {
				number = 10;
				repaint();
			}
			if (completeOrderCounter == 1) {
				number = 9;
				repaint();
			}
			if (completeOrderCounter == 2) {
				number = 8;
				repaint();
			}
			if (completeOrderCounter == 3) {
				number = 7;
				repaint();
			}
			if (completeOrderCounter == 4) {

				number = 6;
				repaint();
			}
			if (completeOrderCounter == 5) {

				number = 5;
				repaint();

			}
			if (completeOrderCounter == 6) {

				number = 4;
				repaint();
			}
			if (completeOrderCounter == 7) {

				number = 3;
				repaint();

			}
			if (completeOrderCounter == 8) {

				number = 2;
				repaint();

			}
			if (completeOrderCounter == 9) {

				number = 1;
				repaint();
			}
			if (completeOrderCounter == 10) {

				number = 0;
				repaint();
		}
		}
	}

	private class Level1Timer implements ActionListener {

		void timerStart() {
			System.out.println("gtime" + tCount);
			tCount = tCount + 1000;
			if (tCount == 1000) {
				ImageIcon timer1 = new ImageIcon(getClass().getResource("/timer1.png"));
				timer = timer1.getImage();
				completeOrderCounter = 0;
				xx = 180;
				target_goal1();
				nextCustomer();

				repaint();
			}

			if (tCount == 15000) {
				ImageIcon timer2 = new ImageIcon(getClass().getResource("/timer2.png"));
				timer = timer2.getImage();
				repaint();

			}

			if (tCount == 30000) {
				ImageIcon timer3 = new ImageIcon(getClass().getResource("/timer3.png"));
				timer = timer3.getImage();
				repaint();

			}

			if (tCount == 45000) {
				ImageIcon timer4 = new ImageIcon(getClass().getResource("/timer4.png"));
				timer = timer4.getImage();
				repaint();

			}

			if (tCount == 60000) {
				ImageIcon timer4 = new ImageIcon(getClass().getResource("/timer5.png"));
				timer = timer4.getImage();
				repaint();

			}
			if (tCount == 75000) {
				timer1.stop();
				wait.stop();
				walk.stop();
				leave.stop();
				checkfail=1;

			}
		}

		public void actionPerformed(ActionEvent e) {
			timerStart();
		}
	}

	public CustomerRandom() {

		this.setSize(500, 700);
		this.setBounds(0, 0, 500, 700);
		this.setOpaque(false);
		this.setVisible(true);

	}

	public void nextCustomer() {

		customerNum = 0;
		need_1 = 0;
		waitCount = 0;
		x = -80;
		
		walk.restart();

		customerNum = r.nextInt(5);
		walk.start();

		


		System.out.println("customer no " + customerNum);


		System.out.println("walk timer count" + x);

	}

	public void random_amount() {

		
			need_1 = r.nextInt(12);
			System.out.println("Order_Number = " + need_1);
			random_need_1();
		

		}


	public void random_need_1() {

		trayX = 100;
		orderX = 170;

		System.out.println("tray x = " + trayX);
		System.out.println("order x = " + orderX);
		

		tray = loadImage("/drinkMenu/need_tray.png");
		if (tray == null) {
			tray = createFallbackTray();
		}
		repaint();

		if (need_1 == 0) {

			ImageIcon dsp_need_matc = new ImageIcon(getClass().getResource("/drinkMenu/d_b_matc.png"));
			order = dsp_need_matc.getImage();
			repaint();
		}

		if (need_1 == 1) {

			ImageIcon dsp_need_melon = new ImageIcon(getClass().getResource("/drinkMenu/d_b_melon.png"));
			order = dsp_need_melon.getImage();
			repaint();

		}
		if (need_1 == 2) {

			ImageIcon dsp_need_milkt = new ImageIcon(getClass().getResource("/drinkMenu/d_b_milkt.png"));
			order = dsp_need_milkt.getImage();
			repaint();

		}
		if (need_1 == 3) {

			ImageIcon dsp_need_oreo = new ImageIcon(getClass().getResource("/drinkMenu/d_b_oreo.png"));
			order = dsp_need_oreo.getImage();
			repaint();

		}

		if (need_1 == 4) {

			ImageIcon dsp_need_thait = new ImageIcon(getClass().getResource("/drinkMenu/d_b_thait.png"));
			order = dsp_need_thait.getImage();
			repaint();

		}
		if (need_1 == 5) {

			ImageIcon dsp_need_h_matc = new ImageIcon(getClass().getResource("/drinkMenu/d_h_matc.png"));
			order = dsp_need_h_matc.getImage();
			repaint();

		}
		if (need_1 == 6) {

			ImageIcon dsp_need_h_thait = new ImageIcon(getClass().getResource("/drinkMenu/d_h_thait.png"));
			order = dsp_need_h_thait.getImage();
			repaint();

		}

		if (need_1 == 7) {

			ImageIcon dsp_need_i_milkt = new ImageIcon(getClass().getResource("/drinkMenu/d_i_milkt.png"));
			order = dsp_need_i_milkt.getImage();
			repaint();

		}
		if (need_1 == 8) {

			ImageIcon dsp_need_i_thait = new ImageIcon(getClass().getResource("/drinkMenu/d_i_thait.png"));
			order = dsp_need_i_thait.getImage();
			repaint();

		}

		if (need_1 == 9) {

			ImageIcon dsp_need_i_matc = new ImageIcon(getClass().getResource("/drinkMenu/d_i_matc.png"));
			order = dsp_need_i_matc.getImage();
			repaint();

		}
		if (need_1 == 10) {

			ImageIcon dsp_need_s_melon = new ImageIcon(getClass().getResource("/drinkMenu/d_s_melon.png"));
			order = dsp_need_s_melon.getImage();
			repaint();

		}
		if (need_1 == 11) {

			ImageIcon dsp_need_s_stbr = new ImageIcon(getClass().getResource("/drinkMenu/d_s_stbr.png"));
			order = dsp_need_s_stbr.getImage();
			repaint();

		}

		repaint();

	}

	private Image loadImage(String path) {
		URL imageUrl = getClass().getResource(path);
		if (imageUrl == null) {
			System.out.println("Missing image: " + path);
			return null;
		}
		return new ImageIcon(imageUrl).getImage();
	}

	private Image createFallbackTray() {
		BufferedImage fallbackTray = new BufferedImage(250, 130, BufferedImage.TYPE_INT_ARGB);
		Graphics2D g = fallbackTray.createGraphics();
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g.setColor(new Color(255, 245, 226, 230));
		g.fillRoundRect(10, 10, 220, 110, 28, 28);
		g.setColor(new Color(61, 37, 48));
		g.setStroke(new BasicStroke(4));
		g.drawRoundRect(10, 10, 220, 110, 28, 28);
		g.dispose();
		return fallbackTray;
	}

	@Override
	public void paintComponent(Graphics g) {

		try (InputStream is = getClass().getResourceAsStream("/font.ttf")) {
			 myFont = Font.createFont(Font.TRUETYPE_FONT, is).deriveFont(80f);
		} catch (IOException | FontFormatException e) {
			e.printStackTrace();
		}

		Color clear = new Color(0, 0, 0, 0);

		super.paintComponent(g);
		Graphics2D walk = (Graphics2D) g;

		walk.drawImage(customer, x, 200, null);

		Graphics2D g2d = (Graphics2D) g;
		g2d.drawImage(tray, trayX, 150, null);
		g2d.drawImage(order, orderX, 165, null);
		


		Graphics2D gg = (Graphics2D) g;
		gg.drawImage(timer, 225, 20, null);
		gg.drawImage(cstm, 115, 32, null);
		gg.setColor(new Color(61, 37, 48));
		
		gg.setFont(myFont);
		String num = Integer.toString(number);
		gg.drawString(num, xx, 75);
		
		

	}

	private class WaitTimer extends WalkTimer implements ActionListener {

		public void waiting() {

			waitCount = waitCount + 500;
			System.out.println("wait " + waitCount);

			if (waitCount == 1000) {
				random_amount();
				repaint();

			}

			if (customerNum == 0 && waitCount == 1000) {
				ImageIcon bozz_idle = new ImageIcon(getClass().getResource("/cstm/boss_idle.png"));
				Image imageBI = bozz_idle.getImage();
				Image newBI = imageBI.getScaledInstance(425, 425, java.awt.Image.SCALE_SMOOTH);
				ImageIcon bozzIdle = new ImageIcon(newBI);
				customer = bozzIdle.getImage();

				repaint();

			}

			if (customerNum == 0 && waitCount == 6000) {
				ImageIcon bozz_annoyed = new ImageIcon(getClass().getResource("/cstm/boss_annoyed.png"));
				Image imageBA = bozz_annoyed.getImage();
				Image newBA = imageBA.getScaledInstance(425, 425, java.awt.Image.SCALE_SMOOTH);
				ImageIcon bozzAnnoyed = new ImageIcon(newBA);
				customer = bozzAnnoyed.getImage();
				repaint();

			}
			if (customerNum == 0 && waitCount == 12000) {
				ImageIcon bozz_leave = new ImageIcon(getClass().getResource("/cstm/boss_leave.png"));
				Image imageBL = bozz_leave.getImage();
				Image newBL = imageBL.getScaledInstance(425, 425, java.awt.Image.SCALE_SMOOTH);
				ImageIcon bozzLeave = new ImageIcon(newBL);
				customer = bozzLeave.getImage();

				repaint();

			}

			if (customerNum == 1 && waitCount == 1000) {
				ImageIcon dn_idle = new ImageIcon(getClass().getResource("/cstm/donut_idle.png"));
				Image imageDI = dn_idle.getImage(); // transform it
				Image newDI = imageDI.getScaledInstance(425, 425, java.awt.Image.SCALE_SMOOTH);
				ImageIcon dnIdle = new ImageIcon(newDI);
				customer = dnIdle.getImage();
//				randomOrder.random_amount();

				repaint();

			}
			if (customerNum == 1 && waitCount == 6000) {
				ImageIcon dn_annoyed = new ImageIcon(getClass().getResource("/cstm/donut_annoyed.png"));
				Image imageDA = dn_annoyed.getImage();
				Image newDA = imageDA.getScaledInstance(425, 425, java.awt.Image.SCALE_SMOOTH);
				ImageIcon dnAnnoyed = new ImageIcon(newDA);
				customer = dnAnnoyed.getImage();
				repaint();

			}
			if (customerNum == 1 && waitCount == 12000) {
				ImageIcon dn_leave = new ImageIcon(getClass().getResource("/cstm/donut_leave.png"));
				Image imageDL = dn_leave.getImage();
				Image newDL = imageDL.getScaledInstance(425, 425, java.awt.Image.SCALE_SMOOTH);
				ImageIcon dnLeave = new ImageIcon(newDL);
				customer = dnLeave.getImage();
				repaint();

			}

			if (customerNum == 2 && waitCount == 1000) {
				ImageIcon mp_idle = new ImageIcon(getClass().getResource("/cstm/maprang_idle.png"));
				Image imageMI = mp_idle.getImage();
				Image newMI = imageMI.getScaledInstance(425, 425, java.awt.Image.SCALE_SMOOTH);
				ImageIcon mpIdle = new ImageIcon(newMI);
				customer = mpIdle.getImage();
//				randomOrder.random_amount();

				repaint();

			}

			if (customerNum == 2 && waitCount == 6000) {
				ImageIcon mp_annoyed = new ImageIcon(getClass().getResource("/cstm/maprang_annoyed.png"));
				Image imageMA = mp_annoyed.getImage();
				Image newMA = imageMA.getScaledInstance(425, 425, java.awt.Image.SCALE_SMOOTH);
				ImageIcon mpAnnoyed = new ImageIcon(newMA);
				customer = mpAnnoyed.getImage();
				repaint();

			}

			if (customerNum == 2 && waitCount == 12000) {
				ImageIcon mp_leave = new ImageIcon(getClass().getResource("/cstm/maprang_leave.png"));
				Image imageML = mp_leave.getImage();
				Image newML = imageML.getScaledInstance(425, 425, java.awt.Image.SCALE_SMOOTH);
				ImageIcon mpAnnoyed = new ImageIcon(newML);
				customer = mpAnnoyed.getImage();
				repaint();

			}
			if (customerNum == 3 && waitCount == 1000) {
				ImageIcon j_idle = new ImageIcon(getClass().getResource("/cstm/jak_idle.png"));
				Image imageJI = j_idle.getImage();
				Image newJI = imageJI.getScaledInstance(425, 425, java.awt.Image.SCALE_SMOOTH);
				ImageIcon jIdle = new ImageIcon(newJI);
				customer = jIdle.getImage();
//				randomOrder.random_amount();

				repaint();

			}
			if (customerNum == 3 && waitCount == 6000) {
				ImageIcon j_annoyed = new ImageIcon(getClass().getResource("/cstm/jak_annoyed.png"));
				Image imageJA = j_annoyed.getImage();
				Image newJA = imageJA.getScaledInstance(425, 425, java.awt.Image.SCALE_SMOOTH);
				ImageIcon jAnnoyed = new ImageIcon(newJA);
				customer = jAnnoyed.getImage();

				repaint();

			}
			if (customerNum == 3 && waitCount == 12000) {
				ImageIcon j_leave = new ImageIcon(getClass().getResource("/cstm/jak_leave.png"));
				Image imageJL = j_leave.getImage();
				Image newJL = imageJL.getScaledInstance(425, 425, java.awt.Image.SCALE_SMOOTH);
				ImageIcon jLeave = new ImageIcon(newJL);
				customer = jLeave.getImage();
				repaint();

			}
			if (customerNum == 4 && waitCount == 1000) {
				ImageIcon g_idle = new ImageIcon(getClass().getResource("/cstm/guy_idle.png"));
				Image imageGI = g_idle.getImage();
				Image newGI = imageGI.getScaledInstance(425, 425, java.awt.Image.SCALE_SMOOTH);
				ImageIcon gIdle = new ImageIcon(newGI);
				customer = gIdle.getImage();
//				randomOrder.random_amount();

				repaint();

			}

			if (customerNum == 4 && waitCount == 6000) {
				ImageIcon g_annoyed = new ImageIcon(getClass().getResource("/cstm/guy_annoyed.png"));
				Image imageGA = g_annoyed.getImage();
				Image newGA = imageGA.getScaledInstance(425, 425, java.awt.Image.SCALE_SMOOTH);
				ImageIcon gAnnoyed = new ImageIcon(newGA);
				customer = gAnnoyed.getImage();

				repaint();

			}

			if (customerNum == 4 && waitCount == 12000) {
				ImageIcon g_leave = new ImageIcon(getClass().getResource("/cstm/guy_leave.png"));
				Image imageGL = g_leave.getImage();
				Image newGL = imageGL.getScaledInstance(425, 425, java.awt.Image.SCALE_SMOOTH);
				ImageIcon gLeave = new ImageIcon(newGL);
				customer = gLeave.getImage();
				repaint();

			}

			if (waitCount == 13000) {
				trayX = -1000;
				orderX = -1000;
	
				wait.stop();
				leavingCustomer();
			}

		}

		@Override
		public void actionPerformed(ActionEvent e) {
			waiting();

			// TODO Auto-generated method stub

		}

	}

	private class WalkTimer implements ActionListener {

		private void moving() {

			x = x + 10;
			System.out.println("walk moving = " + x);
			if (x == -40) {
				customer = bI1;
				repaint();
			}

			if (x == -30) {
				customer = bI1;
				repaint();
			}

			if (x == -20) {
				customer = bI2;
				repaint();
			}

			if (x == -10) {
				customer = bI1;
				repaint();
			}

			if (x == 0) {
				customer = bI2;
				repaint();
				walk.stop();
				wait.start();
			}

		}

		public void actionPerformed(ActionEvent e) {
			displayCustomer();
			moving();
		}

	}

	private class LeaveTimer extends WaitTimer implements ActionListener {

		private void moving() {
			need_1 = -100;
			x = x - 10;
			System.out.println("leave moving x = " + x);
			if (x == 0) {
				customer = bL1;
				repaint();
			}
			if (x == -10) {
				customer = bL2;
				repaint();
			}
			if (x == -20) {
				customer = bL1;
				repaint();
			}
			if (x == -30) {
				customer = bL2;
				repaint();
			}
			if (x == -40) {
				customer = bL1;
				repaint();
			}
			if (x == -50) {
				customer = bL2;
				repaint();
			}
			if (x == -60) {
				customer = bL1;
				repaint();
			}

			if (x == -70) {
				customer = bL1;
				repaint();
				leave.stop();
				nextCustomer();

			}
		}

		public void actionPerformed(ActionEvent e) {
			moving();
		}

	}

	public void displayCustomer() {

		if (customerNum == 0) {

			ImageIcon bozz_walk = new ImageIcon(getClass().getResource("/cstm/bozz_walk1.png"));
			Image imageb1 = bozz_walk.getImage(); // transform it
			Image newbozz = imageb1.getScaledInstance(425, 425, java.awt.Image.SCALE_SMOOTH);
			ImageIcon bozzwalk1 = new ImageIcon(newbozz);
			bI1 = bozzwalk1.getImage();

			ImageIcon bozz_walk2 = new ImageIcon(getClass().getResource("/cstm/bozz_walk2.png"));
			Image imageb2 = bozz_walk2.getImage(); // transform it
			Image newbozz2 = imageb2.getScaledInstance(425, 425, java.awt.Image.SCALE_SMOOTH);
			ImageIcon bozzwalk2 = new ImageIcon(newbozz2);
			bI2 = bozzwalk2.getImage();
		}

		if (customerNum == 1) {
			ImageIcon dn_walk = new ImageIcon(getClass().getResource("/cstm/dn_walk1.png"));
			Image imagedn1 = dn_walk.getImage(); // transform it
			Image newdn = imagedn1.getScaledInstance(425, 425, java.awt.Image.SCALE_SMOOTH);
			ImageIcon dnwalk1 = new ImageIcon(newdn);
			bI1 = dnwalk1.getImage();

			ImageIcon dn_walk2 = new ImageIcon(getClass().getResource("/cstm/dn_walk2.png"));
			Image imagedn2 = dn_walk2.getImage(); // transform it
			Image newdn2 = imagedn2.getScaledInstance(425, 425, java.awt.Image.SCALE_SMOOTH);
			ImageIcon dnwalk2 = new ImageIcon(newdn2);
			bI2 = dnwalk2.getImage();

		}

		if (customerNum == 2) {
			ImageIcon mp_walk = new ImageIcon(getClass().getResource("/cstm/mp_walk1.png"));
			Image imagemp1 = mp_walk.getImage(); // transform it
			Image newmp = imagemp1.getScaledInstance(425, 425, java.awt.Image.SCALE_SMOOTH);
			ImageIcon mpwalk1 = new ImageIcon(newmp);
			bI1 = mpwalk1.getImage();

			ImageIcon mp_walk2 = new ImageIcon(getClass().getResource("/cstm/mp_walk2.png"));
			Image imagemp2 = mp_walk2.getImage(); // transform it
			Image newmp2 = imagemp2.getScaledInstance(425, 425, java.awt.Image.SCALE_SMOOTH);
			ImageIcon mpwalk2 = new ImageIcon(newmp2);
			bI2 = mpwalk2.getImage();

		}
		if (customerNum == 3) {
			ImageIcon jak_walk = new ImageIcon(getClass().getResource("/cstm/jak_walk1.png"));
			Image imagejak1 = jak_walk.getImage(); // transform it
			Image newjak = imagejak1.getScaledInstance(425, 425, java.awt.Image.SCALE_SMOOTH);
			ImageIcon jakwalk1 = new ImageIcon(newjak);
			bI1 = jakwalk1.getImage();

			ImageIcon jak_walk2 = new ImageIcon(getClass().getResource("/cstm/jak_walk2.png"));
			Image imagejak2 = jak_walk2.getImage(); // transform it
			Image newjak2 = imagejak2.getScaledInstance(425, 425, java.awt.Image.SCALE_SMOOTH);
			ImageIcon jakwalk2 = new ImageIcon(newjak2);
			bI2 = jakwalk2.getImage();

		}

		if (customerNum == 4) {
			ImageIcon guy_walk = new ImageIcon(getClass().getResource("/cstm/guy_walk1.png"));
			Image imageguy1 = guy_walk.getImage(); // transform it
			Image newguy = imageguy1.getScaledInstance(425, 425, java.awt.Image.SCALE_SMOOTH);
			ImageIcon guywalk1 = new ImageIcon(newguy);
			bI1 = guywalk1.getImage();

			ImageIcon guy_walk2 = new ImageIcon(getClass().getResource("/cstm/guy_walk2.png"));
			Image imageguy2 = guy_walk2.getImage(); // transform it
			Image newguy2 = imageguy2.getScaledInstance(425, 425, java.awt.Image.SCALE_SMOOTH);
			ImageIcon guywalk2 = new ImageIcon(newguy2);
			bI2 = guywalk2.getImage();

		}
	}

	public void leavingCustomer() {
		leave.start();

		if (customerNum == 0) {

			System.out.println("bozz");

			ImageIcon bozz_leave1 = new ImageIcon(getClass().getResource("/cstm/bozz_leave1.png"));
			Image imageb3 = bozz_leave1.getImage();
			Image newbozz3 = imageb3.getScaledInstance(425, 425, java.awt.Image.SCALE_SMOOTH);
			ImageIcon bozzleave1 = new ImageIcon(newbozz3);
			bL1 = bozzleave1.getImage();

			ImageIcon bozz_leave2 = new ImageIcon(getClass().getResource("/cstm/bozz_leave2.png"));
			Image imageb4 = bozz_leave2.getImage(); // transform it
			Image newbozz4 = imageb4.getScaledInstance(425, 425, java.awt.Image.SCALE_SMOOTH);
			ImageIcon bozzleave2 = new ImageIcon(newbozz4);
			bL2 = bozzleave2.getImage();
		}

		if (customerNum == 1) {
			ImageIcon dn_leave1 = new ImageIcon(getClass().getResource("/cstm/dn_leave1.png"));
			Image imagedn3 = dn_leave1.getImage(); // transform it
			Image newdn3 = imagedn3.getScaledInstance(425, 425, java.awt.Image.SCALE_SMOOTH);
			ImageIcon dnleave1 = new ImageIcon(newdn3);
			bL1 = dnleave1.getImage();

			ImageIcon dn_leave2 = new ImageIcon(getClass().getResource("/cstm/dn_leave2.png"));
			Image imagedn4 = dn_leave2.getImage(); // transform it
			Image newdn4 = imagedn4.getScaledInstance(425, 425, java.awt.Image.SCALE_SMOOTH);
			ImageIcon dnleave2 = new ImageIcon(newdn4);
			bL2 = dnleave2.getImage();

		}

		if (customerNum == 2) {
			ImageIcon mp_leave1 = new ImageIcon(getClass().getResource("/cstm/mp_leave1.png"));
			Image imagemp3 = mp_leave1.getImage();
			Image newmp3 = imagemp3.getScaledInstance(425, 425, java.awt.Image.SCALE_SMOOTH);
			ImageIcon mpleave1 = new ImageIcon(newmp3);
			bL1 = mpleave1.getImage();

			ImageIcon mp_leave2 = new ImageIcon(getClass().getResource("/cstm/mp_leave2.png"));
			Image imagemp4 = mp_leave2.getImage();
			Image newmp4 = imagemp4.getScaledInstance(425, 425, java.awt.Image.SCALE_SMOOTH);
			ImageIcon mpleave2 = new ImageIcon(newmp4);
			bL2 = mpleave2.getImage();

		}
		if (customerNum == 3) {
			ImageIcon jak_leave1 = new ImageIcon(getClass().getResource("/cstm/jak_leave1.png"));
			Image imagejak3 = jak_leave1.getImage();
			Image newjak3 = imagejak3.getScaledInstance(425, 425, java.awt.Image.SCALE_SMOOTH);
			ImageIcon jakleave1 = new ImageIcon(newjak3);
			bL1 = jakleave1.getImage();

			ImageIcon jak_leave2 = new ImageIcon(getClass().getResource("/cstm/jak_leave2.png"));
			Image imagejak4 = jak_leave2.getImage();
			Image newjak4 = imagejak4.getScaledInstance(425, 425, java.awt.Image.SCALE_SMOOTH);
			ImageIcon jakleave2 = new ImageIcon(newjak4);
			bL2 = jakleave2.getImage();

		}

		if (customerNum == 4) {
			ImageIcon guy_leave1 = new ImageIcon(getClass().getResource("/cstm/guy_leave1.png"));
			Image imageguy3 = guy_leave1.getImage();
			Image newguy3 = imageguy3.getScaledInstance(425, 425, java.awt.Image.SCALE_SMOOTH);
			ImageIcon guyleave1 = new ImageIcon(newguy3);
			bL1 = guyleave1.getImage();

			ImageIcon guy_leave2 = new ImageIcon(getClass().getResource("/cstm/guy_leave2.png"));
			Image imageguy4 = guy_leave2.getImage(); // transform it
			Image newguy4 = imageguy4.getScaledInstance(425, 425, java.awt.Image.SCALE_SMOOTH);
			ImageIcon guyleave2 = new ImageIcon(newguy4);
			bL2 = guyleave2.getImage();
		}
	}

}
