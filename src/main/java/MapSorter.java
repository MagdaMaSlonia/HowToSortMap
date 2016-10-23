import java.util.*;

public class MapSorter {

    public static void main (String [] args) {

        Map<String, Integer> wordStats = new HashMap<>();

        wordStats.put("mama", 4);
        wordStats.put("tata", 3);
        wordStats.put("cokolwiek", 10);
        wordStats.put("gender", 6);

        List<Stats> stats = new ArrayList<>();

        wordStats.forEach((k,v) -> stats.add(new Stats(k, v)));

        stats.sort(new StatsComparator());

        stats.forEach( x -> System.out.println(x));
    }
}


