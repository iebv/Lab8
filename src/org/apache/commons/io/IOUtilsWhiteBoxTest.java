package org.apache.commons.io;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;
import static org.junit.Assert.assertEquals;


public class IOUtilsWhiteBoxTest {

    IOUtils io = new IOUtils();
    File file1 = new File("src/tests/f1.txt");
    InputStream in1, in2;

    @Before
    public void setUp() throws Exception {
        in1 = new FileInputStream(file1);
    }

    @Test
    public void test12() throws IOException {
        File file1 = new File("src/tests/f1e.txt");
        InputStream in = new FileInputStream(file1);
        File file2 = new File("src/tests/f2e.txt");
        InputStream in2 = new FileInputStream(file2);
        assertEquals(true, io.contentEquals(in, in2));
    }

    @Test
    public void test13() throws IOException {
        File file2 = new File("src/tests/f2.txt");
        in2 = new FileInputStream(file2);
        assertEquals(true, io.contentEquals(in1, in2));
    }

    @Test
    public void test14() throws IOException {
        File file2 = new File("src/tests/fm.txt");
        in2 = new FileInputStream(file2);
        assertEquals(false, io.contentEquals(in1, in2));
    }

}
