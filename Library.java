import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    public static int id = 0;
    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<Book>list = new ArrayList<>();
    public static void listBook(){
        for (Book book : list){
             book.getInfo();
        }
    }
    public static void findBook(String Info){
        for (Book book : list){
            if (book.getDate().contains(Info) || book.getType().contains(Info)
                    || book.getAuthor().contains(Info)|| book.getTitle().contains(Info)){
                book.getInfo();
            }
        }
    }
    public static void resetBookIds() {
        int newId = 1;
        for (Book book : list) {
            book.setId(newId++);
        }
    }
    public static Book getBook(int id){
        for (Book book : list){
            if (book.getId() == id) return book;
        }
        return null;
    }
}
