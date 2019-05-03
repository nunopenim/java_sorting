public class quicksort {
    static int[] arrange(int[] numbers, int left, int right){
        if(left<right){
            int positionPivot = partition(numbers, left, right-1);
            numbers = arrange(numbers, left, positionPivot);
            numbers = arrange(numbers, positionPivot+1, right);
        }
        return numbers;
    }
    static int partition(int[] numbers, int left, int right){
        int pivot = numbers[right];
        int leftIdx = left;
        int rightIdx = right-1; //exclude the pivot
        while(leftIdx<=rightIdx){
            if(numbers[leftIdx]>pivot && numbers[rightIdx]<pivot){
                int temp = numbers[leftIdx];
                numbers[leftIdx] =numbers[rightIdx];
                numbers[rightIdx]=temp;
            }
            if(numbers[leftIdx]<=pivot){
                leftIdx++;
            }
            if(numbers[rightIdx] >= pivot){
                rightIdx--;
            }
        }
        //switch pivot with left number
        numbers[right] = numbers[leftIdx];
        numbers[leftIdx]=pivot;
        return leftIdx;
    }
    public static void main(String[] args) {

    }
}
