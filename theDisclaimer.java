package Project;

interface usedDisclaimerStrings{
    String disc = "=== DISCLAIMER ===\n";
    String disc01 = "=> This is not a diagnostic test, however if you score higher on any of the tests, you might wanna see your Health Care Provider for the same.\n";
    String disc02 = "=> While we are constantly working on our servers and services, if you face any issues, please let us know.\n";
    String thank = "Thank You <3\n";
    String startName = "Start by entering your name...\n";
    String queryName = ", is that correct?\n";
    String queryNameNo = "Please enter your correct name carefully...\n";
    String askInfo = ", in case you might be wondering, we are asking for these details just to maintain our records and we promise that all your info is completely safe in our hands.\n";
    String queryContact = "Please type your phone number...\n";
    String querySmoke = ", do you smoke?\n";
    String queryAlcohol = ", are you / used to be an alcoholic?\n";
    String queryBG01 = "One last question ";
    String queryBG02 = ", what blood group are you?\n";
    String line = "----------\n";
    String equal = "=> ";
    String endDisclaimer = "We have carefully saved all your information.\n";
}

class Discl extends allMethods implements usedDisclaimerStrings{
    void discl() throws InterruptedException{
        charBychar(disc); sleepFor(1000);
        charBychar(disc01); sleepFor(1000);
        charBychar(disc02); sleepFor(1000);
        charBychar(thank); sleepFor(1000);
        typeEnter("Please press enter to proceed...");
        charBychar(line); sleepFor(2000);
    }
}

public class theDisclaimer {
    public static void main(String args[]) throws InterruptedException{
        Discl testing01 = new Discl();
        testing01.discl();
    }
}
