package models;

public class Box<T> { //<T> genericka trida s objekteme T
    private T data;

    public Box(T data){
        this.data = data;
    }
    public T getData(){
        return data;
    }

}
