import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Interface {
    public static void main(String[] args){

        /*List<String> list = Arrays.asList(
                "kim", "leee", "parkk",
                "ryyuuu", "jiiiiiiin", "choioioioioi");*/

        List<String> list = Arrays.asList(
                "100", "150", "200", "250", "300",
                "500", "1000", "5000", "10000");

        /*Comparator c = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        };*/

        /*Comparator c = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {

                int n1 = Integer.parseInt(o1);
                int n2 = Integer.parseInt(o2);

                return n1 - n2;
            }
        };*/

        Collections.shuffle(list);
        System.out.println(list);

        Collections.sort(list,
                (o1, o2) -> Integer.parseInt(o1) - Integer.parseInt(o2));

        System.out.println(list);


    }
}