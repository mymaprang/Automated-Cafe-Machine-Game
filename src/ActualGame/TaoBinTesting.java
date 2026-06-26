package ActualGame;

import javax.swing.JFrame;

import Game.TaobinMachine;
public class TaoBinTesting {
	

	public static void main(String[] args) {
		JFrame frame = new JFrame("My Part-time job as a Taobin Machine");
		
//		frame.add(new Name_Card());
//        frame.add(new Machine());
		frame.add(new TaobinMachine());
//		frame.add(new endgame());
//		frame.add(new htp());

//		frame.add(new Intro());
//		frame.add(new Level1());
//		frame.add(new RandomOrder());
//      frame.add(new CustomerRandom());
		
//		frame.add(new Level1());
		frame.getLayout();
		frame.setSize(1000,700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setResizable(false);
	}


}
