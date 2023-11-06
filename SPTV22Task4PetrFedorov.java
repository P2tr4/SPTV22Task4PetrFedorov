
package sptv22task4petrfedorov;

import java.util.Arrays;
import java.util.Random;
/**
 *
 * @author admin
 */
public class SPTV22Task4PetrFedorov {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numbers = new int[100];

        Random random = new Random();

        // Заполните массив нечетными случайными числами от 0 до 99.
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(50) * 2 + 1;
        }

        // Выведите массив по десять чисел в одной строке.
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }

        // Отсортируйте массив.
        Arrays.sort(numbers);
        System.out.print("Отсартированый массив: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }

        // Вычислите среднее арифметическое.
        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double average = sum / numbers.length;

        System.out.println("Среднее арифметическое: " + average);
    }
    
}
