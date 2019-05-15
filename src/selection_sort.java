public class selection_sort {
    static int[] ordenar(int[] numeros){
        int maiorOrdenadoPos = -1;
        while(maiorOrdenadoPos < numeros.length-1){
            int minPos = maiorOrdenadoPos + 1;
            for(int i = minPos + 1; i < numeros.length; i++){
                if(numeros[i]<numeros[minPos]){
                    minPos = i;
                }
            }
            maiorOrdenadoPos++;
            if(maiorOrdenadoPos!=minPos){
                int temp = numeros[maiorOrdenadoPos];
                numeros[maiorOrdenadoPos] = numeros[minPos];
                numeros[minPos] = temp;
            }
        }
        return numeros;
    }
    public static void main(String[] args) {

    }
}
