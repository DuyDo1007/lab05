package hust.soict.dsai.garbage;

import java.nio.file.Files;
import java.nio.file.Paths;

public class NoGarbage {
    public static void main(String[] args) throws Exception {
        byte[] inputBytes = Files.readAllBytes(Paths.get("test.txt"));
        long startTime = System.currentTimeMillis();
        StringBuilder outputString = new StringBuilder();
        for (byte b : inputBytes) {
            outputString.append((char) b);
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
}
