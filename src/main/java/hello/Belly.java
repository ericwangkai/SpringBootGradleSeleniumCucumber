package hello;

/**
 * Created by tommy.wang on 3/27/2015.
 */
public class Belly {
    private int cukes;
    public void eat(int cukes){
        this.cukes = cukes;
    }

    public String getSound(int waitingTime){
        if (cukes > 41 && waitingTime >= 1) {
            return "growl";
        } else {
            return "silent";
        }
    }
}
