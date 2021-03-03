import com.bridgelabz.moodanalyzer.MoodAnalyzer;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {

    MoodAnalyzer mood;



    @Test
    public void testSadMood(){

        mood = new MoodAnalyzer("I am in sad mood");

        System.out.println(mood.analyseMood());

    }

    @Test
    public void testHappyMood(){

        mood = new MoodAnalyzer("I am in Happy mood");

        System.out.println(mood.analyseMood());

    }

}



