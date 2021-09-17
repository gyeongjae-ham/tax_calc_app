public class AuthApp {
    public static void main(String[] args) {

        String id = "gyeongjae ham";
        String inputId = args[0];

        String pass = "1111";
        String inputPass = args[1];

        System.out.println("Hi");

//        if(inputId.equals(id)) {
//            if(inputPass.equals(pass)) {
//                System.out.println("Master!!");
//            } else {
//                System.out.println("Wrong password!!");
//            }
//        } else {
//            System.out.println("Who are U?");
//        }

        if(inputId.equals(id) && inputPass.equals(pass)) {
                System.out.println("Master!!");
            } else {
            System.out.println("Who are U?");
        }
    }
}
