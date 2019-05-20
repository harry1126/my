import java.io.*;

public class JavaExam {
    public static void main(String[] args) {
        PrintWriter out = null;
        try {
//            FileOutputStream fos = new FileOutputStream("dd.txt");
            FileWriter fw = new FileWriter("result.txt");
            out = new PrintWriter(fw);
            out.println("JAVA 何忠昱");
            out.write("JAVA 何忠昱");
//            out.write("JAVA" + " ");
//            out.write(0x4F55);
//            out.write(0x5FE0);
//            out.write(0x6631);
            out.flush();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if ( out!=null ) {
                out.close();
            }
        }
    }
}
