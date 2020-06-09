public class TeenNumberChecker {

    // Part 1
    /*
     * We'll say a number is "teen" if it is in the range 13-19 (inclusive)
     *
     * Write a method name hasTeen with 2 parameters of type int
     *
     * The method should return boolean and it needs to return true if one of the parameters is in range
     * 13(inclusive) - 19(inclusive)
     *
     * Otherwise, false
     */

    public static boolean hasTeen(int age1, int age2, int age3) {

        if((age1 >=13 && age1 <= 19) || (age2 >=13 && age2 <= 19) || (age3 >=13 && age3 <= 19)) {
            return true;
        }

        return false;
    }

}
