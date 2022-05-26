package com.lzb.refactor_pratice.bug_zero;


import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class GameTest {

	@Test
	public void itsLockedDown() throws Exception {

        Random randomizer = new Random(123455);
        ByteArrayOutputStream resultStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(resultStream));

        IntStream.range(1,15).forEach(i -> GameRunner.playGame(randomizer));

        //Approvals.verify(resultStream.toString());

        String dir = "/Users/cidervisioncase/project/design-pattern/src/test/java/com/lzb/refactor_pratice/bug_zero/";
        String targetString = String.join("\n", Files.readAllLines(Paths.get(dir + "./GameTest.itsLockedDown.approved.txt"))) + "\n";

        assertEquals(targetString.replaceAll("[\r\n]", ""), resultStream.toString().replaceAll("[\r\n]", ""));
	}
}
