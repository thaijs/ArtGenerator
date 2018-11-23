package artGenerator;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Dimension;

public class CreatePromptGUI extends JFrame
{

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					CreatePromptGUI frame = new CreatePromptGUI();
					frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CreatePromptGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel pnlDataInput = new JPanel();
		contentPane.add(pnlDataInput, BorderLayout.CENTER);
		
		JLabel lblTheme = new JLabel("Theme:");
		pnlDataInput.add(lblTheme);
		
		JLabel lblIdea = new JLabel("Idea");
		pnlDataInput.add(lblIdea);
		
		JLabel lblNoun = new JLabel("Noun");
		pnlDataInput.add(lblNoun);
		
		JLabel lblAdjective = new JLabel("Adjective:");
		pnlDataInput.add(lblAdjective);
		
		JTextArea txtrTypeHere = new JTextArea();
		txtrTypeHere.setPreferredSize(new Dimension(100, 22));
		txtrTypeHere.setWrapStyleWord(true);
		pnlDataInput.add(txtrTypeHere);
		
		textField = new JTextField();
		pnlDataInput.add(textField);
		textField.setColumns(10);
		
		JPanel pnlSubmitButton = new JPanel();
		contentPane.add(pnlSubmitButton, BorderLayout.NORTH);
	}

}
