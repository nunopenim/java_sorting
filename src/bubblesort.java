public class bubblesort {
    static int[] ordenar(int[] numeros){
        boolean tudoOrdenado = false;
        int ultimoOrdenado = numeros.length;
        while(!tudoOrdenado){
            tudoOrdenado=true;
            for(int i=0; i<ultimoOrdenado-1; i++){
                if(numeros[i]>numeros[i+1]){
                    tudoOrdenado = false;
                    int temp = numeros[i];
                    numeros[i]=numeros[i+1];
                    numeros[i+1]=temp;
                }
            }
            ultimoOrdenado--;
        }
        return numeros;
    }
    public static void main(String[] args) {
        int[] array1 = new int[] {1,5,2,4,3};
        int[] array2 = new int[5];
        array2 = ordenar(array1);
        System.out.println(array2[0]);
        System.out.println(array2[1]);
        System.out.println(array2[2]);
        System.out.println(array2[3]);
        System.out.println(array2[4]);
    }
}
