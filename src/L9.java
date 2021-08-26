import javax.swing.JOptionPane;

public class L9 {

    public static void main(String[] args) {

        String firstname;
        String lastname;

        firstname = JOptionPane.showInputDialog("What is your name?");
        lastname = JOptionPane.showInputDialog("What is your last name?");
        JOptionPane.showMessageDialog(null, "Hello " + firstname + " " + lastname + "!!");

        //ALL INPUT IS CONSIDERED STRING DATA

        /* int mph;
        int minutes;
        double hours;
        double distance; */

        //PRO TIP: SEPARATE LIKE DATA-TYPE VARIABLES PN PNE LINE WITH A COMMA

        int mph, minutes;
        double hours, distance;

        mph = Integer.parseInt(JOptionPane.showInputDialog("What was your speed?"));
        minutes = Integer.parseInt(JOptionPane.showInputDialog("How long, IN MINUTES, did you travel?"));

        hours = minutes/60.0;

        distance = hours * 60;

        JOptionPane.showMessageDialog(null, "You traveled " + distance + " miles.");

        System.exit(0);
    }

}