import com.opencsv.CSVReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


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

            System.out.println("--------------State Sort A to Z--------------");
            Collections.sort(list,
                    (a,b) -> a.getState().compareTo(b.getState())
            );

            for (MajorPark e : list) {
                System.out.println("State Sort result : " + e.toString());
            }


            System.out.println("--------------ParkName Sort word length--------------");
            Collections.sort(list,
                    (a,b) -> a.getParkName().length() - b.getParkName().length()
            );

            for (MajorPark e : list) {
                System.out.println("ParkName Sort result : " + e.toString());
            }


            System.out.println("--------------Country Sort Not US--------------");
            list.removeIf(p -> p.getCountry().equals("US"));

            for (MajorPark e : list) {
                System.out.println("Country Sort result : " + e.toString());
            }

            System.out.println("--------------For loop lambda--------------");
            list.forEach(a -> System.out.println("for loop lambda function > " + a));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
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