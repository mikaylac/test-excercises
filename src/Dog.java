public class Dog implements Canine{

    private boolean seesMailman;

    @Override
    public String bark() {
        if(seesMailman){
            return "The dog is barking.";
        }
        return "The dog sits quietly.";
    }

    @Override
    public String eat() {
        return null;
    }

    public void setSeesMailman(boolean seesMailman){
        this.seesMailman = seesMailman;
    }
}
