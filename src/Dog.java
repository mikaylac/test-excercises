public class Dog implements Canine{

    private boolean seesMailman;
    private String barkString = "The dog is barking.";
    private String ignoreString = "The dog is not barking.";

    @Override
    public String bark() {
        if(seesMailman){
            return barkString;
        }
        return ignoreString;
    }

    @Override
    public String eat() {
        return null;
    }

    public void setSeesMailman(boolean seesMailman){
        this.seesMailman = seesMailman;
    }
}
