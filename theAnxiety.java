package Project;

interface stringsAnxiety{
    // definitions / informations
    String headAnxiety = "--- ANXIETY ---\n";
    String defAnxiety01 = "=> Anxiety is a normal emotion. It’s your brain’s way of reacting to stress and alerting you of potential danger ahead.\n";
    String defAnxiety02 = "Everyone feels anxious now and then. For example, you may worry when faced with a problem at work, before taking a test, or before making an important decision.\n";
    String defAnxiety03 = "Occasional anxiety is OK. But anxiety disorders are different. They’re a group of mental illnesses that cause constant and overwhelming anxiety and fear.  The excessive anxiety can make you avoid work, school, family get-togethers, and other social situations that might trigger or worsen your symptoms.\n";
}

class Anxiety extends ADHD implements stringsAnxiety{
    protected void initiateAnxietyTest() throws InterruptedException{
        System.out.println("works anx");
    }

}

public class theAnxiety {
    
}
