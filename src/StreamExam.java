import Salary.MajorSalary;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.SortedMap;
import java.util.stream.*;

public class StreamExam {
    public static void main(String[] args){

        try {

            Map<String, MajorSalary> map =
                    Files.lines(Paths.get("Salaries.csv"))
                    .skip(1)
                    .map(x -> {
                        String[] spl = x.split(",");
                        return new MajorSalary(LocalDate.of(
                                Integer.valueOf(spl[0]),1,1),
                                spl[1], spl[2], spl[3],
                                Integer.valueOf(spl[4]));
                    })
                    //.collect(Collectors.toList());
                    .collect(Collectors.toMap(
                            x -> String.valueOf(new Random().nextInt()), x->x));

            map.forEach((k, v) -> System.out.println(k + " -- " + v));




            /*Stream.of("a","b","c","d")
                    .forEach(System.out::println);

            long sum = LongStream.range(1,10000000)
                    .sum();
            System.out.println(sum);


            IntStream.generate(()->1)
                    .forEach(System.out::println);

            Random r = new Random();
            r.ints().forEach(System.out::println);*/


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}