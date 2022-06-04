import classes.random_array_generator.RandomArrayGenerator;
import classes.sort_algorithm.*;

public class App {
    public static void main(String[] args) throws Exception{

        RandomArrayGenerator classArrayGenerator = new RandomArrayGenerator();
        int[] randomArray = classArrayGenerator.generateRandomArray(10);

        System.out.println("Array desordenada");
        for(int i : randomArray){
            System.out.println(i);
        }

        // Clonar os arrays pra enviar cada um separado pros métodos de ordenação array.clone()

        // Heapsort
        // Heapsort heap = new Heapsort();
        // long start = System.currentTimeMillis();
        // heap.sort(randomArray);
        // long stop = System.currentTimeMillis();

        // InsertionSort
//        InsertionSort insertion = new InsertionSort();
//        long start = System.currentTimeMillis();
//        insertion.sort(randomArray);
//        long stop = System.currentTimeMillis();

        // Quicksort
//        Quicksort quick = new Quicksort();
//        long start = System.currentTimeMillis();
//        quick.sort(randomArray, 0, randomArray.length-1);
//        long stop = System.currentTimeMillis();

        // Selectionsort
//        SelectionSort selection = new SelectionSort();
//        long start = System.currentTimeMillis();
//        selection.sort(randomArray);
//        long stop = System.currentTimeMillis();

        // int[] teste2 = teste.clone();

        System.out.println("\nArray ordenada");
        for(int i : randomArray){
            System.out.println(i);
        }
    }
}

// Criar gerador de array de números aleatorios;

// Imprimir chave não ordenada se o usuário quiser;

// Imprimir as chaves ordenadas, se o usuário desejar; 

// Metodo para ordenar Seleção, Inserção, Quicksort, Heapsort;

// Criar um jeito de contar o tempo de processamento de cada algorítmo

// Contador dentro dos algorítmos, para pegar o número de comparações e de execução