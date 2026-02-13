import java.lang.StackWalker.Option;
import java.security.KeyStore.Entry;
import java.util.*;
public class JavaAdvanced {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        System.out.println(arr.get(0));

        Map<String, Integer> marks = new HashMap<>();
        marks.put("Rahl",100);
        marks.put("simmy",200);

        for(Map.Entry<String, Integer> entry: marks.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("--------------");
        }

        //HOw to use Set<>?
        Set<Integer> i = new HashSet<>();
        
        i.add(1);
        i.add(2);
        i.add(3);

        System.out.println("Set is " + i);

        Integer iSearch = 5;

        System.out.println("Set contains "+ iSearch + "? "+ i.contains(iSearch));

        // So if I say i stored a non present Entry from the List in the variable..
        iSearch = marks.get("Non-presentName");
        System.out.println(iSearch);
        // The get function will return null
        // But if i do any logical operation on it... i'll get exception
        //System.out.println(iSearch<10);

        // TO Resolve this we have Optional
        Optional<Integer> marksOfClass = Optional.of(marks.get("NonPresentName"));

        if(marksOfClass.isPresent()){
            ///
        }else{
            System.out.println("The Entry not present in Hashmap");
        }
    }
}
