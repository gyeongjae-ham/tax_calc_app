class Greeting{
    //public, protected, default, private
    public static void hi() {
        System.out.println("Hi");
    }
    // private : 같은 클래스 안에서만 불러서 사용할 수 있음
    // public : 같은 클래스 안이 아니더라도 사용할 수 있음
}
public class AccessLevelModifierMethod {

    public static void main(String[] args) {
        Greeting.hi();
    }
}
