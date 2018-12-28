import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class DogTest {

    @Test
    public void shouldReturnBarkStringWhenSeesMailmanIsTrue(){
        Dog dog = new Dog();
        dog.setSeesMailman(true);
        String expectedBarkString = "The dog is barking.";
        assertThat(dog.bark(), is(expectedBarkString));
    }

    @Test
    public void shouldReturnIgnoreStringWhenSeesMailmanIsFalse(){
        Dog dog = new Dog();
        dog.setSeesMailman(false);
        String expectedIgnoreString = "The dog is not barking.";
        assertThat(dog.bark(), is(expectedIgnoreString));
    }
}
