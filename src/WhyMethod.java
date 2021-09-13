public class WhyMethod {
    public static void printTwoTimesA() {
        System.out.println("-");
        System.out.println("a");
        System.out.println("a");
    }
    public static void main(String[] args) {

        // 100,000,000 줄의 코드
        printTwoTimesA();

        // 100,000,000 줄의 코드
        printTwoTimesA();

        // 100,000,000 줄의 코드
        printTwoTimesA();
    }
}
