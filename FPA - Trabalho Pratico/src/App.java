import classes.random_array_generator.RandomArrayGenarator;
import classes.sort_algorithm.*;

public class App {
    public static void main(String[] args) throws Exception {

        RandomArrayGenarator classArrayGenerator = new RandomArrayGenarator();       
        int[] randomArray = classArrayGenerator.generateRandomArray(10);

        System.out.println("Array desordenada");
        for(int i : randomArray){
            System.out.println(randomArray[i]);
        }

        // Clonar os arrays pra enviar cada um separado pros métodos de ordenação array.clone()

        // Heapsort
        // Heapsort heap = new Heapsort();
        // heap.sort(randomArray);

        // InsertionSort
        InsertionSort insertion = new InsertionSort();
        insertion.sort(randomArray);
        
        // int[] teste2 = teste.clone();
        System.out.println("teste");

        System.out.println("\nArray ordenada");
        for(int i : randomArray){
            System.out.println(randomArray[i]);
        }
    }
}

// Criar gerador de array de números aleatorios;

// Imprimir chave não ordenada se o usuário quiser;

// Imprimir as chaves ordenadas, se o usuário desejar; 

// Metodo para ordenar Seleção, Inserção, Quicksort, Heapsort;

// Criar um jeito de contar o tempo de processamento de cada algorítmo

// Contador dentro dos algorítmos, para pegar o número de comparações e de execução