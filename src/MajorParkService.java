import com.opencsv.CSVReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MajorParkService {
    public static List<MajorPark> listToCSV(String filename){

        List<MajorPark> list = new ArrayList<>();

        try {
            CSVReader reader = new CSVReader(new FileReader(filename));

            reader.readNext();
            String[] spl = null;

            while ((spl = reader.readNext()) != null){
                list.add(new MajorPark(spl[0], spl[1], spl[2], spl[3], spl[4], spl[5]));
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return list;

    }

}