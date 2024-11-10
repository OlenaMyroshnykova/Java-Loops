package com.loops;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class MultiplicationTableTest {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void testGetTable() {
        MultiplicationTable table = new MultiplicationTable();
        
        String expectedTable = "5 x 1 = 5\n" +
                               "5 x 2 = 10\n" +
                               "5 x 3 = 15\n" +
                               "5 x 4 = 20\n" +
                               "5 x 5 = 25\n" +
                               "5 x 6 = 30\n" +
                               "5 x 7 = 35\n" +
                               "5 x 8 = 40\n" +
                               "5 x 9 = 45\n" +
                               "5 x 10 = 50";
        
        assertThat(table.getTable(5), is(expectedTable));
    }

    @Test
    public void testGetTableForDifferentNumber() {
        MultiplicationTable table = new MultiplicationTable();
        
        String expectedTable = "3 x 1 = 3\n" +
                               "3 x 2 = 6\n" +
                               "3 x 3 = 9\n" +
                               "3 x 4 = 12\n" +
                               "3 x 5 = 15\n" +
                               "3 x 6 = 18\n" +
                               "3 x 7 = 21\n" +
                               "3 x 8 = 24\n" +
                               "3 x 9 = 27\n" +
                               "3 x 10 = 30";
        
        assertThat(table.getTable(3), is(expectedTable));
    }

    @Test
    public void testPrintTable() {
        MultiplicationTable table = new MultiplicationTable();

        String expectedOutput = "5 x 1 = 5\r\n5 x 2 = 10\r\n5 x 3 = 15\r\n5 x 4 = 20\r\n5 x 5 = 25\r\n5 x 6 = 30\r\n5 x 7 = 35\r\n5 x 8 = 40\r\n5 x 9 = 45\r\n5 x 10 = 50";

        table.printTable(5);

        String actualOutput = outputStreamCaptor.toString().trim();
        assertThat(actualOutput, is(expectedOutput));
    }
}
