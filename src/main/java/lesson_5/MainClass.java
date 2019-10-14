package lesson_5;

public class MainClass {
    public static int exponentiation(int base, int degree){
        if (degree == 0)
            return  1;
        if (degree == 1)
            return base;
        return base * exponentiation(base, degree - 1);
    }

    public static void main(String[] args) {
        System.out.println(exponentiation(2, 0));
    }
}
