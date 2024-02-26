package day1;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.concurrent.atomic.AtomicInteger;
 
public class DayOne {
 
    public static void main(String[] args) throws Exception {
 
        AtomicInteger sum = new AtomicInteger();
 
        File file = new File("C:\\Users\\yah-boi\\Desktop\\qub-msc\\repo\\7061-programming\\workspace\\AdventOfCode\\src\\day1\\input.txt");
        Files.lines(file.toPath(), StandardCharsets.UTF_8).forEach(line -> {
            String translateLine = translateLine(line);
            String digits = translateLine.replaceAll("\\D", "");
            if ( digits.length() == 1 ) {
                sum.addAndGet(Integer.parseInt(digits) * 11);
            } else if ( digits.length() >= 2 ) {
                char[] array = digits.toCharArray();
                int number = ((int)array[0] - 48) * 10 + ((int)array[array.length - 1] - 48);
                sum.addAndGet(number);
            } else {
                System.out.println("ERROR");
            }
        });
        System.out.println("SUM: " + sum.get() );
    }
 
    
    private static String translateLine( String line) {
        return line.replaceAll("one", "on1ne") //
                .replaceAll("two", "tw2wo") //
                .replaceAll("three", "thre3hree") //
                .replaceAll("four", "fou4our") //
                .replaceAll("five", "fiv5ive") //
                .replaceAll("six", "si6ix") //
                .replaceAll("seven", "seve7even") //
                .replaceAll("eight", "eigh8ight") //
                .replaceAll("nine", "nin9ine"); //
    }
}