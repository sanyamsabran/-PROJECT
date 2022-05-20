package Project;
import java.util.Scanner;

class allMethods extends usedStrings{
    // deploying a Scanner object to take input 
    Scanner input = new Scanner(System.in);

    // method to put the code to sleep for desired milli-seconds
    protected void sleepFor(int sleepTime) throws InterruptedException{
        Thread.sleep(sleepTime);
    }

    // method to read enter key
    protected void typeEnter(String typingInEnter) throws InterruptedException{
        charBychar(typingInEnter);
        try{
            System.in.read();
        }
        catch(Exception e){}
    }

    // method to print character by character in a string
    protected void charBychar(String theString) throws InterruptedException{
        for(int i = 0; i < theString.length(); i++){
            System.out.print(theString.charAt(i));
            Thread.sleep(57);
        }
    }
}

public class UsedMethods {

}

