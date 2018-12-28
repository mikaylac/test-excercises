public class Wolf implements Canine {

    private boolean isHunting;
    private String barkString = "The wolf is barking.";
    private String ignoreString = "The wolf is not barking.";

    @Override
    public String bark() {
        if(isHunting){
            return barkString;
        }
        return ignoreString;
    }

    @Override
    public String eat() {
        return null;
    }

    public void setIsHunting(boolean isHunting){
        this.isHunting = isHunting;
    }
}
