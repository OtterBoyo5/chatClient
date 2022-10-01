package models;

public class Singleton {
    private static String connection;

    public String getConnection(){
        if (connection == null){
            connection = "open";
        }

        return connection;
    }

}
