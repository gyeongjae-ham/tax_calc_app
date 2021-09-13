class Print {
    public String delimiter;
    public void a() {
        System.out.println(this.delimiter);
        System.out.println("a");
        System.out.println("a");
    }

    public void b() {
        System.out.println(this.delimiter);
        System.out.println("b");
        System.out.println("b");
    }

    public static void c(String delimiter) {
        System.out.println(delimiter);
        System.out.println("c");
        System.out.println("c");
    }
}

public class staticMethod {

    public static void main(String[] args) {
//        Print.a("-");
//        Print.b("-");

        //instance
        //a라는 Method는 t1이라는 Instance의 소속으로 실행되고 있음
        //Method가 instance 소속일때는 static 제거해 줘야함
        //Method가 class 소속일때는 static 써줘야 함
        Print t1 = new Print();
        t1.delimiter = "-";
        t1.a();
        t1.b();

//        Print.a("*");
//        Print.b("*");
        Print t2 = new Print();
        t2.delimiter = "*";
        t2.a();
        t2.b();

        Print.c("-");
    }
}
