/********************************************************************************
 * Movie.java
 * Eddie Chapman
 * 
 * TODO: Insert description here
 *******************************************************************************/

package hw4;

public class Movie 
{
	private String name;		// The movie's name
	private int minutes;		// The movie's duration in minutes
	private int tomatoScore;	// The movie's Rotten Tomato "freshness rating"

	//***************************************************************************
	
	public Movie(String name, int minutes, int tomatoScore)
	{
		this.name = name;
		this.minutes = minutes;
		this.tomatoScore = tomatoScore;
	}
	
	//***************************************************************************

	public String getName()
	{
		return name;
	}
	
	public int getMinutes()
	{
		return minutes;
	}
	
	public int getTomatoScore()
	{
		return tomatoScore;
	}
	
	public void setTomatoScore(int Score)
	{
		if (Score >= 0 && Score <= 100)		// tomatoScore must be between 0-100
		{
			tomatoScore = Score;
		}
	}
	
	//***************************************************************************
	
	public boolean isFresh()
	{
		return 60 <= getTomatoScore() ? true : false;
	}
	
	//***************************************************************************
	
	private String minutesToHours(int minutes) 
	{
		String hrs = Integer.toString(minutes / 60);
		String min = Integer.toString(minutes % 60);
		
		return hrs + "hrs" + " " + min + "min";
	}
	
	//***************************************************************************
	
	@Override
	public String toString()
	{
		return minutesToHours(getMinutes());
	}
	
	//***************************************************************************
	
	@Override
	public boolean equals(Object other)
	{
		return this.getName() == other.getName() ? true : false;
	}
	
}
