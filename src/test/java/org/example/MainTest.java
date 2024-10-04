package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(ResultAnalyzer.class)
class MainTest {

    @Test
    public void testShouldWakeUp(){
        assertEquals(Main.shouldWakeUp(true, 1), true);
        assertEquals(Main.shouldWakeUp(false, 2), false);
        assertEquals(Main.shouldWakeUp(true, 8), false);
        assertEquals(Main.shouldWakeUp(true, -1), false);
    }

    @Test
    public void hasTeenTest(){
        assertEquals(Main.hasTeen(9, 99, 19), true);
        assertEquals(Main.hasTeen(23, 15, 42), true);
        assertEquals(Main.hasTeen(22, 23, 34), false);
    }

    @Test
    public void testIsCatPlaying(){
        assertEquals(Main.isCatPlaying(true, 10), false);
        assertEquals(Main.isCatPlaying(false, 36), false);
        assertEquals(Main.isCatPlaying(false, 35), true);
    }

    @Test
    public void testArea(){
        assertEquals(Main.area(5.0, 4.0), 20);
        assertEquals(Main.area(-1.0, 4.0), -1);
    }

    @Test
    public void testSingleArea(){
        assertEquals(Main.area(5.0), 78.53981633974483);
        assertEquals(Main.area(-1.0), -1);
    }

}