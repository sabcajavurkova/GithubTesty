package org.example;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MatematikTest {

    @Test
    void scitani() {
        int x = 2;
        int y = 5;
        Matematik sabi = new Matematik(x, y);

        int spravnyVysledek = 7;
        int sabiVysledek = sabi.secti();

        assertEquals(spravnyVysledek, sabiVysledek);
    }

    @Test
    void odecitani() {
        int x = 2;
        int y = 5;
        Matematik sabi = new Matematik(x, y);

        int spravnyVysledek = -3;
        int sabiVysledek = sabi.odecti();

        assertEquals(spravnyVysledek, sabiVysledek);
    }

    @Test
    void nasobeni() {
        int x = 2;
        int y = 5;
        Matematik sabi = new Matematik(x, y);

        int spravnyVysledek = 10;
        int sabiVysledek = sabi.vynasob();

        assertEquals(spravnyVysledek, sabiVysledek);
    }

}
