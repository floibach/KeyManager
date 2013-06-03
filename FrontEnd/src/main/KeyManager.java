package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import org.eclipse.wb.swing.FocusTraversalOnArray;

import java.awt.Component;

import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.JTextPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import javax.swing.JComboBox;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;
import java.awt.BorderLayout;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.AbstractListModel;

public class KeyManager {

	private JFrame frame;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KeyManager window = new KeyManager();
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
	public KeyManager() 
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 608, 416);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		
		JPanel panelOne = new JPanel();
		
		tabbedPane.addTab("Versuch1", panelOne);
		panelOne.setLayout(null);
		

		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBounds(165, 28, 256, 20);
		panelOne.add(comboBox);
		
		for(int i = 0; i<3; i++)
		{
			textField_3 = new JTextField();
			textField_3.setBounds(97, 179+20*i, 86, 20);
			panelOne.add(textField_3);
		}
		
		
		

		
		JComponent panelTwo = new JLabel("Ttes");
		tabbedPane.addTab("Versuch2", panelTwo);
		
		
		
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 592, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
		);
		
		
		frame.getContentPane().setLayout(groupLayout);
		frame.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{frame.getContentPane()}));
	}
}
