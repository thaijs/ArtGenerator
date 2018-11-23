package artGenerator;

public class Main
{

	public static void main(String[] args)
	{
		/**
		 * The reason to do a start menu is if we wanted to save the prompts that were already done and remove them from the generator
		 * Start menu will also allow user to create new prompts
		 */
		StartMenuGUI start = new StartMenuGUI();
		start.setVisible(true);
		
		/**
		 * This will start the GeneratorGUI
		 */
//		GeneratorGUI gen = new GeneratorGUI();
//		gen.setVisible(true);
	}
}
