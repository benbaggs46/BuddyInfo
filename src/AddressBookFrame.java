import javax.swing.*;

public class AddressBookFrame extends JFrame {

    public AddressBookFrame(){
        super("Address Book");

        DefaultListModel addressBook = new DefaultListModel();
        JList jList = new JList(addressBook);

        AddressBookController controller = new AddressBookController(addressBook, jList);

        JMenuBar menuBar = new JMenuBar();
        JMenu buddyMenu = new JMenu();

        JMenuItem menuItem = new JMenuItem("Add Buddy");
        menuItem.setActionCommand("ADD");
        menuItem.addActionListener(controller);
        buddyMenu.add(menuItem);

        menuItem = new JMenuItem("Remove Buddy");
        menuItem.setActionCommand("REMOVE");
        menuItem.addActionListener(controller);
        buddyMenu.add(menuItem);

        menuItem = new JMenuItem("New Address Book");
        menuItem.setActionCommand("NEW");
        menuItem.addActionListener(controller);
        buddyMenu.add(menuItem);

        menuBar.add(buddyMenu);
        buddyMenu.setText("Menu");
        setJMenuBar(menuBar);

        add(new JScrollPane(jList));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new AddressBookFrame();
    }
}
