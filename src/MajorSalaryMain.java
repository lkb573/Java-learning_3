import java.time.LocalDate;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;

/**
 * Created by danawacomputer on 2017-04-20.
 */
public class MajorSalaryMain {
    public static void main(String[] args){

        List<MajorSalary> list = MajorSalaryService.salaryList("Salaries.csv");

        //19xx
        OptionalDouble ninethAver = list.stream()
                .filter(x -> x.getYearID().isAfter(LocalDate.of(1985,1,1))
                        && x.getYearID().isBefore(LocalDate.of(2000,1,1)))
                .mapToInt(x ->
                    x.getSalary()
                ).average();
        System.out.printf("1900 years Salary : %.2f\n", ninethAver.getAsDouble());

        //all aver
        OptionalDouble allAver = list.stream()
                .mapToInt(x -> x.getSalary())
                .average();
        System.out.printf("All player Salary : %.2f\n", allAver.getAsDouble());

        //Max & Min aver
        OptionalInt top = list.stream()
                .mapToInt(x -> x.getSalary())
                .max();
        OptionalInt low = list.stream()
                .mapToInt(x -> x.getSalary())
                .min();
        System.out.println("Top Salary : " + top.getAsInt() + '\t' + "Low Salary : " + low.getAsInt());


        //NL Max
        OptionalInt topSalaryofNL = list.stream()
                .filter(x -> x.getLeague().equals("NL"))
                .mapToInt(x -> x.getSalary())
                .max();
        System.out.println("Top Salary of NL : " + topSalaryofNL.getAsInt());

        //NYY aver
        OptionalDouble averOfNYY = list.stream()
                .filter(x -> x.getTeam().equals("NYY"))
                .mapToInt(x -> x.getSalary())
                .average();
        System.out.printf("Salary aver of NYY Team : %.2f\n", averOfNYY.getAsDouble());

        //Top 10
        OptionalDouble averOfTopten = list.stream()
                .skip(10)
                .sorted((x,y) -> x.getSalary() - y.getSalary())
                .mapToInt(x -> x.getSalary())
                .average();
        System.out.printf("Top 10 Salary aver : %.2f\n", averOfTopten.getAsDouble());




    }
}
