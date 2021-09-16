interface Calculable {
    double PI = 3.14;
    int sum(int v1, int v2);
}
interface Printable {
    void print();
}
class RealCal implements Calculable, Printable {
    public int sum(int v1, int v2) {
        return 0;
    }
    public void print() {
        System.out.println("This is RealCal!!");
    }
}
class AdvancedPrint implements Printable {
    public void print() {
        System.out.println("This is RealCal!!");
    }
}
public class InterfaceApp {
    public static void main(String[] args) {
        // 더하기 기능이 있는 클래스를 만들어주세요.라고 외주했을 때 서로 다른 형식의 클래스를 생성할 수 있음(협업할 때도)
        Printable c = new AdvancedPrint(); // 같은 interface의 호환성을 제공하기도 한다
        c.print();
    }
}
