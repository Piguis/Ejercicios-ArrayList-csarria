import java.util.ArrayList;

public class TercerEjercicio {


    public static void main(String[] args) {

        ArrayList<Integer> numerosEnteros = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            numerosEnteros.add(i);
        }

        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for (int number : numerosEnteros) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }
    }
}