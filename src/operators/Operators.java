package operators;

public class Operators {
    public static void main(String[] args) {
        System.out.println("Now, let's try some operators");
        System.out.println("Logical operators");

        boolean firstValue;
        boolean secondValue;
        boolean evaluationResult;
        System.out.println("&& operator");
        firstValue = true;
        secondValue = true;
        evaluationResult = firstValue && secondValue;
        System.out.println("true && true: " + evaluationResult);

        firstValue = true;
        secondValue = false;
        evaluationResult = firstValue && secondValue;
        System.out.println("true && false: " + evaluationResult);

        firstValue = false;
        secondValue = true;
        evaluationResult = firstValue && secondValue;
        System.out.println("false && true: " + evaluationResult);

        firstValue = false;
        secondValue = false;
        evaluationResult = firstValue && secondValue;
        System.out.println("false && false: " + evaluationResult);

        System.out.println();
        System.out.println("Lets test negation operator");
        firstValue = false;
        secondValue = !firstValue;
        System.out.println("!false is: " +secondValue);

        firstValue = true;
        secondValue = !firstValue;
        System.out.println("!true is: " +secondValue);

        boolean isPolite = false;

        if (!isPolite) {
            System.out.println("You're not polite, or just naughty");
        }

        // negation of isPolite equals naughty
        boolean naughty = true;
        if (naughty) {
            System.out.println("You're not polite, or just naughty");

        }

        System.out.println();
        System.out.println("Lets see now || operator - or operator");
        boolean hasGun = true;
        boolean hasGranade = true;
        boolean isTerrorist = hasGun || hasGranade;
        System.out.println("true || true is: " +isTerrorist);

        hasGun = true;
        hasGranade = false;
        isTerrorist = hasGun || hasGranade;
        System.out.println("true || false is: " +isTerrorist);

        hasGun = false;
        hasGranade = true;
        isTerrorist = hasGun || hasGranade;
        System.out.println("false || true is: " +isTerrorist);

        hasGun = false;
        hasGranade = false;
        isTerrorist = hasGun || hasGranade;
        System.out.println("false || false is: " + isTerrorist);
    }
}
