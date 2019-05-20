import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello World!");
        FileOutputStream fos = new FileOutputStream("dd.txt");
        fos.write(100);
        fos.write(66);
        fos.flush();
        fos.close();
        FileWriter fwr = new FileWriter("a.txt");
        fwr.write(0x8F14);
        fwr.flush();
        fwr.close();
    }
}
