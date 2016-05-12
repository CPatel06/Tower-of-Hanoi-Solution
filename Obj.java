public class Obj		//name of class
{	//beginning of class
	
	//variables declared
	private char name;
	
	//default constructor
	public Obj()
	{
	}
	
	//parameter constructor
	public Obj(char n)
	{
		name = n;
	}
	
	//copy constructor method
	public Obj(Obj s)
	{
		name = s.getName();
	}
	
	//mutator method
	public char getName()
	{
		return name;
	}

	//accessor method
	public void setName(char s)
	{
		name = s;
	}
	
	//toString method
	public String toString()
	{
		String s = "Disk[" + name + "]";
		return s;
	}
	
	//deepCopy method
	public Obj deepCopy()
	{
		return new Obj(name);
	}
}//end of class