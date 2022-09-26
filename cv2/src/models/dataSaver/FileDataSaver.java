package models.dataSaver;

public class FileDataSaver<T> implements DataSaver<T>{
    private T data;

    @Override
    public void save(T data) {
        System.out.println("saving to file");
        //ukladani do souboru
        this.data = data;
    }

    @Override
    public T load() {
        System.out.println("loading from file");

        return data;
    }
}
