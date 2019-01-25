/**
 * Created by Benjamin Ehlers on 1/25/2019.
 */
public class BalanceChecker {
    private int[] letterCounts;
    private String string;
    public BalanceChecker(String string) {
        this.string = string;
        letterCounts = new int[26];
    }

    public boolean check(){
        int xCount = 0;
        int yCount = 0;
        for(int i = 0; i < string.length(); i++) {
            if(string.charAt(i) == 'x') {
                xCount++;
            }
            else if(string.charAt(i) == 'y') {
                yCount++;
            }
            else {
                System.out.println("Bad input for check(). Must be all x's and y's.");
            }
        }
        return xCount == yCount;
    }

    public boolean checkBonus(){
        for(int i = 0; i < string.length(); i++) {
            int letterValue = Character.getNumericValue(string.charAt(i)) - 10;
            letterCounts[letterValue]++;
        }
        int maxCount = 0;
        int timesIfStatementEntered = 0;
        for(int i = 0; i < 26; i++) {
            if (letterCounts[i] > maxCount) {
                maxCount = letterCounts[i];
                timesIfStatementEntered++;
            }
        }
        return timesIfStatementEntered < 2;
    }


}
