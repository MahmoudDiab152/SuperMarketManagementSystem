package utility;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Utilities {

    public static boolean passwordValidation(JFrame frm, char[] input) {
        if (input.length < 8) {
            JOptionPane.showMessageDialog(frm, "Password should be at least 6 characters");
            return false;
        }
        return true;
    }

    public static boolean isValidInteger(JFrame frm, String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frm, "You have entered non-numeric value in numeric input(age,quantity)");
            return false;
        }
    }

    public static boolean isValidLong(JFrame frm, String input) {
        try {
            Long.parseLong(input);
            return true;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frm, "You have entered non-numeric value in numeric input(Id)");
            return false;
        }
    }

    public static boolean isValidDouble(JFrame frm, String input) {
        try {
            Double.parseDouble(input);
            return true;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frm, "You have entered non-numeric value in numeric input(Price)");
            return false;
        }
    }

}
