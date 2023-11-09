public class Guess extends Library {
    public static void chooseMode() {
        System.out.println("Chọn chức năng:");
        System.out.println("1: Tìm kiếm sách theo yêu cầu: ");
        System.out.println("2: Xem danh sách hiện có: ");
        int mode = Integer.parseInt(sc.nextLine());
        if (mode == 1) {
            System.out.println("Nhập từ khóa cần tìm: ");
            String find = sc.nextLine();
            findBook(find);
        } else if (mode == 2) {
            listBook();
        }
    }
}
