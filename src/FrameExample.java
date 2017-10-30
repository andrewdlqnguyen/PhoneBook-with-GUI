import javax.swing.*;
import java.awt.event.*;

public class FrameExample {
	
	/*
	JMenu menu, subMenu;
	JMenuItem menuItem;
	JRadioButtonMenuItem rbMenuItem;
	JCheckBoxMenuItem cbMenuItem;
	*/

	

	public static void main(String[] args) {
		AddressBook addressBook;
	
		JFrame f = new JFrame("Booking GUI");
		f.setSize(400, 300);
		f.setLocationRelativeTo(null);
		
		// Menu bar for AddressBook
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu("AddressBook");
		menuBar.add(menu);
		
		// AddressBook Menu Item 1
		JMenuItem menuItem = new JMenuItem("Create AddressBook");
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddressBook newAddressBook = new AddressBook();
				System.out.println(e.getSource());
				System.out.println(e.getActionCommand());
				JOptionPane.showMessageDialog(null, "addressBook Created");
			}
			
		});
		menu.add(menuItem);
		
		// AddressBook Menu Item 2
		menuItem = new JMenuItem("Save AddressBook");
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(e.getSource());
				System.out.println(e.getActionCommand());
				JOptionPane.showMessageDialog(null, "addressBook Saved");
			}
		});
		menu.add(menuItem);		
		menu.addSeparator();
		
		// AddressBook Menu Item 3
		menuItem = new JMenuItem("Display Buddy List");
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(e.getSource());
				System.out.println(e.getActionCommand());
			}
		});
		menu.add(menuItem);
		
		// Menu bar for BuddyInfo
		menu = new JMenu("BuddyInfo");
		menuBar.add(menu);
		
		// BuddyInfo Menu Item 1
		menuItem = new JMenuItem("Add a BuddyInfo to AddressBook");
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(e.getSource());
				System.out.println(e.getActionCommand());
				BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", 1234);
				
				// menuItem.setText("addressBook Created");
			}
		});
		menu.add(menuItem);
                
		
		
		f.setJMenuBar(menuBar);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

// create new AddressBook
// Save
// Display BuddyInfos contained in Addressbook
// add a Buddy Info into AddressBook

//Create a JMenubar 