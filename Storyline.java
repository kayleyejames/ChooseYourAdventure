
public class Storyline {

	public static int numberOfStories = 0;
	
	private int age;
	private int happinessChange;
	private int meaningChange;
	private String text = "";
	private Storyline option1;
	private Storyline option2;
	
	public Storyline(int a, int h, int m, String t, Storyline o1, Storyline o2)
	{
		numberOfStories++;
		
		age = a;
		happinessChange = h;
		meaningChange = m;
		text = t;
		option1 = o1;
		option2 = o2;
	}
	
	public Storyline(int h, int m, String t, Storyline o1, Storyline o2)
	{
		numberOfStories++;
		
		happinessChange = h;
		meaningChange = m;
		text = t;
		option1 = o1;
		option2 = o2;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public int getHappinessChange()
	{
		return happinessChange;
	}
	
	public int getMeaningChange()
	{
		return meaningChange;
	}
	
	public String getText()
	{
		return text;
	}
	
	public Storyline getOption1()
	{
		return option1;
	}
	
	public Storyline getOption2()
	{
		return option2;
	}
}
