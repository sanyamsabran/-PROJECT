package Project;

interface stringsAutism{
    // definition / information
    String defAutism01 = "=> Autism, also called as Autism Spectrum Disorder (ASD), is a complicated condition that includes problems with communication and behavior. It can involve a wide range of symptoms and skills. ASD can be a minor problem or a disability that needs full time care in a special facility.\n";
    String defAutism02 = "=> People with autism have trouble with communication. They have trouble understanding what other people think and feel. This makes it hard for them to express themselves, either with words or through gestures, facial expressions, and touch.\n";
    String defAutism03 = "=> People with autism might have problems with learning. Their skills might develop unevenly. For example, they could have trouble communicating but be unusually good at art, music, math, or memory. Because of this, they might do especially well on tests of analysis or problem-solving.\n";

    // before quiz disclaimers and info
    String takeAutismTest = ":- Take our autism test and see whether you have any traits of autism\n";
    String faq = ":- Before you proceed with the short test, following are a few common questions (with answers) that may arise.\n";
    String faq01 = "# WHY IS IT WORTH TAKING AN AUTISM TEST?\n";
    String faqa01 = "=> Our autism test helps identify whether you have any traits of autism. The questions look to see if you have any difficulty dealing with social situations, understanding aspects of language, multi-tasking, and more.\n";
    String faqa02 = "=> While this test is not a diagnosis for autism, the test can give you an indication of whether you have traits of autism. If you score highly on this quiz, you may wish to speak to your GP about arranging a formal diagnosis.\n";
    String faqa03 = "=> A diagnosis can help you to access the support you need and can help explain to others what this support should be\n";
    String faq02 = "# WHO IS THIS AUTISM TEST FOR?\n";
    String faqa11 = "=> This autism test is suited to adults who think they may experience traits of autism, such as difficulty with social interaction and interpreting others’ emotions, or preferring to stick to a fixed routine. However, as autism is a spectrum condition, individual traits will differ from person to person.\n";

}

class Autism extends Discl implements stringsAutism{
    protected void infoAutism() throws InterruptedException{
        charBychar("|--------------|\n"); sleepFor(500);
        charBychar("|--- AUTISM ---|\n"); sleepFor(500);
        charBychar("|--------------|\n"); sleepFor(500);
        charBychar(defAutism01); sleepFor(1500);
        charBychar(space); sleepFor(500);
        charBychar(defAutism02); sleepFor(1500);
        charBychar(space); sleepFor(500);
        charBychar(defAutism03); sleepFor(1500);
        charBychar(line); sleepFor(500);
        charBychar(line); sleepFor(1000);
    }
    protected void beforeAutismQuiz() throws InterruptedException{
        charBychar(takeAutismTest); sleepFor(1000);
        charBychar(faq); sleepFor(1500);
        charBychar(line); sleepFor(500);
        charBychar(line); sleepFor(1000);
        charBychar(faq01); sleepFor(1500);
        charBychar(faqa01); sleepFor(1000);
        charBychar(space);
        charBychar(faqa02); sleepFor(1000);
        charBychar(space);
        charBychar(faqa03); sleepFor(1000);
        charBychar(space); sleepFor(1000);
        charBychar(faq02); sleepFor(1500);
        charBychar(faqa11); sleepFor(1000);
        charBychar(line); sleepFor(1500);
        typeEnter("Press the Enter key to proceed...");
    }
    protected void initiateAutismTest() throws InterruptedException{
        infoAutism();
        beforeAutismQuiz();
        charBychar(line); sleepFor(1500);
        charBychar("Test Begins...\n"); sleepFor(1000);
        
        charBychar("1. On a scale of 0 to 10, how often have you always, since early childhood and currently, had difficulty with social interactions, for example, trouble fitting-in, difficulty sustaining eye contact, unsure how to initiate interactions or navigate through conversations?\n"); sleepFor(500);
        charBychar(equal); 
        int ans01 = input.nextInt();
        System.out.println(" ");

        charBychar("2. On a scale of 0 to 10, how often have you always, since early childhood and currently, struggled with sensory sensitivities such as with clothing (avoid certain clothes), foods (finicky and limited food choices), smells (extra sensitive to mundane odors), touch (have always avoided affection or being touched), and sounds (vacuum sweepers, blenders, the chatter of crowds)?\n"); sleepFor(500);
        charBychar(equal);
        int ans02 = input.nextInt();
        System.out.println(" ");

        charBychar("3. On a scale of 0 to 10, how often did you, when you were a child, exhibit hand-flapping, toe-walking, pacing or walking in circles, or lining-up objects?\n"); sleepFor(500); 
        charBychar(equal);
        int ans03 = input.nextInt();
        System.out.println(" ");

        charBychar("4. On a scale of 0 to 10, how often do you currently tend to pace back and forth?\n"); sleepFor(500);
        charBychar(equal);
        int ans04 = input.nextInt();
        System.out.println(" ");

        charBychar("5. On a scale of 0 to 10, how often have you always, since early childhood and currently, tended to obsess on certain topics, interests, or fears?\n"); sleepFor(500);
        charBychar(equal);
        int ans05 = input.nextInt();
        System.out.println(" ");

        charBychar("6. On a scale of 0 to 10, how often have you always tended to lack empathy for others, and have trouble understanding how others feel?\n"); sleepFor(500);
        charBychar(equal);
        int ans06 = input.nextInt();
        System.out.println(" ");

        charBychar("7. On a scale of 0 to 10, how often have you always struggled with groups of people, and prefer being alone or limit to one-to-one encounters?\n"); sleepFor(500);
        charBychar(equal);
        int ans07 = input.nextInt();
        System.out.println(" ");

        charBychar("8. On a scale of 0 to 10, how often are changes in routine, or if something is not going as expected, very unsettling for you?\n"); sleepFor(500);
        charBychar(equal);
        int ans08 = input.nextInt();
        System.out.println(" ");

        charBychar("9. On a scale of 0 to 10, how often are you very literal in your thinking and have trouble understanding idioms or slang expressions such as “break a leg”, “bite the bullet”, “stabbed in the back”?\n"); sleepFor(500);
        charBychar(equal); 
        int ans09 = input.nextInt();
        System.out.println(" ");

        double result = (ans01 + ans02 + ans03 + ans04 + ans05 + ans06 + ans07 + ans08 + ans09) / 9;
        result = result * 10;
        
        charBychar("You scored " + result + " on this test.\n"); sleepFor(1000);
        charBychar("A proper mail will be mailed to your email address for futher steps.\n"); sleepFor(1000);
        charBychar("Thank You <3"); sleepFor(1000);
    }

}

public class theAutism {
    public static void main(String args[]) throws InterruptedException{
    }
}