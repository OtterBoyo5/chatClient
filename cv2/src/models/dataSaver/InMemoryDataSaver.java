package models.dataSaver;

public class InMemoryDataSaver<T> implements DataSaver<T> {
    private T data;

    @Override
    public void save(T data) {
        this.data = data;
    }

    @Override
    public T load() throws NullPointerException {
        return data;
    }

    public void test(){ //neni videt v Main ?dunno

    }

}
