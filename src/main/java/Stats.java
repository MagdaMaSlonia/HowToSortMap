
public class Stats {

    private String word;
    private int count;

    public int getCount() {
        return count;
    }


    @Override
    public String toString() {
        return "Stats{" +
                "word='" + word + '\'' +
                ", count=" + count +
                '}';
    }

    Stats(String word, int count) {
        this.word = word;
        this.count = count;
    }

}


