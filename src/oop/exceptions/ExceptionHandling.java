package oop.exceptions;

public class ExceptionHandling {
    public static void main(String[] args) {
        args = new String[]{"1", "foo", "2", "3"};
//        addArgumentsWithoutTryCatch(args);
//        addArgumentsWithTryCatch(args);
        addArgumentsWithTryCatchGood(args);
    }

    private static void addArgumentsWithoutTryCatch(String[] args) {
        int sum = 0;
        for (String arg : args) {
            sum += Integer.parseInt(arg);
        }
        System.out.println("sum = " + sum);
    }

    private static void addArgumentsWithTryCatch(String[] args) {
        try {
            int sum = 0;
            for (String arg : args) {
                sum += Integer.parseInt(arg);
            }
            System.out.println("sum = " + sum);
        } catch (NumberFormatException ex) {
            System.out.println("Not a number! Invalid argument! \n" + ex.getMessage());
        }
    }

    private static void addArgumentsWithTryCatchGood(String[] args) {
        int sum = 0;
        for (String arg : args) {
            try {
                sum += Integer.parseInt(arg);
            }
            catch (NumberFormatException ex) {
                System.out.println("Not a number! Invalid argument! \n"
                        + ex.getMessage());
            }
//            catch (Exception ex) {
//                System.out.println("Not a number! Invalid argument! \n"
//                        + ex.getMessage());
//            }
        }
        System.out.println("sum = " + sum);
    }


}
