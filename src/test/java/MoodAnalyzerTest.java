import com.bridgelabz.moodanalyzer.MoodAnalyzer;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {

    MoodAnalyzer mood;



    @Test
    public void testSadMood(){

        mood = new MoodAnalyzer(null);

        System.out.println(mood.analyseMood());

    }


}



