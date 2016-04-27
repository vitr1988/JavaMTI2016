package ru.mti.edu.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.SpringLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JEditorPane;

public class GUITest {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUITest window = new GUITest();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUITest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		final JTextPane textPane = new JTextPane();
		springLayout.putConstraint(SpringLayout.NORTH, textPane, 35, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, textPane, 21, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, textPane, -203, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, textPane, 184, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(textPane);
		
		final JLabel lblNewLabel = new JLabel("Привет");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 6, SpringLayout.SOUTH, textPane);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 0, SpringLayout.WEST, textPane);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Push me");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText(textPane.getText());
			}
		});
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton, 22, SpringLayout.EAST, textPane);
		springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton, 0, SpringLayout.SOUTH, textPane);
		frame.getContentPane().add(btnNewButton);
		
		JEditorPane editorPane = new JEditorPane();
		springLayout.putConstraint(SpringLayout.NORTH, editorPane, 20, SpringLayout.SOUTH, lblNewLabel);
		springLayout.putConstraint(SpringLayout.WEST, editorPane, 21, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, editorPane, 118, SpringLayout.SOUTH, lblNewLabel);
		springLayout.putConstraint(SpringLayout.EAST, editorPane, 155, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(editorPane);
//		frame.pack();
	}
}
