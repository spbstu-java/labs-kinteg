package lab1;

import java.util.Map;
import java.util.function.Consumer;

public class HeroMover {
    private static final Map<Movements, Consumer<Integer>> MOVEMENTS = Map.of(
            Movements.WALK, (step) -> System.out.print("Walk " + step + " step"),
            Movements.FLY, (step) -> System.out.print("Fly " + step + " step"),
            Movements.RIDE, (step) -> System.out.print("Ride " + step + " step")
    );

    public void move(Hero hero, Movements strategy, Integer step) {
        hero.move(MOVEMENTS.get(strategy), step);
    }
}
