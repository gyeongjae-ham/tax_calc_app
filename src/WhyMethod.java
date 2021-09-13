import java.io.FileWriter;
import java.io.IOException;

public class WhyMethod {
                                     //매개변수(parameter)
    public static void printTwoTimes(String text, String delimeter) {
        System.out.println(delimeter);
        System.out.println(text);
        System.out.println(text);
    }

    public static String twoTimes(String text, String delimeter) {
        String out = "";
        out = out + delimeter + "\n";
        out = out + text + "\n";
        out = out + text + "\n";
        return out;
    }

    public static void main(String[] args) throws IOException {

        // 100,000,000 줄의 코드
        printTwoTimes("a", "_");
                      //인자, argument
        System.out.println(twoTimes("a","-"));

        FileWriter fw = new FileWriter("out.txt");
        fw.write(twoTimes("a","-"));
        fw.close();

    }
}
