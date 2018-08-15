
public class Character {

	private String name;
	private int age;
	private boolean isDead = false;
	
	// scale of 1 -> 10
	private int happiness;
	private int meaning;
	
	public Character()
	{
		name = "";
		age = 0;
		happiness = 3;
		meaning = 0;
	}
	
	// getters and setters
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String n)
	{
		name = n;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void setAge(int a)
	{
		age = a;
	}
	
	public void addAge(int a)
	{
		age += a;
	}

	public int getHappiness()
	{
		return happiness;
	}
	
	public void setHappiness(int h)
	{
		happiness = h;
	}
	
	public void addHappiness(int h)
	{
		if(happiness + h < 0)
		{
			happiness = 0;
		}
		else if(happiness + h > 10)
		{
			happiness = 10;
		}
		else
		{
			happiness += h;
		}
		
	}
	
	public int getMeaning()
	{
		return meaning;
	}
	
	public void setMeaning(int m)
	{
		meaning = m;
	}
	
	public void addMeaning(int m)
	{
		if(meaning + m < 0)
		{
			meaning = 0;
		}
		else if(meaning + m > 10)
		{
			meaning = 10;
		}
		else
		{
			meaning += m;
		}
	}
	
	// other functions
	
	public void update(int a, int h, int m)
	/**
	 * @param: a = age, h = happiness, m = meaning
	 */
	{
		addAge(a);
		addHappiness(h);
		addMeaning(m);
	}
	
	public boolean checkIsDead()
	{
		return isDead;
	}
	
	public void setIsDead(boolean input)
	{
		isDead = input;
	}
}
