import java.util.Scanner;


public class ChooseYourAdventure {
	
	private static Scanner scr = new Scanner(System.in);
	private static Storyline death = new Storyline(0, 0, Storylines.deathText, null, null);
	
	// old age
	public static Storyline noHobby = new Storyline(-5, -4, Storylines.noHobbyText, death, death);
	public static Storyline noCandyShop = new Storyline(-5, -4, Storylines.noCandyShopText, death, death);
	public static Storyline gardening = new Storyline(4, 3, Storylines.gardeningText, death, death);
	public static Storyline candyShop = new Storyline(3, 2, Storylines.candyShopText, death, death);
	public static Storyline hobby = new Storyline(0, 0, Storylines.hobbyText, gardening, noHobby);
	public static Storyline walkWithRelatives = new Storyline(0, 0, Storylines.walkWithRelativesText, candyShop, noCandyShop);
	public static Storyline noWalkingClub = new Storyline(0, 0, Storylines.noWalkingClubText, death, death);
	public static Storyline walkingClub = new Storyline(4, 3, Storylines.walkingClubText, death, death);
	public static Storyline rural = new Storyline(1, 0, Storylines.ruralText, walkWithRelatives, hobby);
	public static Storyline urban = new Storyline(0, 0, Storylines.urbanText, walkingClub, noWalkingClub);
	public static Storyline retirement = new Storyline(0, 0, Storylines.retirementText, urban, rural);
	
	// adulthood
	public static Storyline noPuppy = new Storyline(-3, 0, Storylines.noPuppyText, null, null);
	public static Storyline getPuppy = new Storyline(2, 2, Storylines.getPuppyText, null, null);
	public static Storyline noMuseum = new Storyline(-3, 0, Storylines.noMuseumText, null, null);
	public static Storyline museum = new Storyline(2, 1, Storylines.museumText, null, null);
	public static Storyline puppy = new Storyline(-2, 0, Storylines.puppyText, getPuppy, noPuppy);
	public static Storyline tour = new Storyline(3, 2, Storylines.tourText, museum, noMuseum);
	public static Storyline vacation = new Storyline(0, 0, Storylines.vacationText, tour, puppy);
	
	// young adulthood
	private static Storyline studyMore = new Storyline(-2, 0, Storylines.studyMoreText, null, null);
	private static Storyline hangOut = new Storyline(2, 1, Storylines.hangOutText, null, null);
	private static Storyline complain = new Storyline(-2, -1, Storylines.complainText, null, null);
	private static Storyline enterStore = new Storyline(2, 1, Storylines.enterStoreText, null, null);
	private static Storyline study = new Storyline(-1, 0, Storylines.studyText, hangOut, studyMore);
	private static Storyline store = new Storyline(0, 0, Storylines.storeText, enterStore, complain);
	private static Storyline partyOrPaper = new Storyline(0, 0, Storylines.partyOrPaperText, store, study);
	
	// adolescence
	private static Storyline glue = new Storyline(-2, 0, Storylines.glueText, null, null);
	private static Storyline befriendDavid = new Storyline(3, 2, Storylines.befriendDavidText, null, null);
	private static Storyline dinosaurIsland = new Storyline(1, 1, Storylines.dinosaurIslandText, null, null);
	private static Storyline buildCastle = new Storyline(3, 2, Storylines.buildCastleText, null, null);
	private static Storyline terrorize = new Storyline(0, 0, Storylines.terrorizeText, befriendDavid, glue);
	private static Storyline comply = new Storyline(0, 0, Storylines.complyText, buildCastle, dinosaurIsland);
	private static Storyline adolescenceIntro = new Storyline(0, 1, Storylines.adolescenceIntroText, comply, terrorize);
	
	// infancy
	private static Storyline sleepItOff = new Storyline(-2, 0, Storylines.sleepItOffText, null, null);
	private static Storyline cryMore = new Storyline(3, 1, Storylines.cryMoreText, null, null);
	private static Storyline cooperate = new Storyline(5, 0, Storylines.cooperateText, null, null);
	private static Storyline screamLouder = new Storyline(0, 0, Storylines.screamLouderText, death, death);
	private static Storyline moneyIssues = new Storyline(-2, 0, Storylines.moneyIssuesText, cryMore, sleepItOff);
	private static Storyline cry = new Storyline(-2, 0, Storylines.cryText, cooperate, screamLouder);
	private static Storyline birth = new Storyline(0, 0, Storylines.birthText, moneyIssues, cry);
	
	
	public ChooseYourAdventure()
	{
		
	}
	
	public static void main(String[] args)
	{
		ChooseYourAdventure cyaGame = new ChooseYourAdventure();
		Character player = new Character();System.out.println("\n-----| CHAPTER 1: INFANCY |-----\n");
		cyaGame.playStoryline(birth, player);
		if(player.checkIsDead() == true)
		{
			return;
		}
		System.out.println("\n\n\n-----| CHAPTER 2: ADOLESCENCE |-----\n");
		player.setAge(4);
		cyaGame.playStoryline(adolescenceIntro, player);
		System.out.println("\n\n\n-----| CHAPTER 3: YOUNG ADULTHOOD |-----\n");
		player.setAge(19);
		cyaGame.playStoryline(partyOrPaper, player);
		System.out.println("\n\n\n-----| CHAPTER 4: ADULTHOOD |-----\n");
		player.setAge(43);
		cyaGame.playStoryline(vacation, player);
		System.out.println("\n\n\n-----| CHAPTER 5: OLD AGE |-----\n");
		player.setAge(68);
		cyaGame.playStoryline(retirement, player);
		scr.close();
	}
	
	public void playStoryline(Storyline story, Character p)
	/**
	 * display text,stats
	 * call nextStoryLine
	 */
	{
		p.addHappiness(story.getHappinessChange());
		p.addMeaning(story.getMeaningChange());
		//p.setAge(story.getAge());
		
		System.out.println("Current age: " + p.getAge());
		System.out.println("\nHappiness level: " + p.getHappiness());
		System.out.println("Meaning level: " + p.getMeaning() + "\n");
		System.out.println(story.getText());
		
		nextStoryline(story, p);
	}
	
	public void nextStoryline(Storyline story, Character p)
	{	
		if(story.getOption1() == null) // end of chapter
		{
			return;
		}
		
		else if(story.getOption1().equals(death)) // end of game
		{
			p.setIsDead(true);
			System.out.println(death.getText());
			return;
		}
		else
		{
			System.out.println("\nSelect your option by typing \"1\" or \"2.\"");
			String answer = scr.nextLine();
			if(answer.equals("1"))
			{
				System.out.println("\n-------\n");
				playStoryline(story.getOption1(), p);
			}
			else if(answer.equals("2"))
			{
				System.out.println("\n-------\n");
				playStoryline(story.getOption2(), p);
			}
			else
			{
				System.out.println("Invalid input; please try again");
				System.out.println("\n-------\n");
				nextStoryline(story, p);
			}
		}
	}
	
}
