import java.util.Scanner;

/**
 * Created by Benjamin Ehlers on 1/25/2019.
 */
public class main {

    public static void main(String args[]) {
        String input;
        String check;
        System.out.println("Type in a word. (Can be empty). Hit enter. Then type in 'c' to do the standard check, or 'b to do the bonus check.");
        System.out.println("Enter '!' on the first input to quit.");
        while(true) {
            Scanner scanWord = new Scanner(System.in);
            input = scanWord.nextLine();
            if(input.equals("!")) break;
            BalanceChecker bc = new BalanceChecker(input);
            Scanner scanCommand = new Scanner(System.in);
            check = scanCommand.nextLine();
            if(check.equals("c")) {
                System.out.println("check(" + input + ") => " + bc.check());
            }
            else if(check.equals("b")) {
                System.out.println("checkBonus(" + input + ") => " + bc.checkBonus());
            }

        }
    }
}
