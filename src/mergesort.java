import java.util.Arrays;

public class mergesort{
    static int[] sort(int[] numbers){
        if(numbers.length <= 1){
            return numbers;
        }
        int left=0, right = numbers.length, middle = numbers.length/2;
        //splits numbers in sub arrays
        int[] numbersLeft = Arrays.copyOfRange(numbers, left, middle);
        int[] numbersRight = Arrays.copyOfRange(numbers, middle, right);
        numbersLeft=sort(numbersLeft);
        numbersRight=sort(numbersRight);
        return merge(numbersLeft, numbersRight);
    }
    static int[] merge(int[] arrayA, int[] arrayB){
        int[] result = new int[arrayA.length + arrayB.length];
        int positionA = 0, positionB = 0, positionResult=0;
        while(positionA<arrayA.length && positionB < arrayB.length){
            if(arrayA[positionA]<arrayB[positionB]){
                result[positionResult]=arrayA[positionA];
                positionA++;
            }
            else {
                result[positionResult] = arrayB[positionB];
                positionB++;
            }
            positionResult++;
        }
        while(positionA<arrayA.length){
            result[positionResult]=arrayA[positionA];
            positionA++;
            positionResult++;
        }
        while(positionB<arrayB.length){
            result[positionResult]=arrayB[positionB];
            positionB++;
            positionResult++;
        }
        return result;
    }
    public static void main(String[] args) {

    }
}
