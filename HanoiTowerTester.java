import javax.swing.*;

public class HanoiTowerTester
{
	protected static HanoiTowerStack hanoiTowerFrom;
	protected static HanoiTowerStack hanoiTowerTo;
	
	public static void main(String[] args)
	{
		int towerHeight;
		
		towerHeight = Integer.parseInt(JOptionPane.showInputDialog("Enter the height of the tower."));
		
		//initializing pops objects into stacks automatically
		hanoiTowerFrom = new HanoiTowerStack(towerHeight);		
		//start moving disks around
		hanoiTowerFrom.moveDisk();
		//show end result.
		hanoiTowerFrom.showAll();
		
		//Last message to display
		JOptionPane.showMessageDialog(null,"Done.");
		System.exit(0);
	}
	
}
