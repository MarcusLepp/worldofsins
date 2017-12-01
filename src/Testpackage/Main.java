package Testpackage;
import javax.swing.JOptionPane;

import WorldOfStrategy.DeathKnight;
import WorldOfStrategy.DemonHunter;
import WorldOfStrategy.Druid;
import WorldOfStrategy.Hunter;
import WorldOfStrategy.Mage;
import WorldOfStrategy.Monk;
import WorldOfStrategy.Paladin;
import WorldOfStrategy.Priest;
import WorldOfStrategy.Rogue;
import WorldOfStrategy.Shaman;
import WorldOfStrategy.Warlock;
import WorldOfStrategy.Warrior;

import javax.swing.JFrame;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		
		String faction1 = "Horde";
		String faction2 = "Alliance";
		
		String raceNightElf = "NightElf";
		String raceHuman = "Human";
		String raceOrc = "Orc";
		String raceBloodElf = "BloodElf";
		String raceTroll = "Troll";
		String raceGoblin = "Goblin";
		String raceUndead = "Undead";
		String raceDwarf = "Dwarf";
		String raceGnome = "Gnome";
		String racePandaren = "Pandaren";
		String raceWorgen = "Worgen";
		String raceDraenei = "Draenei";
		String raceTauren = "Tauren";
		
		
		Gui go = new Gui();
		go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		go.setSize(1350,600);
		go.setVisible(true);
		
		
		
		
		
		
		
		
		
		
	}
}






/*Boolean breaker = false;
while(breaker == false) {
String race = JOptionPane.showInputDialog("Select your Race");
if(!((race.equals("Human"))|(race.equals("Goblin"))|(race.equals("Worgen"))|(race.equals("Tauren"))|(race.equals("Draenei"))|(race.equals("Pandaren"))|(race.equals("Gnome"))|(race.equals("Dwarf"))
|(race.equals("Undead"))|(race.equals("Troll"))|(race.equals("BloodElf"))|(race.equals("Orc"))|(race.equals("NightElf")))){	
	
	JOptionPane.showMessageDialog(null,"You selected an invalid race, try again");
	
	
}else {
	breaker = true;
}
JOptionPane.showMessageDialog(null,"Well done, You selected " + race);
} 

	


Boolean breaker2 = false;
while(breaker2 == false) {
String klass = JOptionPane.showInputDialog("Now! Select your class.");
if(!((klass.equals("Mage"))|(klass.equals("Warlock"))|(klass.equals("Hunter"))|(klass.equals("Druid"))|(klass.equals("Warrior"))|(klass.equals("Paladin"))|(klass.equals("Priest"))|(klass.equals("DeathKnight"))
		|(klass.equals("DemonHunter"))|(klass.equals("Rogue"))|(klass.equals("Monk"))|(klass.equals("Hunter"))|(klass.equals("NightElf")))){
	
	
	
	JOptionPane.showMessageDialog(null, "You gotta be shitting me, pick a damn class son");


}else {
	breaker2 = true;
	
}
switch(klass) {

case "Mage":
	JOptionPane.showMessageDialog(null, Mage.toString);
	JOptionPane.showMessageDialog(null,"Well done, You selected " + klass);
		break;
case "Druid":
	JOptionPane.showMessageDialog(null, Druid.toString);
	JOptionPane.showMessageDialog(null,"Well done, You selected " + klass);
		break;
case "Warrior":
	JOptionPane.showMessageDialog(null, Warrior.toString);
	JOptionPane.showMessageDialog(null,"Well done, You selected " + klass);
		break;
case "Paladin":
	JOptionPane.showMessageDialog(null, Paladin.toString);
	JOptionPane.showMessageDialog(null,"Well done, You selected " + klass);
		break;	
case "Priest":
	JOptionPane.showMessageDialog(null, Priest.toString);
	JOptionPane.showMessageDialog(null,"Well done, You selected " + klass);
		break;	
case "DeathKnight":
	JOptionPane.showMessageDialog(null, DeathKnight.toString);
	JOptionPane.showMessageDialog(null,"Well done, You selected " + klass);
		break;	
case "DemonHunter":
	JOptionPane.showMessageDialog(null, DemonHunter.toString);
	JOptionPane.showMessageDialog(null,"Well done, You selected " + klass);
		break;	
case "Rogue":
	JOptionPane.showMessageDialog(null, Rogue.toString);
	JOptionPane.showMessageDialog(null,"Well done, You selected " + klass);
		break;	
case "Monk":
	JOptionPane.showMessageDialog(null, Monk.toString);
	JOptionPane.showMessageDialog(null,"Well done, You selected " + klass);
		break;
case "Hunter":
	JOptionPane.showMessageDialog(null, Hunter.toString);
	JOptionPane.showMessageDialog(null,"Well done, You selected " + klass);
	break;
case "Warlock":
	JOptionPane.showMessageDialog(null, Warlock.toString);
	JOptionPane.showMessageDialog(null,"Well done, You selected " + klass);
		break;
case "Shaman":
	JOptionPane.showMessageDialog(null, Shaman.toString);
	JOptionPane.showMessageDialog(null,"Well done, You selected " + klass);
		break;}
}
*/

		//Joyee.get eller  Joyee.toString()    ==    osv to get attributes		
		
		
		
		
		
		// name,damage, armor, health, healing,healthReg,crit, dodge, attackSpeed
				// Class Warlock = new Class("Warlock", 450, 50, 4390, 4390/5, 4390/100, 0.275,
				// 0.05, 0.89);
				// Class Shaman = new Class("Shaman", 530, 80, 4390, 4390/5, 4390/100, 0.275,
				// 0.05, 0.89);
				// Class Paladin = new Class("Paladin", 600, 200, 4390, 4390/5, 4390/100, 0.275,
				// 0.05, 0.89);
				// Class Warrior = new Class("Warrior", 660, 300, 4390, 4390/5, 4390/100, 0.275,
				// 0.05, 0.89);
				// Class DK = new Class("DK", 680, 280, 4390, 4390/5, 4390/100, 0.275, 0.05,
				// 0.89);
				// Class Rogue = new Class("Rogue", 550, 110, 4390, 4390/5, 4390/100, 0.275,
				// 0.05, 0.89);
				// Class Monk = new Class("Monk", 560, 120, 4390, 4390/5, 4390/100, 0.275, 0.05,
				// 0.89);
				// Class DH = new Class("DH", 550, 100, 4390, 4390/5, 4390/100, 0.275, 0.05,
				// 0.89);
				// Class Priest = new Class("Priest", 40, 50, 4390, 4390/5, 4390/100, 0.275,
				// 0.05, 0.89);
				// Class Druid = new Class("Druid", 440, 40, 4390, 4390/5, 4390/100, 0.275,
				// 0.05, 0.89);
				// Class Hunter = new Class("Hunter", 500, 120, 4390, 4390/5, 4390/100, 0.275,
				// 0.05, 0.89);
