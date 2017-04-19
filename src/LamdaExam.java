
public class LamdaExam {
    public static void main(String[] args){

        /*(a, b) -> a > b ? a : b;

        a -> a % 2 == 0;

        s -> s.length();*/

        int cc = InterfaceExam.countChar("abcdefghijklmnopqrstuvwxyz");
        System.out.println(cc);
    }

    int max(int a, int b){
        return a > b ? a : b;
    }

    boolean isEven(int a){
        return a % 2 == 0;
    }

    int countChar(String s){
        return s.length();
    }

}