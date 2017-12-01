package Testpackage;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.swing.JInternalFrame;
import java.awt.event.ActionListener;

public class Gui extends JFrame {

	private JPanel contentPane;
	private JTextField txtHorde;
	private JTextField txtAlliance;
	private JToggleButton tglbtnNewToggleButton_2;
	private JToggleButton tglbtnNewToggleButton_3;
	private JToggleButton tglbtnNewToggleButton_4;
	private JToggleButton tglbtnNewToggleButton_5;
	private JToggleButton tglbtnNewToggleButton_6;
	private JToggleButton tglbtnNewToggleButton_7;
	private JToggleButton tglbtnNewToggleButton_8;
	private JToggleButton tglbtnNewToggleButton_9;
	private JToggleButton tglbtnNewToggleButton_10;
	private JToggleButton tglbtnNewToggleButton_11;
	private JToggleButton tglbtnNewToggleButton_12;
	private JToggleButton tglbtnNewToggleButton_13;
	private JLabel lblChooseWisely;
	private JButton nextButtonFaction;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui frame = new Gui();
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
	public Gui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1248, 624);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		txtHorde = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtHorde, 45, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtHorde, 119, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, txtHorde, -403, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, txtHorde, 336, SpringLayout.WEST, contentPane);
		txtHorde.setFont(new Font("Wide Latin", Font.PLAIN, 28));
		txtHorde.setText("HORDE");
		txtHorde.setBackground(Color.RED);
		contentPane.add(txtHorde);
		txtHorde.setColumns(10);
		
		txtAlliance = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtAlliance, 40, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtAlliance, 832, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, txtAlliance, -403, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, txtAlliance, -173, SpringLayout.EAST, contentPane);
		txtAlliance.setForeground(new Color(255, 215, 0));
		txtAlliance.setFont(new Font("Castellar", Font.PLAIN, 37));
		txtAlliance.setText("Alliance");
		txtAlliance.setBackground(Color.BLUE);
		contentPane.add(txtAlliance);
		txtAlliance.setColumns(10);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("Goblin");
		sl_contentPane.putConstraint(SpringLayout.WEST, tglbtnNewToggleButton, 0, SpringLayout.WEST, txtHorde);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, tglbtnNewToggleButton, -124, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, tglbtnNewToggleButton, 0, SpringLayout.EAST, txtHorde);
		contentPane.add(tglbtnNewToggleButton);
		
		JToggleButton tglbtnNewToggleButton_1 = new JToggleButton("Pandaren");
		sl_contentPane.putConstraint(SpringLayout.WEST, tglbtnNewToggleButton_1, 0, SpringLayout.WEST, txtHorde);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, tglbtnNewToggleButton_1, -7, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, tglbtnNewToggleButton_1, 0, SpringLayout.EAST, txtHorde);
		contentPane.add(tglbtnNewToggleButton_1);
		
		tglbtnNewToggleButton_2 = new JToggleButton("Blood Elf");
		sl_contentPane.putConstraint(SpringLayout.NORTH, tglbtnNewToggleButton, 1, SpringLayout.SOUTH, tglbtnNewToggleButton_2);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, tglbtnNewToggleButton_2, -187, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, tglbtnNewToggleButton_2, 0, SpringLayout.WEST, txtHorde);
		sl_contentPane.putConstraint(SpringLayout.EAST, tglbtnNewToggleButton_2, 0, SpringLayout.EAST, txtHorde);
		contentPane.add(tglbtnNewToggleButton_2);
		
		tglbtnNewToggleButton_3 = new JToggleButton("Troll");
		sl_contentPane.putConstraint(SpringLayout.SOUTH, tglbtnNewToggleButton_3, -244, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.NORTH, tglbtnNewToggleButton_2, 2, SpringLayout.SOUTH, tglbtnNewToggleButton_3);
		sl_contentPane.putConstraint(SpringLayout.WEST, tglbtnNewToggleButton_3, 0, SpringLayout.WEST, txtHorde);
		sl_contentPane.putConstraint(SpringLayout.EAST, tglbtnNewToggleButton_3, 0, SpringLayout.EAST, txtHorde);
		contentPane.add(tglbtnNewToggleButton_3);
		
		tglbtnNewToggleButton_4 = new JToggleButton("Tauren");
		sl_contentPane.putConstraint(SpringLayout.SOUTH, tglbtnNewToggleButton_4, -290, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, tglbtnNewToggleButton_4, 0, SpringLayout.WEST, txtHorde);
		sl_contentPane.putConstraint(SpringLayout.EAST, tglbtnNewToggleButton_4, 0, SpringLayout.EAST, txtHorde);
		contentPane.add(tglbtnNewToggleButton_4);
		
		tglbtnNewToggleButton_5 = new JToggleButton("Orc");
		sl_contentPane.putConstraint(SpringLayout.NORTH, tglbtnNewToggleButton_3, 58, SpringLayout.SOUTH, tglbtnNewToggleButton_5);
		sl_contentPane.putConstraint(SpringLayout.NORTH, tglbtnNewToggleButton_4, 2, SpringLayout.SOUTH, tglbtnNewToggleButton_5);
		sl_contentPane.putConstraint(SpringLayout.NORTH, tglbtnNewToggleButton_5, 6, SpringLayout.SOUTH, txtHorde);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, tglbtnNewToggleButton_5, -347, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, tglbtnNewToggleButton_5, 0, SpringLayout.WEST, txtHorde);
		sl_contentPane.putConstraint(SpringLayout.EAST, tglbtnNewToggleButton_5, 0, SpringLayout.EAST, txtHorde);
		contentPane.add(tglbtnNewToggleButton_5);
		
		tglbtnNewToggleButton_6 = new JToggleButton("Undead");
		sl_contentPane.putConstraint(SpringLayout.NORTH, tglbtnNewToggleButton_1, 6, SpringLayout.SOUTH, tglbtnNewToggleButton_6);
		sl_contentPane.putConstraint(SpringLayout.NORTH, tglbtnNewToggleButton_6, 1, SpringLayout.SOUTH, tglbtnNewToggleButton);
		sl_contentPane.putConstraint(SpringLayout.WEST, tglbtnNewToggleButton_6, 0, SpringLayout.WEST, txtHorde);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, tglbtnNewToggleButton_6, -68, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, tglbtnNewToggleButton_6, 0, SpringLayout.EAST, txtHorde);
		contentPane.add(tglbtnNewToggleButton_6);
		
		tglbtnNewToggleButton_7 = new JToggleButton("Human");
		sl_contentPane.putConstraint(SpringLayout.NORTH, tglbtnNewToggleButton_7, 38, SpringLayout.SOUTH, txtAlliance);
		sl_contentPane.putConstraint(SpringLayout.WEST, tglbtnNewToggleButton_7, 501, SpringLayout.EAST, tglbtnNewToggleButton_5);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, tglbtnNewToggleButton_7, -342, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, tglbtnNewToggleButton_7, 0, SpringLayout.EAST, txtAlliance);
		contentPane.add(tglbtnNewToggleButton_7);
		
		tglbtnNewToggleButton_8 = new JToggleButton("Night Elf");
		sl_contentPane.putConstraint(SpringLayout.NORTH, tglbtnNewToggleButton_8, 23, SpringLayout.SOUTH, tglbtnNewToggleButton_7);
		sl_contentPane.putConstraint(SpringLayout.WEST, tglbtnNewToggleButton_8, 0, SpringLayout.WEST, txtAlliance);
		sl_contentPane.putConstraint(SpringLayout.EAST, tglbtnNewToggleButton_8, -111, SpringLayout.EAST, contentPane);
		contentPane.add(tglbtnNewToggleButton_8);
		
		tglbtnNewToggleButton_9 = new JToggleButton("Dwarf");
		sl_contentPane.putConstraint(SpringLayout.NORTH, tglbtnNewToggleButton_9, -4, SpringLayout.NORTH, tglbtnNewToggleButton_2);
		sl_contentPane.putConstraint(SpringLayout.EAST, tglbtnNewToggleButton_9, 0, SpringLayout.EAST, txtAlliance);
		contentPane.add(tglbtnNewToggleButton_9);
		
		tglbtnNewToggleButton_10 = new JToggleButton("Gnome");
		sl_contentPane.putConstraint(SpringLayout.NORTH, tglbtnNewToggleButton_10, 16, SpringLayout.NORTH, tglbtnNewToggleButton_6);
		sl_contentPane.putConstraint(SpringLayout.EAST, tglbtnNewToggleButton_10, -267, SpringLayout.EAST, contentPane);
		contentPane.add(tglbtnNewToggleButton_10);
		
		tglbtnNewToggleButton_11 = new JToggleButton("NDraneie");
		sl_contentPane.putConstraint(SpringLayout.NORTH, tglbtnNewToggleButton_11, 12, SpringLayout.SOUTH, tglbtnNewToggleButton_8);
		sl_contentPane.putConstraint(SpringLayout.EAST, tglbtnNewToggleButton_11, -238, SpringLayout.EAST, contentPane);
		contentPane.add(tglbtnNewToggleButton_11);
		
		tglbtnNewToggleButton_12 = new JToggleButton("Pandaren");
		sl_contentPane.putConstraint(SpringLayout.NORTH, tglbtnNewToggleButton_12, 0, SpringLayout.NORTH, tglbtnNewToggleButton_1);
		sl_contentPane.putConstraint(SpringLayout.WEST, tglbtnNewToggleButton_12, 0, SpringLayout.WEST, tglbtnNewToggleButton_10);
		sl_contentPane.putConstraint(SpringLayout.EAST, tglbtnNewToggleButton_12, -80, SpringLayout.EAST, txtAlliance);
		contentPane.add(tglbtnNewToggleButton_12);
		
		tglbtnNewToggleButton_13 = new JToggleButton("Worgen");
		sl_contentPane.putConstraint(SpringLayout.WEST, tglbtnNewToggleButton_9, 0, SpringLayout.WEST, tglbtnNewToggleButton_13);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, tglbtnNewToggleButton_9, -71, SpringLayout.SOUTH, tglbtnNewToggleButton_13);
		sl_contentPane.putConstraint(SpringLayout.NORTH, tglbtnNewToggleButton_13, 83, SpringLayout.SOUTH, tglbtnNewToggleButton_11);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, tglbtnNewToggleButton_13, -113, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, tglbtnNewToggleButton_13, 532, SpringLayout.EAST, tglbtnNewToggleButton);
		sl_contentPane.putConstraint(SpringLayout.EAST, tglbtnNewToggleButton_13, -177, SpringLayout.EAST, contentPane);
		contentPane.add(tglbtnNewToggleButton_13);
		
		lblChooseWisely = new JLabel("Choose Wisely");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblChooseWisely, 0, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblChooseWisely, 128, SpringLayout.EAST, txtHorde);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblChooseWisely, 55, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblChooseWisely, 345, SpringLayout.EAST, txtHorde);
		lblChooseWisely.setFont(new Font("Verdana", Font.PLAIN, 20));
		contentPane.add(lblChooseWisely);
		
		nextButtonFaction = new JButton("Next");
		nextButtonFaction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Gui2 nextWindow1 = new Gui2();
				nextWindow1.NewScreen();
				
				
			}
		});
		nextButtonFaction.setAction(action);
		nextButtonFaction.setBackground(new Color(50, 205, 50));
		sl_contentPane.putConstraint(SpringLayout.SOUTH, nextButtonFaction, -10, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, nextButtonFaction, -10, SpringLayout.EAST, contentPane);
		contentPane.add(nextButtonFaction);

		
		JInternalFrame internalFrame = new JInternalFrame("New JInternalFrame");
		sl_contentPane.putConstraint(SpringLayout.WEST, tglbtnNewToggleButton_11, 196, SpringLayout.EAST, internalFrame);
		sl_contentPane.putConstraint(SpringLayout.NORTH, internalFrame, 110, SpringLayout.SOUTH, lblChooseWisely);
		sl_contentPane.putConstraint(SpringLayout.WEST, internalFrame, 144, SpringLayout.EAST, txtHorde);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, internalFrame, -35, SpringLayout.SOUTH, tglbtnNewToggleButton_2);
		sl_contentPane.putConstraint(SpringLayout.EAST, internalFrame, -175, SpringLayout.WEST, tglbtnNewToggleButton_8);
		contentPane.add(internalFrame);
		internalFrame.setVisible(false);
		
		
		if(nextButtonFaction == action) {
			
			internalFrame.setVisible(true);
			
			
			
		}
		
		
		
	
	
	
	
	
	
	
	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}











