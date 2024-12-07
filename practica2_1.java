public class practica2_1 {
    public static void main(String[] args) {

        int a = 1;
        a += 9;
        a -= 5;
        a *= 2;
        a /= 5;
        a %= 2;

        String s = "Merry";
        s += " Christmas!";

        int x = 5, y = 9;
        int max = (x > y) ? x : y;

        boolean A = true, B = false;
        boolean C = A && B;
        boolean D = A || B;

        boolean isNotEmpty = s != null && !s.isEmpty();

        boolean isEqual = x == y;
        boolean isNotEqual = x != y;
        boolean isGreater = x > y;
        boolean isLessOrEqual = x <= y;

        int b = 1, c = 3;
        int orResult = b | c;
        int xorResult = b ^ c;
        int andResult = b & c;

        int shift = 8;
        int rightShift = shift >> 2;
        int zeroFillShift = shift >>> 2;
        int leftShift = shift << 2;

        int sum = b + c;
        int difference = b - c;
        int product = b * c;
        int quotient = b / c;
        int remainder = b % c;

        s = "Merry";
        String greeting = s + " Christmas";

        int count = 5;
        int preIncrement = ++count;  // увеличение, потом использование
        int postIncrement = count++; // использование, потом увеличение

        int preDecrement = --count;  // уменьшение, потом использование
        int postDecrement = count--; // использование, потом уменьшение

        int notB = ~b;
        boolean flag = false;
        boolean notFlag = !flag;

        int priority = 2 * 3 + 1;
        int explicitPriority = 2 * ( 3 + 1 );
    }
}
