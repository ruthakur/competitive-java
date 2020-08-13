public class DiGraph<T> extends Graph<T> {

    @Override
    public void addEdge(T u, T v) {
        getNeighbours().get(u).add(v);
    }
}
