class Cal {
    int v1, v2;
    Cal(int v1, int v2) {
        System.out.println("Cal init!!");
        this.v1 = v1; this.v2 = v2;
    }
    public int sum(int v1, int v2) {
        return v1+v2;
    }
    // Overloading은 상속과는 상관이 없음
    public int sum(int v1, int v2, int v3) {
        return this.sum(v1,v2)+v3; // this : 자기 자신을 나타냄
    }
}
// 상속 받아서 내부에 sum method를 품고 있다
class Cal2 extends Cal {
    Cal2(int v1, int v2) {
        super(v1, v2);
        System.out.println("Cal2 init!!");
    }
    public int minus(int v1, int v2) {
        return v1-v2;
    }
    // Overriding 부모 클래스의 기능을 덮어쓰기 한 것
    public int sum(int v1, int v2) {
        System.out.println("Cal2!!!!");
        return super.sum(v1, v2); // super : 부모클래스의 method를 불러서 사용
    }
}
public class InheritanceApp {
    public static void main(String[] args) {
        Cal c = new Cal(1,2);
        System.out.println(c.sum(2,1));
        System.out.println(c.sum(2,1,3)); // 입력값이 세 개이면서 int 값인 메소드를 찾아서 실행해 줌

        Cal2 c2 = new Cal2(1,2);
        System.out.println(c2.sum(4,1));
        System.out.println(c2.minus(4,1));
    }
}
