package kr.re.kitri.hello.majorleague;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Stream;

public class PlayerAnalysis {
    public static void main(String[] args) throws IOException {
        // 1. 파일을 스트림으로 변환
        Path file = Paths.get("/Users/seondongson/Documents/javaLamda/hello/src/main/resources/Salaries.csv");
//        Optional<String>
//        OptionalDouble, OptionalInt, OptionalLong

        OptionalDouble nl = Files.lines(file)   // Stream<String>
                .skip(1)
                .distinct() // 중복 제거
                .map(line -> {
                    String[] splitted = line.split(",");
                    return new Player(
                            Integer.parseInt(splitted[0]),
                            splitted[1],
                            splitted[2],
                            splitted[3],
                            Long.parseLong(splitted[4]));
                })  // Stream<Player>
                .filter(p -> p.getLeague().equals("NL") && p.getYear() >= 2000)
                .sorted((p1, p2) -> (int) (p2.getSalary() - p1.getSalary()))
                .mapToLong(Player::getSalary)
                .average();
//                .limit(5)
//                .forEach(System.out::println);
//        System.out.println(nl);

        // 데이터가 만약에 있다면?
        nl.ifPresentOrElse(d-> System.out.println(d), () -> System.out.println(0));
    }
}
