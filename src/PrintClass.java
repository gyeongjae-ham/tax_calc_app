public class PrintClass {
    // instance에서 사용하려면 static 없애야 한다
    public String delimiter = "";
    // class 내에서 똑같은 이름의 method를 사용하면 초기값을 지정하기 위한 생성자 역할을 함
    public PrintClass(String delimiter) {
        // this : instance를 가르킴 this.delimiter는 public String delimiter를 가르킴
        this.delimiter = delimiter;
    }
    // instance에서 사용하려면 static 없애야 한다
    public void A() {
        System.out.println(this.delimiter);
        System.out.println("A");
        System.out.println("A");
    }
    // instance에서 사용하려면 static 없애야 한다
    public void B() {
        System.out.println(this.delimiter);
        System.out.println("B");
        System.out.println("B");
    }
}
