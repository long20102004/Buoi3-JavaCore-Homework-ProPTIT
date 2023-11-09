public class Book extends Library{
    private String Title;
    private String Author;
    private String Type;
    private String Date;
    private int id;
    String getAuthor(){
        return this.Author;
    }
    String getTitle(){
        return this.Title;
    }
    String getType(){
        return this.Type;
    }
    String getDate(){
        return this.Date;
    }
    int getId(){
        return this.id;
    }
    void setAuthor(String s) {
        this.Author = s;
    }
    void setTitle(String s){
        this.Title = s;
    }
    void setType(String s){
        this.Type = s;
    }
    void setDate(String s){
        this.Date = s;
    }
    void setId(int x){
        this.id = x;
    }
    Book (String a, String b, String c,String d, int id){
        this.Title = a;
        this.Author = b;
        this.Type = c;
        this.Date = d;
        this.id = id;
    }
    void getInfo(){
        System.out.println("Mã sách: " + this.getId());
        System.out.println("Tên sách: " + this.getTitle());
        System.out.println("Tác giả: " + getAuthor());
        System.out.println("Thể loại: " + getType());
        System.out.println("Ngày xuất bản: " + getDate());
    }
}