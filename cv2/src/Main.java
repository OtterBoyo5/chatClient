import com.sun.security.jgss.GSSUtil;
import models.*;
import models.dataSaver.DataSaver;
import models.dataSaver.FileDataSaver;
import models.dataSaver.InMemoryDataSaver;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world");

        final int x = 10;
        final double pi = 3.14;

        ExampleClass exampleClass = new ExampleClass();
        exampleClass.publicMethod();
        System.out.println(exampleClass.publicNumber);

        System.out.println(MyMatchClass.pi);

        int sum = MyMatchClass.sum(1,2);

        Car skodaFabia = new Car("Skoda","Fabia");

        Box<Car> boxOfCar = new Box<>(skodaFabia); //zadal jsem misto T Car -> nemuzu zmenit (musim tam dat typ co tam patri

        Box<Integer> boxOfNumber = new Box<>(16);
        System.out.println(boxOfNumber.getData());

        Pair<Integer, Car> pairCar = new Pair<>(1, skodaFabia);

        Pair<String, String> pairString = new Pair<>("key1","key2");

        Box<Pair<String, String>> boxOfPair = new Box<>(pairString); //vnorene Pair v Boxu skrze genericke tridy

        DataSaver<Car> dataSaver = new FileDataSaver<>(); //do DataSaver dam filedatasaver

        if (true){
            dataSaver = new InMemoryDataSaver<>();
        }

        dataSaver.save(skodaFabia);

        //Car loadedCar = dataSaver.load();

        dataSaver = new InMemoryDataSaver<>();

        dataSaver.save(skodaFabia);


        printSymbol('#',5);

        try { // zapis vyjimky
            //zapis do souboru/metoda
            throw new NullPointerException("Soubor nenalezen");
        }
        catch (NullPointerException e){ //konkretni vyjimka

        }
        catch (Exception e){ //zachyceni vyjimky(obecna vyjimka)
            System.out.println(e.getMessage());
        }
    }

    private static void printSymbol(char symbol, int count){ //rekurze (metoda vola sama sebe, pro strukturu vetsinou)s
        if (count<1)
            return;

        String textToPrint = "";
        for (int i = 0; i < count; i++) {
            textToPrint = textToPrint + symbol;
        }
        System.out.println(textToPrint);
        count = count -1;
        printSymbol(symbol,count);
    }

}
//xml - strukturovany jazyk, dodrzovani hiearchie
//cvs -
//protokol - sada pravidel pro komunikaci, pro komunikaci aplikaci(http, ftp), konvence pro komunikaci
//soket - abstrakce nad sitovou komunikaci(stream)
