import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

import static junit.framework.TestCase.assertTrue;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertFalse;

public class ThingTest {

    //Given two strings, a and b, return the result
    //of putting them together in the order abba,
    //e.g. "Hi" and "Bye" returns "HiByeByeHi".

    @Test
    public void shouldReturnAbbaString() {
        Thing thing = new Thing();

        String a = "Hi";
        String b = "Bye";
        String result = thing.makeAbba(a,b);

        String expectedString = "HiByeByeHi";
        assertThat(result,is(expectedString));
    }

    //Given a two strings. Check to see if the second string
    //matches the front of the first string. On a match return the front of string 1.
    //The first character of the second string does not have to match however.
    //For example if string 1 is "hippo" and string 2 is "hi" you would return "hi".
    //However if string 1 is "hippo" and string 2 is "xip" then you would also return "hip".

    @Test
    public void shouldReturnFrontOfFirstStringOnAMatchIgnoringFirstCharacter(){
        Thing thing = new Thing();

        String wordOne = "hippo";
        String wordTwo = "hip";
        String result = thing.getFrontOfWordOneOnMatch(wordOne,wordTwo);

        String expectedString = "hip";
        assertThat(result,is(expectedString));

        wordTwo = "xip";
        result = thing.getFrontOfWordOneOnMatch(wordOne, wordTwo);

        assertThat(result,is(expectedString));
    }

    //Given a string, return true if the first 2 chars
    //in the string also appear at the end of the string, such as with "edited"

    @Test
    public void shouldReturnTrueIfFirstTwoCharsEqualLastTwoChars(){
        Thing thing = new Thing();
        String word = "edited";
        assertTrue(thing.firstTwoCharsEqualLastTwoChars(word));

        word = "editor";
        assertFalse(thing.firstTwoCharsEqualLastTwoChars(word));
    }

    @Test
    public void shouldMap(){
        String curry = "Curry";
        String durant = "Durant";
        String green = "Green";

        ArrayList<String> players = new ArrayList<>();
        players.add(curry);
        players.add(durant);
        players.add(green);

        int stephsNumber = 30;
        int kevinsNumber = 35;
        int dremondsNumber = 23;

        ArrayList<Integer> jerseyNumbers = new ArrayList<>();
        jerseyNumbers.add(stephsNumber);
        jerseyNumbers.add(kevinsNumber);
        jerseyNumbers.add(dremondsNumber);

        HashMap<String, Integer> expectedMap = new HashMap();
        expectedMap.put(curry, stephsNumber);
        expectedMap.put(durant, kevinsNumber);
        expectedMap.put(green, dremondsNumber);

        Thing thing = new Thing();
        assertThat(thing.mapPlayersToJerseys(players, jerseyNumbers), is(expectedMap));
    }

    //Given an int array length 2, return true if it contains a 2 or a 3.
    @Test
    public void shouldReturnTrueIfContainsTwoOrThree(){
        Thing thing = new Thing();
        assertThat(thing.containsTwoOrThree(new int[]{1,2}), is(true));
    }

    //Given an int array of any length,
    // return a new array of its first 2 elements.
    // If the array is smaller than length 2, use whatever elements are present
    @Test
    public void shouldReturnFirstTwoElementsIfPossible(){
        Thing thing = new Thing();
        int[] result = thing.returnFirstTwo(new int[]{4, 6, 7, 2, 2});
        assertThat(result, is(new int[]{4,6}));

        result = thing.returnFirstTwo(new int[]{4,2});
        assertThat(result, is(new int[]{4,2}));
    }

    //Given 2 int arrays, each length 2, return a new array length 4 containing all their elements
    @Test
    public void shouldCombineArrays(){
        Thing thing = new Thing();
        int[] expectedArr = new int[]{2,3,4,5};
        int[] arr1 = new int[]{2,3};
        int[] arr2 = new int[]{4,5};
        assertThat(thing.combineArrays(arr1, arr2), is(expectedArr));


    }
}
