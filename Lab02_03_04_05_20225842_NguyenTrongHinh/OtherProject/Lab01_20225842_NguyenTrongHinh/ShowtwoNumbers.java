// Example 5: ShowTwoNumbers.java
import javax.swing.JOptionPane;

public class ShowtwoNumbers {
    public static void main(String[] args) {
        String strNum1, strNum2;
        String strNotification = "Nguyen Trong Hinh - You've just entered: ";

        // Get the first number from the user
        strNum1 = JOptionPane.showInputDialog(null,
                "Nguyen Trong Hinh - Please input the first number: ", "Input the first number",
                JOptionPane.INFORMATION_MESSAGE);
        strNotification += strNum1 + " and "; // Append the first number to the notification

        // Get the second number from the user
        strNum2 = JOptionPane.showInputDialog(null,
                "Nguyen Trong Hinh - Please input the second number: ", "Input the second number",
                JOptionPane.INFORMATION_MESSAGE);
        strNotification += strNum2; // Append the second number to the notification

        // Display the final message
        JOptionPane.showMessageDialog(null, strNotification,
                "Show two numbers", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0); // Exit the program
    }
}
