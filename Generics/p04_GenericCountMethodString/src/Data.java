import java.util.ArrayList;
import java.util.List;

public class Data<T extends Comparable<T>> {
    private List<T> list;

    public Data() {
        this.list = new ArrayList<>();
    }

    public void Add(T value) {
        this.list.add(value);
    }

    public List<T> Get() {
        return this.list;
    }

    public int Count() {
        return this.list.size();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (T t : list) {
            stringBuilder.append(String.format("%s: %s", t.getClass().getName(), t.toString()));
            stringBuilder.append(System.lineSeparator());
        }
        return stringBuilder.toString().trim();
    }
}