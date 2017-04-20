import com.opencsv.CSVReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class MajorSalaryService {
    public static List<MajorSalary> salaryList(String filename){

        List<MajorSalary> list = new ArrayList<>();

        try {
            CSVReader reader = new CSVReader(new FileReader(filename));

            reader.readNext();
            String[] spl = null;

            while ((spl = reader.readNext()) != null){
                list.add(new MajorSalary(LocalDate.of(Integer.valueOf(spl[0]),1,1),
                        spl[1], spl[2], spl[3],
                        Integer.valueOf(spl[4])));
            }



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return list;

    }
}
