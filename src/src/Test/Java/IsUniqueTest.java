package src.Test.Java;

import static org.junit.Assert.assertEquals;

import src.Main.Java.CrackingTheCodingInterview.ChapterOne.IsUnique;
import org.junit.Test;

/**
 * Created by Tim on 9/3/2017.
 */
public class IsUniqueTest extends IsUnique {

    @Test
    public void testQuestionOne(){
        final String[] strings = {null, "", "valid", "invalid"};
        final boolean[] hasUniqueChars = {true, true, true, false};

        for(int i = 0; i < strings.length; i++){
            final String string = strings[i];
            final boolean expected = hasUniqueChars[i];
            assertEquals(String.format("\"%s\" %s unique characters", string, expected? "has": "does not have"),
                    expected,
                    isUniqueChars(string));
        }
    }
}