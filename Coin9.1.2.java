package question1;

public class Coin

{
	public final int HEADS = 0;
	public final int TAILS = 1;
	private int face; 
	public Coin()
	{
	
		flip();
	}
	
	public int flip()
	{
		face = (int)(Math.random()*2);
		
		return face;
	}
	
	
	public boolean isHeads() {
		
		return (face==HEADS);
	}
	
	public String toString() {
		
		String faceName;
		if(face==HEADS)
			faceName= "Heads";
		else 
			faceName = "Tails";
		
		return faceName;
			
	}
}
	
		


	