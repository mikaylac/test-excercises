import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class DogTest {

    @Test
    public void shouldBark_WhenSeesMailmanIsTrue(){
        Dog dog = new Dog();
        dog.setSeesMailman(true);
        String expectedString = "The dog is barking.";
        assertThat(dog.bark(), is(expectedString));
    }

    @Test
    public void shouldNotBark_WhenSeesMailmanIsFalse(){
        Dog dog = new Dog();
        dog.setSeesMailman(false);
        String expectedIgnoreString = "The dog sits quietly.";
        assertThat(dog.bark(), is(expectedIgnoreString));
    }


}
