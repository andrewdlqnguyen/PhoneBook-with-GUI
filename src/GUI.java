import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextArea;
// import java.io.BufferedWriter;
// import java.io.FileWriter;


import javax.swing.*;


public class GUI extends JFrame {
	
	JMenu menu1, menu2;
	JMenuBar menuBar;
	JMenuItem createAddressBook, saveAddressBook, DisplayBuddyInfo, addBuddyInfo;
	JTextArea textArea;
	JOptionPane optionPane;
	Container contentPane;
	FlowLayout layout;
	AddressBook addressBookUnit;

	
	public GUI(AddressBook addressBook) {
		super("Booking GUI");
		this.addressBookUnit = addressBook;
		
		setLocationRelativeTo(null);
		setSize(400, 300);
		layout = new FlowLayout();
		
		contentPane = getContentPane();
		contentPane.setLayout(layout);
		
		//Creating Menu Bar
		menuBar = new JMenuBar();
		
		menu1 = new JMenu("AddressBook");
		menu2 = new JMenu("BuddyInfo");
		menuBar.add(menu1);
		menuBar.add(menu2);
		
		//List of menu item for AddressBook
		createAddressBook = new JMenuItem("Create AddressBook");
		saveAddressBook = new JMenuItem("Save AddressBook");
		DisplayBuddyInfo = new JMenuItem("Display BuddyList");
		menu1.add(createAddressBook);
		menu1.add(saveAddressBook);
		menu1.addSeparator();
		menu1.add(DisplayBuddyInfo);
		
		//List of menu item for BuddyList
		addBuddyInfo = new JMenuItem("Add a BuddyInfo to AddressBook");
		menu2.add(addBuddyInfo);
		
		theHandler handler = new theHandler();
		createAddressBook.addActionListener(handler);
		saveAddressBook.addActionListener(handler);
		DisplayBuddyInfo.addActionListener(handler);
		addBuddyInfo.addActionListener(handler);
		
		saveAddressBook.setEnabled(false);
		DisplayBuddyInfo.setEnabled(false);
		addBuddyInfo.setEnabled(false);
		
		
		//Setting up final interface
		textArea = new JTextArea(20,30);
		textArea.setEditable(false);
		
		
		contentPane.add(textArea);
		setJMenuBar(menuBar);
		
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	private class theHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
	
			if(e.getSource() == createAddressBook) {
				System.out.println(e.getActionCommand());
				textArea.setText("Creating AddressBook...\n" + "...\n" + "AddressBook Created!\n" + "Added Default BuddyInfo list for testing!");
				createAddressBook.setEnabled(false);
				saveAddressBook.setEnabled(true);
				DisplayBuddyInfo.setEnabled(true);
				addBuddyInfo.setEnabled(true);
			}
			if(e.getSource() == saveAddressBook) {
				System.out.println(e.getActionCommand());
				textArea.setText("AddressBook Saving...\n" + "...\n" + "AddressBook Saved!");
				
				// FIGURE OUT HOW TO SAVE LIST INTO A TEXT FILE
			}
			if(e.getSource() == DisplayBuddyInfo) {
				System.out.println(e.getActionCommand());
				textArea.setText(addressBookUnit.getAddressBookList());
				//textArea.setText(addressBook.get);
			}
			if(e.getSource() == addBuddyInfo) {
				String newName = "";
				String newAddress = "";
				String newNumber = "";
				System.out.println(e.getActionCommand());
				newName = JOptionPane.showInputDialog("Enter Name:");
				newAddress = JOptionPane.showInputDialog("Enter Address:");
				newNumber = JOptionPane.showInputDialog("Enter Phone Number: xxx-xxx-xxxx");
				
				//COULD ADD A CHECK CONDITION FOR PROPER PHONE NUMBER FORMAT
				
				addressBookUnit.addBuddy(new BuddyInfo(newName,newAddress,newNumber));
			}
		}
	}
}
