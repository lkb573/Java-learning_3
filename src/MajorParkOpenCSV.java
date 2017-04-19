import com.opencsv.CSVReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class MajorParkOpenCSV {
    public static void main(String[] args){

        try {
            CSVReader reader = new CSVReader(new FileReader("Parks.csv"));

            List<MajorPark> list = new ArrayList<>();
            String[] split = null;

            reader.readNext();
            while ((split = reader.readNext()) != null){
                list.add(new MajorPark(
                        split[0], split[1], split[2], split[3], split[4], split[5]));
            }


            Collections.sort(list,
                    (a,b) -> a.getState().compareTo(b.getState())
            );


            for (MajorPark e : list) {
                System.out.println("Sort result : " + e.toString());
            }

            /*Predicate<MajorPark> p = new Predicate<MajorPark>() {
                @Override
                public boolean test(MajorPark majorPark) {
                    return majorPark.getParkAlias() == null ||
                            majorPark.getParkAlias().equals("");
                }
            };*/

            /*list.removeIf(p -> p.getParkAlias() == null || p.getParkAlias().equals(""));
            for (MajorPark e : list) {
                System.out.println("Remove result : " + e.toString());
            }*/



            list.forEach(a -> System.out.println("lambda function > " + a));



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
