import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

       List<Integer> numbers = Arrays.asList(1,2,3,4,5,4);
       List<String> strings = Arrays.asList("apple","ball","cat","dog","bob");

       //map
        List square = numbers.stream().map(x->x*x).collect(Collectors.toList());
        //filter
        List result = strings.stream().filter(x->x.contains("a")).collect(Collectors.toList());
        //sorted
        List show = strings.stream().sorted().collect(Collectors.toList());
       //return a set
        Set<Integer> squareSet = numbers.stream().map(x->x*x).collect(Collectors.toSet());
        //for each
        //numbers.stream().forEach(x->System.out.println(x));

        int even = numbers.stream().filter(x->x%2==0).reduce(0,(ans,i)->ans+i);
        System.out.println(even);

    }
}
