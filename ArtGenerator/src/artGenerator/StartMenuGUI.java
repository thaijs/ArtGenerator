package artGenerator;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.CardLayout;
import javax.swing.BoxLayout;
import java.awt.Component;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StartMenuGUI extends JFrame
{

	private JPanel contentPane;

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
					StartMenuGUI frame = new StartMenuGUI();
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
	public StartMenuGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel pnlTitle = new JPanel();
		contentPane.add(pnlTitle, BorderLayout.CENTER);
		pnlTitle.setLayout(new GridLayout(2, 2, 0, 0));
		
		JLabel lblTitle = new JLabel("Drawing Generator");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		pnlTitle.add(lblTitle);
		
		JPanel pnlButtons = new JPanel();
		FlowLayout flowLayout = (FlowLayout) pnlButtons.getLayout();
		flowLayout.setVgap(60);
		flowLayout.setHgap(500);
		pnlTitle.add(pnlButtons);
		
		JButton btnStart = new JButton("Start");
		btnStart.setFocusable(false);
		pnlButtons.add(btnStart);
		
		JButton btnCreateAPrompt = new JButton("Create a Prompt");
		btnCreateAPrompt.setFocusable(false);
		pnlButtons.add(btnCreateAPrompt);
		
		btnCreateAPrompt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				//
			}
		});
		
		
		
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				/**
				 * Create instance of GeneratorGUI
				 * Sets GeneratorGUI visible
				 */
				GeneratorGUI gen = new GeneratorGUI();
				gen.setVisible(true);
				
				/**
				 * Set current class not visible
				 * Dispose of instance of class to save memory
				 */
				setVisible(false);
				dispose();
			}
		});

	}

}
