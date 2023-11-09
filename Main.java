import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void action(){
        System.out.println("Nhập tài khoản: ");
        String userName = sc.nextLine();
        System.out.println("Nhập mật khẩu: ");
        String passWord = sc.nextLine();
        String compare = "admin";
        if (userName.equals(compare) && passWord.equals(compare)) {
            Admin.chooseMode();
        } else Guess.chooseMode();
    }
    public static void main(String[] args){
        while (true) {
            System.out.println("1: Đăng nhập");
            System.out.println("2: Thoát");
            int mode = Integer.parseInt(sc.nextLine());
            if (mode == 2){
                break;
            }
            action();
        }
    }
}
