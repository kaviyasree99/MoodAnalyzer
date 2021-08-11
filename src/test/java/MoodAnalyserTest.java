//Importing Java Packages
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
    //Test To Given Message Sad Mood Should Return Sad
    @Test
    public void givenMessage_IAmInSadMoodMessage_ShouldReturnSad(){
        //Defining moodAnalyser Object
        MoodAnalyser moodAnalyser = new MoodAnalyser("I Am In Sad Mood");
        //Calling AnalyseMood Method And Giving Input Message
        String   mood = moodAnalyser.analyseMood();
        //Asserting The Result As Boolean Type True Or False
        Assertions.assertEquals(mood, "SAD");
    }
    //Test To Given Message Any Mood Should Return Happy
    @Test
    public void givenMessage_IAmInAnyMoodMessage_ShouldReturnHappy(){
        //Defining moodAnalyser Object
        MoodAnalyser moodAnalyser = new MoodAnalyser("I Am In Any Mood");
        //Calling AnalyseMood Method And Giving Input Message
        String   mood = moodAnalyser.analyseMood();
        //Asserting The Result As Boolean Type True Or False
        Assertions.assertEquals(mood, "HAPPY");
    }
}