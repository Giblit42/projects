public class calc{
    public static void main(String[] argv){
        int num1 = 5, num2 = 3;
        double numd1 = 5.0, numd2 = 3.0;

        System.out.println(addition(num1, num2));
        System.out.println(addition(numd1, numd2));
        System.out.println(subtraction(num1, num2));
        System.out.println(subtraction(numd1, numd2));

    }

    public static int addition(int num1, int num2){

        return num1 + num2;
    }

    public static double addition(double numd1, double numd2){
        return numd1 + numd2;
    }

    public static int subtraction(int num1, int num2){
        return num1 - num2;
    }

    public static double subtraction(double numd1, double numd2){
        return numd1 - numd2;
    }
}