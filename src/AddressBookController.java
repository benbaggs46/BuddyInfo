import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class AddressBookController implements ActionListener {

    private DefaultListModel model;
    private JList view;

    public AddressBookController(DefaultListModel model, JList view){
        this.model = model;
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       String command = e.getActionCommand();
       if(command.equals("ADD")) {

           String name = JOptionPane.showInputDialog("Please input a name");
           String address = JOptionPane.showInputDialog("Please input an address");
           String phoneNumber = JOptionPane.showInputDialog("Please input a phone number");

           model.addElement(new BuddyInfo(name, address, phoneNumber));
       }
       if(command.equals("REMOVE")) {
            model.removeElement(view.getSelectedValue());
       }
       if(command.equals("NEW")) {
            model.clear();
       }
    }
}
