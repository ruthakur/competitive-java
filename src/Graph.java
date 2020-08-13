import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Graph<T> {
    private final Map<T, List<T>> neighbours;

    public Graph() {
        this.neighbours = new LinkedHashMap<>();
    }

    public void add(T t) {
        if (!neighbours.containsKey(t)) {
            neighbours.put(t, new ArrayList<T>());
        }
    }

    public void addEdge(T u, T v) {
        neighbours.get(u).add(v);
        neighbours.get(v).add(u);
    }

    public Map<T, List<T>> getNeighbours() {
        return this.neighbours;
    }
}
