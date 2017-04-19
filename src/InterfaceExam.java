
public interface InterfaceExam {
    //all public and static and final
    int A_NUM = 5;

    //all method => public and abstract
    int max(int a, int b);

    default int min(int a, int b){
        return a;
    }

    //JAVA 8 => new method : default
    default boolean isEven(int a){
        return a % 2 ==0;
    }

    //JAVA 8 => can use static method
    public static int countChar(String s){
        return s.length();
    }

}