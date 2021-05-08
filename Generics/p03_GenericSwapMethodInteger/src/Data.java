import java.util.ArrayList;
import java.util.List;

public class Data<T> {
    private List<T> list;

    public Data() {
        this.list = new ArrayList<>();
    }

    public void Add(T value){
        this.list.add(value);
    }

    public void Swap(int index1, int index2){
        T first = this.list.get(index1);
        T second = this.list.get(index2);

        this.list.set(index1,second);
        this.list.set(index2,first);
    }

    public List<T> Get(){
        return this.list;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (T t : list) {
            stringBuilder.append(String.format("%s: %s",t.getClass().getName(),t.toString()));
            stringBuilder.append(System.lineSeparator());
        }
        return stringBuilder.toString();
    }
}