package live;

import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;

public class Test {
    public static void main(String[] args) {
        // a. Create an instance of Veena and call play() method
        Veena v = new Veena();
        v.play();

        // b. Create an instance of Saxophone and call play() method
        Saxophone s = new Saxophone();
        s.play();

        // c. Place the above instances in a variable of type Playable and then call play()
        Playable p;
        
        System.out.println("\nUsing Playable reference:");
        p = v;
        p.play();

        p = s;
        p.play();
    }
}
