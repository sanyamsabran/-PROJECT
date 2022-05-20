package Project;

interface stringsADHD{
    // definitions / informations
    String headADHD = "--- ADHD ---\n";
    String defADHD01 = "=> Attention deficit hyperactivity disorder (ADHD) is a brain disorder that affects how you pay attention, sit still, and control your behavior. It happens in children and teens and can continue into adulthood.\n";
    String defADHD02 = "=> ADHD is the most commonly diagnosed mental disorder in children. Boys are more likely to have it than girls. It’s usually spotted during the early school years, when a child begins to have problems paying attention.\n";
    String defADHD03 = "=> ADHD can't be prevented or cured. But spotting it early, plus having a good treatment and education plan, can help a child or adult with ADHD manage their symptoms.\n";

    // before quiz disclaimers and info
    String takeADHDTest = "Take our ADHD test and see whether you have any traits of ADHD.\n";
    String beforeInfo = "* Before you proceed with the short test, here's some more information.\n";
    String info01 = "=> Not everyone has the same sympotoms, or experiences ADHD in the same way.\n";
    String info02 = "=> ADHD can look different for everyone. For example, symptoms of ADHD in children might look and feel different in Adults.\n";
    String info03 = "Your symptoms will depend on the type of ADHD you have. The major symptopms of ADHD include inattention and hyperactivity or impulsivity.\n";
    String info04 = "\n";
}

class ADHD extends Autism implements stringsADHD{
    protected void infoADHD() throws InterruptedException{
        charBychar(headADHD); sleepFor(1500);
        charBychar(defADHD01); sleepFor(1500);
        charBychar(space); sleepFor(500);
        charBychar(defADHD02); sleepFor(1500);
        charBychar(space); sleepFor(500);
        charBychar(defADHD03); sleepFor(1500);
        charBychar(space); sleepFor(500);
        charBychar(dots); sleepFor(1500);
        charBychar(space);
    }
    protected void initiateADHDTest() throws InterruptedException{
        System.out.println("working adhd");
    }
}

public class theADHD {
    public static void main(String args[]) throws InterruptedException{
        ADHD testingNow = new ADHD();
        testingNow.infoADHD();
    }
}
