package org.apache.commons.io;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.*;
public class IOUtilsBlackBoxTest {


    IOUtils io = new IOUtils();
    File file1 = new File("src/tests/f1.txt");
    BufferedInputStream in1, in2;

    @Before
    public void setUp() throws Exception {
        in1 = new BufferedInputStream(new FileInputStream(file1));
    }

    @Test
    public void test1() throws IOException {
        File file1 = new File("src/tests/f1e.txt");
        InputStream in = new BufferedInputStream(new FileInputStream(file1));
        File file2 = new File("src/tests/f2e.txt");
        InputStream in2 = new BufferedInputStream(new FileInputStream(file2));
        assertEquals(true, io.contentEquals(in, in2));
    }

    @Test
    public void test2() throws IOException {
        File file2 = new File("src/tests/f2.txt");
        in2 = new BufferedInputStream(new FileInputStream(file2));
        assertEquals(true, io.contentEquals(in1, in2));
    }

    @Test
    public void test3() throws IOException {
        File file2 = new File("src/tests/fm.txt");
        in2 = new BufferedInputStream(new FileInputStream(file2));
        assertEquals(false, io.contentEquals(in1, in2));
    }

    @Test
    public void test4() throws IOException {
        File file2 = new File("src/tests/ffl.txt");
        in2 = new BufferedInputStream(new FileInputStream(file2));
        assertEquals(false, io.contentEquals(in1, in2));
    }

    @Test
    public void test5() throws IOException {
        File file2 = new File("src/tests/ftl.txt");
        in2 = new BufferedInputStream(new FileInputStream(file2));
        assertEquals(false, io.contentEquals(in1, in2));
    }

    @Test
    public void test6() throws IOException {
        File file2 = new File("src/tests/ftw.txt");
        in2 = new BufferedInputStream(new FileInputStream(file2));
        assertEquals(false, io.contentEquals(in1, in2));
    }

    @Test
    public void test7() throws IOException {
        File file2 = new File("src/tests/ftltw.txt");
        in2 = new BufferedInputStream(new FileInputStream(file2));
        assertEquals(false, io.contentEquals(in1, in2));
    }

    @Test
    public void test8() throws IOException {
        File file2 = new File("src/tests/fs.txt");
        in2 = new BufferedInputStream(new FileInputStream(file2));
        assertEquals(false, io.contentEquals(in1, in2));
    }

    @Test
    public void test9() throws IOException {
        File file2 = new File("src/tests/fbb.txt");
        in2 = new BufferedInputStream(new FileInputStream(file2));
        assertEquals(false, io.contentEquals(in1, in2));
    }

    @Test
    public void test10() throws IOException {
        File file2 = new File("src/tests/fbe.txt");
        in2 = new BufferedInputStream(new FileInputStream(file2));
        assertEquals(false, io.contentEquals(in1, in2));
    }

    @Test
    public void test11() throws IOException {
        File file2 = new File("src/tests/fbm.txt");
        in2 = new BufferedInputStream(new FileInputStream(file2));
        assertEquals(false, io.contentEquals(in1, in2));
    }

    @After
    public void exit() throws Exception {
        io.closeQuietly(in1);
        io.closeQuietly(in2);
    }


}