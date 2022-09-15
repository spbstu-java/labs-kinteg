package lab1;

import lab1.Hero;
import lab1.HeroMover;
import lab1.Movements;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class HeroMoverTest {
    private static final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeAll
    public static void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    void move() {
        Hero hero = new Hero();
        HeroMover heroMover = new HeroMover();

        heroMover.move(hero, Movements.FLY, 2);
        assertEquals("Fly " + 2 + " step", outContent.toString());
        outContent.reset();

        heroMover.move(hero, Movements.WALK, 3);
        assertEquals("Walk " + 3 + " step", outContent.toString());
        outContent.reset();

        heroMover.move(hero, Movements.RIDE, 4);
        assertEquals("Ride " + 4 + " step", outContent.toString());
        outContent.reset();
    }
}