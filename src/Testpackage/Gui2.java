package Testpackage;
import java.awt.EventQueue;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SpringLayout;
import javax.swing.JToggleButton;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

public class Gui2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui2 frame = new Gui2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Gui2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 891, 583);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("Mage");
		tglbtnNewToggleButton.setBackground(new Color(0, 255, 255));
		contentPane.add(tglbtnNewToggleButton);
		
		JToggleButton tglbtnNewToggleButton_1 = new JToggleButton("Warrior");
		tglbtnNewToggleButton_1.setBackground(new Color(153, 102, 0));
		sl_contentPane.putConstraint(SpringLayout.WEST, tglbtnNewToggleButton, 82, SpringLayout.EAST, tglbtnNewToggleButton_1);
		sl_contentPane.putConstraint(SpringLayout.WEST, tglbtnNewToggleButton_1, 101, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, tglbtnNewToggleButton_1, -615, SpringLayout.EAST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.NORTH, tglbtnNewToggleButton_1, 74, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, tglbtnNewToggleButton_1, -377, SpringLayout.SOUTH, contentPane);
		contentPane.add(tglbtnNewToggleButton_1);
		
		JToggleButton tglbtnNewToggleButton_2 = new JToggleButton("Shaman");
		tglbtnNewToggleButton_2.setBackground(new Color(51, 51, 255));
		sl_contentPane.putConstraint(SpringLayout.NORTH, tglbtnNewToggleButton_2, 11, SpringLayout.SOUTH, tglbtnNewToggleButton_1);
		sl_contentPane.putConstraint(SpringLayout.WEST, tglbtnNewToggleButton_2, -121, SpringLayout.EAST, tglbtnNewToggleButton_1);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, tglbtnNewToggleButton_2, 70, SpringLayout.SOUTH, tglbtnNewToggleButton_1);
		sl_contentPane.putConstraint(SpringLayout.EAST, tglbtnNewToggleButton_2, 0, SpringLayout.EAST, tglbtnNewToggleButton_1);
		contentPane.add(tglbtnNewToggleButton_2);
		
		JToggleButton tglbtnNewToggleButton_3 = new JToggleButton("Druid");
		tglbtnNewToggleButton_3.setBackground(new Color(153, 255, 0));
		sl_contentPane.putConstraint(SpringLayout.NORTH, tglbtnNewToggleButton_3, 6, SpringLayout.SOUTH, tglbtnNewToggleButton_2);
		sl_contentPane.putConstraint(SpringLayout.WEST, tglbtnNewToggleButton_3, 0, SpringLayout.WEST, tglbtnNewToggleButton_1);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, tglbtnNewToggleButton_3, -206, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, tglbtnNewToggleButton_3, 1, SpringLayout.EAST, tglbtnNewToggleButton_1);
		contentPane.add(tglbtnNewToggleButton_3);
		
		JToggleButton tglbtnNewToggleButton_4 = new JToggleButton("DeathKnight");
		tglbtnNewToggleButton_4.setBackground(new Color(204, 0, 204));
		sl_contentPane.putConstraint(SpringLayout.NORTH, tglbtnNewToggleButton_4, 33, SpringLayout.SOUTH, tglbtnNewToggleButton_3);
		sl_contentPane.putConstraint(SpringLayout.WEST, tglbtnNewToggleButton_4, 0, SpringLayout.WEST, tglbtnNewToggleButton_2);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, tglbtnNewToggleButton_4, 116, SpringLayout.SOUTH, tglbtnNewToggleButton_3);
		contentPane.add(tglbtnNewToggleButton_4);
		
		JToggleButton tglbtnNewToggleButton_5 = new JToggleButton("Monk");
		sl_contentPane.putConstraint(SpringLayout.EAST, tglbtnNewToggleButton_4, -126, SpringLayout.WEST, tglbtnNewToggleButton_5);
		sl_contentPane.putConstraint(SpringLayout.NORTH, tglbtnNewToggleButton_5, 350, SpringLayout.NORTH, contentPane);
		contentPane.add(tglbtnNewToggleButton_5);
		
		JToggleButton tglbtnNewToggleButton_6 = new JToggleButton("Warlock");
		tglbtnNewToggleButton_6.setBackground(new Color(204, 0, 255));
		sl_contentPane.putConstraint(SpringLayout.EAST, tglbtnNewToggleButton_5, -130, SpringLayout.WEST, tglbtnNewToggleButton_6);
		sl_contentPane.putConstraint(SpringLayout.EAST, tglbtnNewToggleButton_6, -124, SpringLayout.EAST, contentPane);
		contentPane.add(tglbtnNewToggleButton_6);
		
		JToggleButton tglbtnNewToggleButton_7 = new JToggleButton("Hunter");
		sl_contentPane.putConstraint(SpringLayout.EAST, tglbtnNewToggleButton, -124, SpringLayout.WEST, tglbtnNewToggleButton_7);
		sl_contentPane.putConstraint(SpringLayout.NORTH, tglbtnNewToggleButton_7, 89, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, tglbtnNewToggleButton_7, -139, SpringLayout.EAST, contentPane);
		contentPane.add(tglbtnNewToggleButton_7);
		
		JToggleButton tglbtnNewToggleButton_8 = new JToggleButton("Paladin");
		tglbtnNewToggleButton_8.setBackground(new Color(255, 51, 255));
		sl_contentPane.putConstraint(SpringLayout.NORTH, tglbtnNewToggleButton, -82, SpringLayout.NORTH, tglbtnNewToggleButton_8);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, tglbtnNewToggleButton, -59, SpringLayout.NORTH, tglbtnNewToggleButton_8);
		sl_contentPane.putConstraint(SpringLayout.EAST, tglbtnNewToggleButton_8, 0, SpringLayout.EAST, tglbtnNewToggleButton_5);
		contentPane.add(tglbtnNewToggleButton_8);
		
		JToggleButton tglbtnNewToggleButton_9 = new JToggleButton("Demon Hunter");
		sl_contentPane.putConstraint(SpringLayout.NORTH, tglbtnNewToggleButton_9, 54, SpringLayout.SOUTH, tglbtnNewToggleButton_7);
		sl_contentPane.putConstraint(SpringLayout.WEST, tglbtnNewToggleButton_9, 0, SpringLayout.WEST, tglbtnNewToggleButton_7);
		contentPane.add(tglbtnNewToggleButton_9);
		
		JToggleButton tglbtnNewToggleButton_10 = new JToggleButton("Rogue");
		tglbtnNewToggleButton_10.setBackground(new Color(255, 255, 0));
		sl_contentPane.putConstraint(SpringLayout.SOUTH, tglbtnNewToggleButton_8, -29, SpringLayout.NORTH, tglbtnNewToggleButton_10);
		sl_contentPane.putConstraint(SpringLayout.NORTH, tglbtnNewToggleButton_10, 255, SpringLayout.NORTH, contentPane);
		contentPane.add(tglbtnNewToggleButton_10);
		
		JToggleButton tglbtnNewToggleButton_11 = new JToggleButton("Priest");
		tglbtnNewToggleButton_11.setBackground(new Color(255, 255, 255));
		sl_contentPane.putConstraint(SpringLayout.EAST, tglbtnNewToggleButton_10, -115, SpringLayout.WEST, tglbtnNewToggleButton_11);
		sl_contentPane.putConstraint(SpringLayout.NORTH, tglbtnNewToggleButton_6, 72, SpringLayout.SOUTH, tglbtnNewToggleButton_11);
		sl_contentPane.putConstraint(SpringLayout.NORTH, tglbtnNewToggleButton_11, 66, SpringLayout.SOUTH, tglbtnNewToggleButton_9);
		sl_contentPane.putConstraint(SpringLayout.WEST, tglbtnNewToggleButton_11, 0, SpringLayout.WEST, tglbtnNewToggleButton_7);
		contentPane.add(tglbtnNewToggleButton_11);
		
		JLabel lblChooseYouClass = new JLabel("Choose you Class:");
		lblChooseYouClass.setFont(new Font("Tahoma", Font.PLAIN, 18));
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblChooseYouClass, 10, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblChooseYouClass, 315, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblChooseYouClass, 40, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblChooseYouClass, -310, SpringLayout.EAST, contentPane);
		contentPane.add(lblChooseYouClass);
	}
}
