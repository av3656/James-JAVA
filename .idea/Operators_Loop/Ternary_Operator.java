
public class Ternary_Operator {
    public static void main(String[] args) {
        int a, b, c;
        a = 999;
        b = 9999;
        c = 99999;
        // This is an example of ternary operator that is used as if then statement in
        // the java language.
        // Syntax is (condition)?if ture statement : then statement;
        String res = (b > a) ? "a is greater number." : "b is greater number.";
        System.out.println(res);
    }
}
