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

    public T Remove(int index) {
        return this.list.remove(index);
    }

    public Boolean Contains(T value) {
        return this.list.contains(value);
    }

    public void Swap(int index1, int index2) {
        T value1 = this.list.get(index1);
        T value2 = this.list.get(index2);
        this.list.set(index1, value2);
        this.list.set(index2, value1);
    }

    public long countGreaterThan(final T value) {
        return this.list.stream().filter(v -> v.compareTo(value) > 0).count();
    }

    public T GetMax() {
        T max = this.list.get(0);
        for (T t : this.list) {
            if (t.compareTo(max) > 0) {
                max = t;
            }
        }
        return max;
    }

    public T GetMin() {
        T min = this.list.get(0);
        for (T t : this.list) {
            if (t.compareTo(min) < 0) {
                min = t;
            }
        }
        return min;
    }

    public void Print(){
        for (T t : this.list) {
            System.out.println(t);
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (T t : list) {
            stringBuilder.append(String.format("%s: %s", t.getClass().getName(), t.toString()));
            stringBuilder.append(System.lineSeparator());
        }
        return stringBuilder.toString();
    }
}