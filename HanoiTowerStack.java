import javax.swing.JOptionPane;			//Required to use JOPtionPan Utility

public class HanoiTowerStack			//name of class
{	//beginning of the class
	
	//variables declared as private
	private static int TOWER_HEIGHT;	//TOWER_HEIGHT is declared as static int
	private Stack fromStack;			//fromStack    is declared
	private Stack toStack;				//toStack      is declared
	private Stack withStack;            //withStack    is declared
	
	// initialize and push stacks in at the same time.
	public HanoiTowerStack(int i)
	{
		//Variables Declared ant initialized
		TOWER_HEIGHT = i;
		
		fromStack = new Stack(TOWER_HEIGHT, 1);	//fromStack is initialized as TOWER_HEIGHT 1
		withStack = new Stack(TOWER_HEIGHT, 2);	//withStack is initialized as TOWER_HEIGHT 2
		toStack   = new Stack(TOWER_HEIGHT, 3); //toStack   is initialized as TOWER_HEIGHT 3
		
		char c = 'A';
		c += (TOWER_HEIGHT - 1);
		
		//push method
		for(int j = TOWER_HEIGHT; j > 0; j--)
		{
			fromStack.push(new Obj(c));
			c--;
		}
		
	}
	
	//need a moveDisk method to start it off.
	public void moveDisk()
	{
		moveDisk(TOWER_HEIGHT, fromStack, withStack, toStack);
	}
	
	//recursive moveDisk method.
	public void moveDisk(int n, Stack fromStack, Stack withStack, Stack toStack)
	{
		if(n > 0)
		{
			moveDisk(n - 1 , fromStack, toStack, withStack);
			showAll();
			
			char c = 'A';
			c += (n - 1);
			
			//display when push/pop is executed properly.
			if(toStack.push(fromStack.pop()))
				JOptionPane.showMessageDialog(null,"Disk " + c + " is moved from Stack - 0" +
						fromStack.getNumber() + " to Stack - 0" + toStack.getNumber());
			
			moveDisk(n - 1, withStack, fromStack, toStack);
		}
	}
	
	//toString method
	public String toString()
	{
		String s = "";
		s += fromStack.toString() + "\n";
		s += withStack.toString() + "\n";
		s += toStack.toString()   + "\n";
		return s;
	}
	
	//showAll method
	public void showAll()
	{
		JOptionPane.showMessageDialog(null,toString());
	}
}