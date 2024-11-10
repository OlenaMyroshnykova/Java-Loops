package com.loops;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class AppTest {

    @Test
    public void testRunAppWithYesResponse() {
        String input = "5\nY\n5\nN\n";
        System.setIn(new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8)));

        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));

        App.main(new String[]{});

        String output = outputStreamCaptor.toString();
        assertThat(output, containsString("5 x 1 = 5"));
        assertThat(output, containsString("5 x 10 = 50"));
        assertThat(output, containsString("Presiona Y para continuar... Y/N:"));
        assertThat(output, containsString("Chao!"));
    }

    @Test
    public void testRunAppWithNoResponse() {
        String input = "3\nN\n";
        System.setIn(new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8)));

        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));

        App.main(new String[]{});

        String output = outputStreamCaptor.toString();
        assertThat(output, containsString("3 x 1 = 3"));
        assertThat(output, containsString("3 x 10 = 30"));
        assertThat(output, containsString("Chao!"));
    }
}


