package hust.soict.dsai.garbage;

import java.nio.file.Files;
import java.nio.file.Paths;

public class NoGarbage {
    public static void main(String[] args) throws Exception {

        String filename = "test.txt";

        byte[] inputBytes = Files.readAllBytes(Paths.get(filename));

        long startTime = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();
        for (byte b : inputBytes) {
            sb.append((char) b);
        }

        String outputString = sb.toString();

        long endTime = System.currentTimeMillis();

        System.out.println("Time (StringBuilder): " + (endTime - startTime));
    }
}