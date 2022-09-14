package lab5;

import java.util.Collection;
import java.util.Map;
import java.util.stream.Collectors;

public class OnlyStreamApi {

    public static double average(Collection<Integer> collection) {
        return collection.stream().mapToInt(x -> x).average().getAsDouble();
    }

    public static Collection<String> upper(Collection<String> collection) {
        return collection.stream()
                .map(String::toUpperCase)
                .map(x -> "_new_" + x)
                .collect(Collectors.toList());
    }

    public static Collection<Integer> sqr(Collection<Integer> collection) {
        return collection.stream()
                .filter(x -> collection.stream().filter(y -> y.equals(x)).count() == 1)
                .map(x -> x * x)
                .collect(Collectors.toList());
    }

    public static Collection<String> sort(Collection<String> collection, String word) {
        return collection.stream()
                .filter(x -> x.startsWith(word))
                .sorted()
                .collect(Collectors.toList());
    }

    public static String findLast(Collection<String> collection) {
        return collection.stream()
                .reduce((x, y) -> y)
                .orElseThrow(RuntimeException::new);
    }

    public static Integer sum(Collection<Integer> collection) {
        return collection.stream()
                .filter(x -> x % 2 == 0)
                .reduce(Integer::sum)
                .orElse(0);
    }

    public static Map<String, String> toMap(Collection<String> collection) {
        return collection.stream()
                .collect(Collectors.toMap(x -> x.substring(0, 1), x -> x.substring(1)));
    }

}
