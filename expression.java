public class expression {
    public static void main(String[] args) {

        int resultA = (101 + 0) / 3;
        System.out.println("(101 + 0) / 3 = " + resultA);


        double resultB = 3.0 * 10000000.1;
        System.out.println("3.0 * 10000000.1 = " + resultB);


        boolean resultC = true && true;
        System.out.println("true && true = " + resultC);


        boolean resultD = false && true;
        System.out.println("false && true = " + resultD);


        boolean resultE = (false && false) || (true && true);
        System.out.println("(false && false) || (true && true) = " + resultE);


        boolean resultF = (false || false) && (true && true);
        System.out.println("(false || false) && (true && true) = " + resultF);
    }
}
