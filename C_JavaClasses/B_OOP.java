package C_JavaClasses;
// 兩個檔案放在同一個package裡面就可以使用對方的class，但是需要去其父目錄來同時將兩個CLASS編譯，javac C_JavaClasses/*.java

public class B_OOP {
    public static void main(String[] args) {
        A_OOP myObj = new A_OOP();
        myObj.x = 40;
        System.out.println(myObj.x);
    }
}
