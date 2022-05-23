public class ResultMinimumSwap2 {

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
        int aux;
        int swap = 0;
        for (int i = 0; i < arr.length; i++) {
            aux = arr[i];
            if (aux != arr[aux - 1]) {
                arr[i] = arr[aux - 1];
                arr[aux - 1] = aux;
                swap++;
                while (arr[i] != i + 1) {
                        aux = arr[i];
                        arr[i] = arr[aux - 1];
                        arr[aux - 1] = aux;
                        swap++;

                }
            }

        }
        return swap;
    }


}
