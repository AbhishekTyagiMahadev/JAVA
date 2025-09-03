public class Operators {
    public static void main(String[] args) {
        int a = 10, b = 5;

        // 1. Arithmetic Operators
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // 2. Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));

        // 3. Logical Operators
        System.out.println("\nLogical Operators:");
        System.out.println("(a > 5 && b < 10): " + (a > 5 && b < 10));
        System.out.println("(a < 5 || b < 10): " + (a < 5 || b < 10));
        System.out.println("!(a == b): " + !(a == b));

        // 4. Bitwise Operators
        System.out.println("\nBitwise Operators:");
        System.out.println("a & b = " + (a & b));
        System.out.println("a | b = " + (a | b));
        System.out.println("a ^ b = " + (a ^ b));
        System.out.println("~a = " + (~a));

        // 5. Assignment Operators
        System.out.println("\nAssignment Operators:");
        int c = 20;
        System.out.println("Initial c = " + c);
        c += 5;
        System.out.println("c += 5: " + c);
        c *= 2;
        System.out.println("c *= 2: " + c);

        // 6. Unary Operators
        System.out.println("\nUnary Operators:");
        int x = 10;
        System.out.println("x = " + x);
        System.out.println("++x = " + (++x));  // Pre-increment
        System.out.println("x++ = " + (x++));  // Post-increment
        System.out.println("x = " + x);
        System.out.println("--x = " + (--x));  // Pre-decrement
        System.out.println("x-- = " + (x--));  // Post-decrement
        System.out.println("x = " + x);

        // 7. Ternary Operator
        System.out.println("\nTernary Operator:");
        int max = (a > b) ? a : b;
        System.out.println("Max of " + a + " and " + b +  " is: " + max);
    }
}
