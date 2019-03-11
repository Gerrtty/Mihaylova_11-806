package com.company;
import java.io.*;
import org.junit.Before;
import org.junit.Test;
import java.io.FileNotFoundException;

import static org.junit.Assert.*;

public class CosineSimilarityTest {
    CosineSimilarity cs = new CosineSimilarity();

    @Test
    public void testCosineSimilarity0() {
        int expected = 0;
        int actual = (int) cs.analyze(new SimpleTextProvider("Hello"), new SimpleTextProvider("By"));
        assertEquals(expected, actual);
    }

    @Test
    public void testCosineSimilarity1(){
        int expected = 1;
        int actual = (int) cs.analyze(new SimpleTextProvider("Hi"), new SimpleTextProvider("Hi"));
        assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void file(){
        File f1 = new File("f1.txt");
        File f2 = new File("f2.txt");
        cs.analyze(new FileTextProvider(f1), new FileTextProvider(f2));
    }
}
