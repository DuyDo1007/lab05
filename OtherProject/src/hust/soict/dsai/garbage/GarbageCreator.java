package hust.soict.dsai.garbage;

import java.nio.file.Files;
import java.nio.file.Paths;

public class GarbageCreator {
    public static void main(String[] args) throws Exception {
        byte[] inputBytes = Files.readAllBytes(Paths.get("C:\\Users\\Victus\\OneDrive - Hanoi University of Science and Technology\\Desktop\\test.txt"));
        long startTime = System.currentTimeMillis();
        String outputString = "";
        for (byte b : inputBytes) {
            outputString += (char) b;
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
}
