package lab3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class YanGoTranslateTest {

    @Test
    void translate() {
        String dictionary = getClass().getClassLoader().getResource("dictionary.txt").getPath();
        String text = getClass().getClassLoader().getResource("text.txt").getPath();

        YanGoTranslate yanGoTranslate = new YanGoTranslate(dictionary);
        String translate = yanGoTranslate.translate(text);

        assertEquals(translate.toLowerCase(), "Передвигалась Александра по автомагистрали и употребляла сухое, хлебобулочное изделие".toLowerCase());
    }

}