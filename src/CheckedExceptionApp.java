import javax.imageio.IIOException;
import java.io.FileWriter;
import java.io.IOException;

public class CheckedExceptionApp {
    // try catch 기능
//    public static void main(String[] args) {
//        FileWriter f = null;
//        try {
//            f = new FileWriter("data.txt");
//            f.write("Hello");
//            // close를 하기 전에 예외가 발생할 수 있기 때문에 finally로 처리해야 한다!!!!!
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            // 만약에 f가 null이 아니라면 close 수행
//            if(f != null) {
//                try {
//                    f.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//    }
    // try with 기능 java 7부터 가능 위와 같은 close 시 복잡함을 제거하기 위한 기능
    public static void main(String[] args) {
        // try with resource statements
        try(FileWriter f = new FileWriter("data.txt");) {
            f.write("Hello");
            // 자동으로 f.close()를 해 줌
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
