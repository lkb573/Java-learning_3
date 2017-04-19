import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-19.
 */
public class MajorParkMain {
    public static void main(String[] args){

        List<MajorPark> parkList = null;
        try {
            FileReader fr = new FileReader("Parks.csv");

            BufferedReader br = new BufferedReader(fr);

            String line = "";
            String[] spl;
            parkList = new ArrayList<>();

            br.readLine();

            while ((line = br.readLine()) != null) {
                spl = line.split(",");

                parkList.add(new MajorPark(
                        spl[0], spl[1], spl[2],spl[3], spl[4], spl[5]));

            }

        }catch (FileNotFoundException fne){
            System.out.println("Not found File!");

        }catch (IOException ie){
            System.out.println("Read file, but IO error!");
        }


        Collections.sort(parkList,
                (o1, o2) -> o1.getState().compareTo(o2.getState())
        );



        for (MajorPark e : parkList) {
            System.out.println("Sort result : " + e.toString());
        }
    }
}
