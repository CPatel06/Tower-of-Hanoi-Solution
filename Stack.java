import javax.swing.JOptionPane;

public class Stack
{
	//for the stack number.
	private int i;
	
	// wrote a simple object Obj.
	private Obj[] disk;
	private int top;
	private int size;
	
	// default constructor.
	public Stack()
	{
		top  = -1;
		size = 100;
		disk = new Obj[100];
	}
	
	// parameter constructor that
	// takes in the objects as well as the number of the stack.
	public Stack(int n,int j)
	{
		i    = j;
		top  = -1;
		size = n;
		disk = new Obj[n];
	}
	
	//push method
	public boolean push(Obj st)
	{
		if (top == size -1)
			return false;
		else
		{
			top       = top + 1;
			disk[top] = st.deepCopy();
			return true;
		}
	}
	
	//pop method
	public Obj pop()
	{
		int topLocation = top;
		
		if(top == -1)
			return null;
		else
		{
			topLocation = top;
			top = top - 1;
			return disk[topLocation];
		}
	}
	
	//getNumber method
	public int getNumber()
	{
		return i;
	}
	
	//toString method
	public String toString()
	{
		String s =  "";
		s        += "Stack - 0" + i + ": ";
		
		for(int i = 0; i <= top; i++)
		{
			s += disk[i].toString();
			s += " ";
		}
		return s;
	}
	
	//showAll method
	public void showAll()
	{
		String s = "";
		
		for(int i = 0; i < top+1 ; i++)
		{
			s += disk[i].toString();
			s += " ";
		}
		
		JOptionPane.showMessageDialog(null,s);
	}
}