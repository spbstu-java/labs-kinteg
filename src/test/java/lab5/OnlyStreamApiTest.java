package lab5;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class OnlyStreamApiTest {

    @Test
    void average() {
        assertEquals(OnlyStreamApi.average(Arrays.asList(1, 2, 3)), 2);
    }

    @Test
    void upper() {
        assertEquals(
                OnlyStreamApi.upper(Arrays.asList("t", "a", "t", "y")),
                Arrays.asList("_new_T", "_new_A", "_new_T", "_new_Y")
        );
    }

    @Test
    void sqr() {
        assertEquals(
                OnlyStreamApi.sqr(Arrays.asList(1, 1, 2, 2, 2, 3, 4)),
                Arrays.asList(9, 16)
        );
    }

    @Test
    void sort() {
        assertEquals(
                OnlyStreamApi.sort(Arrays.asList("at", "ab", "aa", "t", "y"), "a"),
                Arrays.asList("aa", "ab", "at")
        );
    }

    @Test
    void findLast() {
        assertEquals(
                OnlyStreamApi.findLast(Arrays.asList("1", "1", "2", "2", "2", "3", "4")),
                "4"
        );
        assertThrows(RuntimeException.class, () -> OnlyStreamApi.findLast(Collections.emptyList()));
    }

    @Test
    void sum() {
        assertEquals(
                OnlyStreamApi.sum(Arrays.asList(1, 1, 2, 2, 2, 3, 4)),
                10
        );
    }

    @Test
    void toMap() {
        assertEquals(
                OnlyStreamApi.toMap(Arrays.asList("at", "bb", "ca", "dt", "ey")),
                Map.of(
                        "a", "t",
                        "b", "b",
                        "c", "a",
                        "d", "t",
                        "e", "y"
                )
        );
    }
}