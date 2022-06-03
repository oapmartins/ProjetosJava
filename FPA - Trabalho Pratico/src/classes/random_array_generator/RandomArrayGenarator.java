package classes.random_array_generator;

import java.util.Random;

public class RandomArrayGenarator {

    public int[] generateRandomArray(int arraySize){
        Random random = new Random();

        int[] randomArray = new int[arraySize];

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(arraySize);
            System.out.println(randomArray[i]); 
        }
        return randomArray;
    }
    
}
