import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class StringsCollectionRunnable implements Runnable {
    private final StringsCollection stringsCollection;
    private final int stringsCount;
    private final String threadName;

    public StringsCollectionRunnable(StringsCollection stringsCollection, int stringsCount, String threadName) {
        this.stringsCollection = stringsCollection;
        this.stringsCount = stringsCount;
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for (int j = 0; j < stringsCount; j++) {
            this.stringsCollection.addString(threadName + String.valueOf(j + 1));
        }
    }
}

class StringsCollection{
    List<String> stringsCollection = Collections.synchronizedList(new ArrayList<String>());
    public void addString(String msg){
        stringsCollection.add(msg);
    }
    public List<String> getStringsCollection(){
        return stringsCollection;
    }
}