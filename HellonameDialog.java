import javax.swing.JOptionPane;

public class HellonameDialog {
    public static void main(String[] args) {
        String result ; 
        result = JOptionPane.showInputDialog("Please enter your name :");
        JOptionPane.showMessageDialog(null, " Toi ten là Nguyen Trong Hinh. Hi " + result + " ! ");
        System.exit(0);
    }
    
}
