import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TwilioCodingTest {
    // opcion 1
    public static List<String> test(List<List<String>> dependencies) {
        // Write your code here
        List<String> installOrder = new ArrayList<>();
        Set<String> noDependencies = new HashSet<>();
        List<String> dependencie = new ArrayList<>();
        dependencies.stream().forEach(e -> dependencie.add(e.get(0)));
        for (List<String> d : dependencies) {
            if (installOrder.containsAll(d)) {
                int index0 = installOrder.indexOf(d.get(0));
                int index1 = installOrder.indexOf(d.get(1));
                if (index0 < index1) {
                    installOrder.remove(d.get(1));
                    installOrder.add(0, d.get(1));
                }
            } else if (installOrder.contains(d.get(0))&&dependencie.contains(d.get(1))) {
                installOrder.add(0, d.get(1));
            } else if (installOrder.contains(d.get(1))) {
                installOrder.add(installOrder.indexOf(d.get(1)) + 1, d.get(0));
            } else if(!dependencie.contains(d.get(1))) {
                noDependencies.add(d.get(1));
                installOrder.remove(d.get(0));
                installOrder.add(0,d.get(0));
            }else{
                installOrder.add(d.get(1));
                installOrder.add(d.get(0));
            }
        }
        installOrder.addAll(0,noDependencies);
        return  installOrder;
    }


}
