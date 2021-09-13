public class OutputMethod {

    public static String a() {
        // .....
        return "a";
    }

    public static int one() {
        // .....
        return 1;
        // ...... return이 있으면 method가 끝남 뒤에 아무리 많은 코드 있어도 실행 x
    }
                  // return 값이 없는 method를 만들 때 void를 쓴다!!
    public static void main(String[] args) {

        System.out.println(a());
        System.out.println(one());

    }
}
