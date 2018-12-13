//Fortnite Dropper
import java.util.Random;
import javax.swing.JOptionPane;

public class Dropper {

		
	public static void main(String [] args) {
		String [] arr = {"Pleasent Park","Tomato Town","Wailing Woods","Lonely Lodge","Dusty Depot","Salty Springs","Snobby Shores","Lucky Landing","Fatal Fields","Moisty Mire",
				"Flush Factory","Greasy Grove","Retail Row","Loot Lake","Shifty Shafts","Haunted Hills","Junk Junction","Race Track","Factory outside Salty","House on a hill","Big Hill By Snobby Shores",
				"Soccer Field","Motel by Junk"};
			Random random = new Random();	
			int select = random.nextInt(arr.length);
		JOptionPane.showMessageDialog(null, "We're Dropping: " + arr[select] +" boys. Get Ready.", null, JOptionPane.YES_OPTION);
		
	
		
	}
}
