package web.service;

public class MathQuestionService {

    /**
     * Calculate Q1 result.
     * @param number1
     * @param number2
     * @return
     */
    public static Double q1Addition(String number1, String number2) {
        if (number1 == null || number1.isEmpty() || number2 == null || number2.isEmpty()) {
            return null;
        }
        double result = Double.valueOf(number1) + Double.valueOf(number2);
        return result;
    }
    
    /**
     * Calculate Q2 result.
     * @param number1
     * @param number2
     * @return
     */
    public static Double q2Subtraction(String number1, String number2) {
        if (number1 == null || number1.isEmpty() || number2 == null || number2.isEmpty()) {
            return null;
        }
        double result = Double.valueOf(number1) - Double.valueOf(number2);
        return result;
    }

    /**
     * Calculate Q3 result (Multiplication).
     * @param number1
     * @param number2
     * @return
     */
    public static Double q3Multiplication(String number1, String number2) {
        if (number1 == null || number1.isEmpty() || number2 == null || number2.isEmpty()) {
            return null;
        }
        double result = Double.valueOf(number1) * Double.valueOf(number2);
        return result;
    }
}
