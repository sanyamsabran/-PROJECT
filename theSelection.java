package Project;

interface stringsSelection{
    String welc = "Welcome ";
    String useProject01 = "This is project Glitch.";
    String useProject02 = " And you're our very first user.\n";
    String serve = "Our servers are up and actively running smoothly for the following options.\n";
    String option = "Please type the option you'd like to proceed with.\n";
    String wait = "Waiting for your response...\n";

}

class Selection extends Anxiety implements stringsSelection{
    public void selection() throws InterruptedException{
        // part where the deatils are asked from the user
        charBychar(startName); sleepFor(1000);
        charBychar(equal);
        input.nextLine();
        String name = input.nextLine();
        charBychar(name + queryName); sleepFor(1000);
        charBychar(equal); 
        String queryNameAns = input.nextLine();
        queryNameAns = queryNameAns.toLowerCase();
        switch(queryNameAns){
            case "yes":
                break;
            case "no":
                charBychar(queryNameNo); sleepFor(1000);
                charBychar(equal); 
                name = input.nextLine();
                break;
        }
        charBychar(queryContact); sleepFor(1000);
        charBychar(equal); 
        long contact = input.nextLong();
        charBychar("Please type your email address...\n"); sleepFor(1000);
        charBychar(equal);
        input.next();
        String mail = input.nextLine();
        charBychar(name + querySmoke); sleepFor(1000);
        charBychar(equal); 
        String smoke = input.nextLine();
        charBychar(name + queryAlcohol); sleepFor(1000);
        charBychar(equal); 
        String alcohol = input.nextLine();
        charBychar(queryBG01 + name + queryBG02); sleepFor(1000);
        charBychar(equal); 
        String bloodGroup = input.nextLine();
        charBychar(line); sleepFor(1500);
        charBychar(endDisclaimer); sleepFor(1000);
        charBychar("Thank You for cooperating with us <3\n");
        sleepFor(1000); charBychar(line);

        // part where the selection process begins
        charBychar(welc + name + "\n"); sleepFor(1500);
        charBychar(useProject01); sleepFor(500); charBychar(useProject02); sleepFor(1000);
        charBychar(serve); sleepFor(1000);
        charBychar("1. "); sleepFor(500);
        charBychar("Autism\n"); sleepFor(1000);
        charBychar("2. "); sleepFor(500);
        charBychar("ADHD\n"); sleepFor(1000);
        charBychar("3. "); sleepFor(500);
        charBychar("Anxiety\n"); sleepFor(1000);
        charBychar(option); sleepFor(1000);
        charBychar(wait);
        charBychar(equal);  
        String illnessAnswer = input.nextLine();
        Autism objectAutism = new Autism();
        ADHD objectADHD = new ADHD();
        Anxiety objectAnxiety = new Anxiety();
        illnessAnswer = illnessAnswer.toLowerCase();
        switch(illnessAnswer){
            case "autism":
                objectAutism.initiateAutismTest();
                break;
            case "adhd":
                objectADHD.initiateADHDTest();
                break;
            case "anxiety":
                objectAnxiety.initiateAnxietyTest();
                break;
        }
    }
        
}

public class theSelection {
    public static void main(String args[]) throws InterruptedException{
        Discl test001 = new Discl();
        test001.discl();
        Selection select = new Selection();
        select.selection();
    }
}
