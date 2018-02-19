
/**
 * Write a description of class Password here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.JOptionPane;
public class Password
{
    
    public static void main(String[] args){
        String pass = JOptionPane.showInputDialog("Please enter a new password of at least 6 characters that includes an alphanumeric character:");
        System.out.println(evaluate(pass));

    }
    public static String evaluate(String password) {
        boolean nonAN = false;
        if (password.length() < 6) {
            return evaluate(JOptionPane.showInputDialog("Invalid Password, please try again:"));
        }
        for (int i = 0; i < password.length() ; i++){
            nonAN = (password.substring(i, i+1)).equals("*") ? true : (password.substring(i, i+1)).equals("+") ? true : (password.substring(i, i+1)).equals("-") ? true : (password.substring(i, i+1)).equals("@") ? true : (password.substring(i, i+1)).equals("/") ? true : false;

        }
        if (nonAN == true){return password;}
        else {return evaluate(JOptionPane.showInputDialog("Invalid Password, please try again:"));}
    }


}
