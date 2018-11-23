package artGenerator;

public class CreatePrompt
{
	private String theme;
	private String idea;
	private String noun;
	private String adjective;
	
	/**
	 * Constructor to initialize variables
	 * @param theme
	 * @param idea
	 * @param noun
	 * @param adjective
	 */
	public CreatePrompt(String theme, String idea, String noun, String adjective)
	{
		this.theme = theme;
		this.idea = idea;
		this.noun = noun;
		this.adjective = adjective;
	}

	/**
	 * Getter for theme
	 * @return
	 */
	public String getTheme()
	{
		return theme;
	}

	/**
	 * Setter for theme
	 * @param theme
	 */
	public void setTheme(String theme)
	{
		this.theme = theme;
	}

	/**
	 * Getter for idea
	 * @return
	 */
	public String getIdea()
	{
		return idea;
	}

	/**
	 * Setter for idea
	 * @param theme
	 */
	public void setIdea(String idea)
	{
		this.idea = idea;
	}

	/**
	 * Getter for noun
	 * @return
	 */
	public String getNoun()
	{
		return noun;
	}

	/**
	 * Setter for noun
	 * @param theme
	 */
	public void setNoun(String noun)
	{
		this.noun = noun;
	}

	/**
	 * Getter for adjective
	 * @return
	 */
	public String getAdjective()
	{
		return adjective;
	}

	/**
	 * Setter for adjective
	 * @param theme
	 */
	public void setAdjective(String adjective)
	{
		this.adjective = adjective;
	}
}
