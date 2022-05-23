import java.util.*;
import java.util.stream.Collectors;

class ResultSaleMatch {

    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */
// opcion 1
    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        Map<Integer, Integer> order_calcetin = new HashMap<>();
        for (Integer calcetin : ar) {
            Integer count = order_calcetin.get(calcetin);
            if (count == null) {
                order_calcetin.put(calcetin, 1);
            } else {
                order_calcetin.put(calcetin, count + 1);
            }
        }
        Integer pares = 0;
        for (Map.Entry<Integer, Integer> entry : order_calcetin.entrySet()) {
            pares = pares + entry.getValue() / 2;
            System.out.println(pares);
        }
        return pares;
    }
    // opcion 2
    public static int sockMerchant2(int n, List<Integer> ar) {
        // Write your code here
        Set<Integer> colors = new HashSet<>(ar);
        Stack<String> pila = new Stack<String>();
        Integer count = 0;
        for (Integer color : colors) {
            List<Integer> aux = ar.stream().filter(e -> e == color).collect(Collectors.toList());
            count = count + aux.size() / 2;
        }
        return count;
    }
    // opcion 3
    public static int sockMerchant3(int n, List<Integer> ar) {
        HashSet<Integer> set = new HashSet<Integer>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int element = ar.get(i);
            if (set.contains(element)) {
                set.remove(element);
                count++;
            } else {
                set.add(element);
            }
        }
        return count;
    }
}

