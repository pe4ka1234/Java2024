public class practica2_1 {
    public static void main(String[] args) {

        int number = 1;
        number += 9;
        number -= 5;
        number *= 2;
        number /= 5;
        number %= 2;

        String baseString = "Happy";
        baseString += " Holidays!";

        int firstValue = 5, secondValue = 9;
        int largerValue = (firstValue > secondValue) ? firstValue : secondValue;

        boolean truthy = true, falsy = false;
        boolean conjunction = truthy && falsy;
        boolean disjunction = truthy || falsy;

        boolean hasContent = baseString != null && !baseString.isEmpty();

        boolean isSame = firstValue == secondValue;
        boolean isDifferent = firstValue != secondValue;
        boolean isBigger = firstValue > secondValue;
        boolean isSmallerOrEqual = firstValue <= secondValue;

        int alpha = 1, beta = 3;
        int bitwiseOr = alpha | beta;
        int bitwiseXor = alpha ^ beta;
        int bitwiseAnd = alpha & beta;

        int baseShift = 8;
        int shiftedRight = baseShift >> 2;
        int zeroFillShiftedRight = baseShift >>> 2;
        int shiftedLeft = baseShift << 2;

        int total = alpha + beta;
        int diff = alpha - beta;
        int prod = alpha * beta;
        int div = alpha / beta;
        int mod = alpha % beta;

        baseString = "Happy";
        String message = baseString + " Holidays";

        int counter = 5;
        int incrementFirst = ++counter;  // увеличение, потом использование
        int incrementAfter = counter++; // использование, потом увеличение

        int decrementFirst = --counter;  // уменьшение, потом использование
        int decrementAfter = counter--; // использование, потом уменьшение

        int bitwiseNotAlpha = ~alpha;
        boolean state = false;
        boolean inverseState = !state;

        int orderOfOps = 2 * 3 + 1;
        int forcedOrder = 2 * ( 3 + 1 );
    }
}

