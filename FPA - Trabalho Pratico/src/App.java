import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import classes.random_array_generator.RandomArrayGenerator;
import classes.sort_algorithm.*;

public class App {

        static Scanner read = new Scanner(System.in);

        public static void main(String[] args) throws Exception {

                // Pegar informações do sistema.
                System.out.println("Digite o tamanho para ser gerado o array aleatório: ");
                int sizeArray = read.nextInt();

                // Gera array com numeros aleatorios.
                RandomArrayGenerator classArrayGenerator = new RandomArrayGenerator();
                int[] randomArray = classArrayGenerator.generateRandomArray(sizeArray);

                // Exibe o menu de opções.
                showMenuOption(randomArray);
                read.close();
        }

        public static void showMenuOption(int[] randomArray) {
                System.out.println(
                                "\nOpções: \n 1 - Imprimir array desordenado \n 2 - Utilizar algorítmos para ordenar");
                int choseOption = read.nextInt();

                switch (choseOption) {
                        case 1:
                                System.out.println("\nArray desordenada");
                                for (int i : randomArray) {
                                        System.out.println(i);
                                }
                                showMenuOption(randomArray);
                                break;
                        case 2:
                                sortAlgorithm(randomArray);
                                break;

                        default:
                                System.out.println("Opção não encontrada!");
                                break;
                }
        }

        public static void sortAlgorithm(int[] randomArray) {

                // Selectionsort
                SelectionSort selection = new SelectionSort();
                long startTimeSelectionSort = System.currentTimeMillis();
                selection.sort(randomArray.clone());
                long stopTimeSelectionSort = System.currentTimeMillis();

                long secondsSelectionSort = TimeUnit.MILLISECONDS
                                .toSeconds(stopTimeSelectionSort - startTimeSelectionSort);
                System.out.println("\nTempo gasto SELECTIONSORT: " + secondsSelectionSort + " segundo(s)");

                // InsertionSort
                InsertionSort insertion = new InsertionSort();
                long startTimeInsertionSort = System.currentTimeMillis();
                insertion.sort(randomArray.clone());
                long stopTimeInsertionSort = System.currentTimeMillis();

                long secondsInsertion = TimeUnit.MILLISECONDS.toSeconds(stopTimeInsertionSort - startTimeInsertionSort);
                System.out.println("Tempo gasto INSERTIONSORT: " + secondsInsertion + " segundo(s)");

                // Quicksort
                Quicksort quick = new Quicksort();
                long startTimeQuicksort = System.currentTimeMillis();
                quick.sort(randomArray.clone(), 0, randomArray.length - 1);
                long stopTimeQuicksort = System.currentTimeMillis();

                long secondsQuickSort = TimeUnit.MILLISECONDS.toSeconds(stopTimeQuicksort - startTimeQuicksort);
                System.out.println("Tempo gasto QUICKSORT: " + secondsQuickSort + " segundo(s)");

                // Heapsort
                Heapsort heap = new Heapsort();
                long startTimeHeapsort = System.currentTimeMillis();
                heap.sort(randomArray.clone());
                long stopTimeHeapsort = System.currentTimeMillis();

                long secondsHeapsort = TimeUnit.MILLISECONDS.toSeconds(stopTimeHeapsort - startTimeHeapsort);
                System.out.println("Tempo gasto HEAPSORT: " + secondsHeapsort + " segundo(s)\n");
        }
}