import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class WolfTest {

    @Test
    public void shouldReturnBarkStringWhenIsHuntingIsTrue(){
        Wolf wolf = new Wolf();
        wolf.setIsHunting(true);
        String expectedBarkString = "The wolf is barking.";
        assertThat(wolf.bark(), is(expectedBarkString));
    }

    @Test
    public void shouldReturnIgnoreStringWhenIsHuntingIsFalse(){
        Wolf wolf = new Wolf();
        wolf.setIsHunting(false);
        String expectedIgnoreString = "The wolf is not barking.";
        assertThat(wolf.bark(), is(expectedIgnoreString));
    }
}
