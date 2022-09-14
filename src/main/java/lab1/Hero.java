package lab1;

import java.util.function.Consumer;

public class Hero {

    public void move(Consumer<Integer> movement, Integer step) {
        movement.accept(step);
    }

}
