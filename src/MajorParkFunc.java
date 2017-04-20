import java.util.Collections;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class MajorParkFunc {
    public static void main(String[] args){

        List<MajorPark> list = MajorParkService.listToCSV("Parks.csv");

        /*Collections.sort(list, (x, y) ->
                x.getParkName().length() - y.getParkName().length());


        list.removeIf(x -> x.getCountry().equals("US"));
        list.forEach(x -> System.out.println(x));
        list.forEach(System.out::println);*/


        //stream function
        /*list.stream()
                .sorted((x, y) -> x.getParkName().length() - y.getParkName().length())
                .filter(x -> x.getCountry().equals("US"))
                .forEach(x -> System.out.println(x));

        long b = list.stream()
                .sorted((x, y) -> x.getParkKey().compareTo(y.getParkKey()))
                .filter(x -> x.getCity().startsWith("B"))
                .count();

        System.out.println(b);*/

        //mapping
        /*list.stream()
                .map(x -> {
                    String alias = x.getParkAlias();
                    if (alias == null || alias.equals("")){
                        alias = "Nothing";
                    }
                    x.setParkAlias(alias);
                    return x;
                })
                .forEach(x -> System.out.println(x));*/


        /*list.stream()
                .map(x -> {
                    x.setCity(x.getCity().toLowerCase());
                    return x;
                })
                .forEach(x -> System.out.println(x));*/


        /*list.stream()
                .map(x ->{
                    x.setCity(x.getCity().substring(0,3));
                    x.setState(x.getState().toLowerCase());
                    return x;
                })
                .forEach(x -> System.out.println(x));*/



        //us mx jp
        /*list.stream()
                .skip(10)
                .limit(10)
                .map(x ->{
                    if(x.getCountry().equals("US"))
                        x.setCountry("USA");
                    else if (x.getCountry().equals("MX"))
                        x.setCountry("Mexico");
                    else if (x.getCountry().equals("JP"))
                        x.setCountry("Japan");
                    else if (x.getCountry().equals("CA"))
                        x.setCountry("CANADA");
                    else if (x.getCountry().equals("PR"))
                        x.setCountry("PR....");
                    else if (x.getCountry().equals("AU"))
                        x.setCountry("AUS....");
                    else
                        x.setCountry("Others");
                    return x;
                })
                .forEach(x -> System.out.println(x));*/


            /*OptionalDouble aver = list.stream()
                .mapToInt(x -> x.getParkName().length())
                    .average();

            if (aver.isPresent()){
                System.out.println(aver.getAsDouble());
            }
            else {
                System.out.println("No data");
            }*/


        List<MajorPark> reslist = list.stream()
                .map(x ->{
                    x.setCity(x.getCity().substring(0,3));
                    x.setState(x.getState().toLowerCase());
                    return x;
                })
                .peek(System.out::println)
                .collect(Collectors.toList());

        reslist.forEach(System.out::println);




    }
}