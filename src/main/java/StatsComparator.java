import java.util.Comparator;

public class StatsComparator implements Comparator<Stats> {

    @Override
    public int compare(Stats o1, Stats o2) {
        if(o1.getCount() <  o2.getCount()) { return -1; }
        else if (o1.getCount() == o2.getCount()) { return 0; }
        else return 1;
    }

}