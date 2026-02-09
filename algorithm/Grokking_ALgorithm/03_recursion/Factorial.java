// |   → OR (no short-circuit)
// ||  → OR (short-circuit)
// &   → AND (no short-circuit)
// &&  → AND (short-circuit)

public class Factorial {

    private static int factorial(int i){
        if (i == 0 || i == 1){
            return 1;
        }
        else{
            return i * factorial(i - 1);
        }
    }

    public static void main(String[] args){
        System.out.println(factorial(5));
    }
}
