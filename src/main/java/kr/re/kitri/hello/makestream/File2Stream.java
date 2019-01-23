package kr.re.kitri.hello.makestream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class File2Stream {
    public static void main(String[] args) {
        Path file = Paths.get("/Users/seondongson/Documents/javaLamda/hello/src/main/resources/Salaries.csv");
//        System.out.println(file);
        try {
            Files.lines(file).forEach(d -> System.out.println(d));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
