
public class Admin extends Library {
    private static void displayMenu(){
        System.out.println("1: Thêm sách mới vào thư viện. ");
        System.out.println("2: Xóa sách khỏi thư viện. ");
        System.out.println("3: Sửa thông tin sách.");
        System.out.println("4: Test các chức năng của khách.");
        System.out.println("5: Đăng xuất.");
    }
    private static void showMode(int mode){
        switch (mode){
            case 1 :
                addBook();
                break;
            case 2:
                eraseBook();
                break;
            case 3:
                fixBook();
                break;
            case 4:
                Test();
                break;
        }
    }
    public static void chooseMode(){
        int mode;
        while(true) {
            displayMenu();
            mode = Integer.parseInt(sc.nextLine());
            if (mode == 5){
                logOut();
                break;
            }
            showMode(mode);
            System.out.println("Chọn chức năng muốn thực hiện tiếp: ");
        }
    }
    private static void addBook(){
        System.out.println("Nhập số sách muốn thêm: ");
        int numBook = Integer.parseInt(sc.nextLine());
        for (int i=1; i<=numBook; i++){
            id++;
            System.out.println("Nhập tên sách: ");
            String Title = sc.nextLine();
            System.out.println("Nhập tên tác giả: ");
            String Author = sc.nextLine();
            System.out.println("Nhập thể loại sách: ");
            String Type = sc.nextLine();
            System.out.println("Nhập ngày phát hành");
            String Date = sc.nextLine();
            Book a = new Book(Title, Author, Type, Date, id);
            list.add(a);
            if (i < numBook) System.out.println("Nhập thông tin cuốn tiếp theo muốn thêm");
        }
        System.out.println("Đã thêm xong sách theo yêu cầu");
    }
    private static void eraseBook(){
        System.out.println("Nhập số lượng sách cần xóa: ");
        int bookErase = Integer.parseInt(sc.nextLine());
        while(bookErase > list.size()){
            System.out.println("Số lượng không hợp lệ, vui lòng nhập lại: ");
            bookErase = Integer.parseInt(sc.nextLine());
        }
        for (int i=1; i<=bookErase; i++){
            System.out.println("Nhập thông tin quyển sách: ");
            String info = sc.nextLine();
            findBook(info);
            System.out.println("Chọn Id của cuốn sách muốn xóa: ");
            int id = Integer.parseInt(sc.nextLine());
            list.removeIf(anybook -> anybook.getId() == id);
            resetBookIds();
        }
    }
    private static void fixBook(){
        listBook();
        System.out.println("Chọn Id của cuốn sách muốn sửa: ");
        int id = Integer.parseInt(sc.nextLine());
        while (id >= list.size()){
            System.out.println("Id không hợp lệ, vui lòng nhập lại: ");
            id = Integer.parseInt(sc.nextLine());
        }
        Book needFix = getBook(id);
        System.out.println("Thông tin muốn sửa: ");
        System.out.println("1: Sửa tên sách");
        System.out.println("2: Sửa tác giả");
        System.out.println("3: Sửa thể loại sách");
        System.out.println("4: Sửa ngày xuất bản: ");
        int mode = Integer.parseInt(sc.nextLine());
        if (mode == 1){
            System.out.println("Nhập tên sách mới: ");
            String newName = sc.nextLine();
            needFix.setTitle(newName);
        }
        else if (mode == 2){
            System.out.println("Nhập tên tác giả mới: ");
            String newAuthor = sc.nextLine();
            needFix.setAuthor(newAuthor);
        }
        else if (mode == 3){
            System.out.println("Nhập thể loại sách mới: ");
            String newType = sc.nextLine();
            needFix.setType(newType);
        }
        else if (mode == 4){
            System.out.println("Nhập ngày xuất bản mới: ");
            String newDate = sc.nextLine();
            needFix.setDate(newDate);
        }
        System.out.println("Đã sửa!");
    }
    private static void Test(){
        Guess.chooseMode();
    }
    private static void logOut(){
        System.out.println("Đăng xuất thành công");
    }
}
