// Chapter 3 Game #2 - DESIGN A  CHARACTER FOR A GAME CREATING A CLASS TO HOLD AT LEAST THEE ATTRIBUTES FOR THE CHARACTER. INCLUD METHODS TO GET AND SET EACH OF THE ATTRIBUTES 

public class MyCharacter
{
	private int lives;
	private int numberOfEyes;
	private String color;
	
	public void setLives(int lvs)
	{
		lives = lvs; 
	}
	
	public void setNumberOfEyes(int eyes)
	{
		numberOfEyes = eyes;
	}
	
	public void setColor(String col)
	{
		color = col;
	}
	
	public int getLives()
	{
		return lives;
	}
	
	public int getNumberOfEyes()
	{
		return numberOfEyes;
	}
	
	public String getColor()
	{
		return  color;
	}
	
	
}



















