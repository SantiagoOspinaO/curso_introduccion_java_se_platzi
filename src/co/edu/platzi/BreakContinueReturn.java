package co.edu.platzi;

public class BreakContinueReturn {
    public static void main(String[] args) {
        /**
         * si utilizamos break, el programa imprimirá los numeros del 0 al 4
         * si utilizamos continue, el programa imprimirá los numeros del 0 al 9, excepto el 5.
         */
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                //break;
                continue;
            }
            System.out.print(i + " ");
        }
    }

    /**
     * Ejemplo de return en un método
     */
    public static int sum(int[] numbers) {
        int result = 0;
        for (int number : numbers) {
            if (number < 0) {
                return result;
            }
            result += number;
        }
        return result;
    }
}