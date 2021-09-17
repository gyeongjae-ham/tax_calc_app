public class BooleanApp {
    public static void main(String[] args) {

        System.out.println("One"); // String
        System.out.println(1); // Int

        System.out.println(true); // boolean
        System.out.println(false); // boolean

        String foo = "Hello world";
//        String true = "Hello world" // 이미 쓰임이 있는 키워드(reserved word)는 변수명으로 사용할 수 없다

        System.out.println(foo.contains("world")); // 입력값 안에 특정 값이 있는지 여부
        System.out.println(foo.contains("gyeongjae"));
    }
}
