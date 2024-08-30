package C_JavaClasses;

public class E_Constructors {
    int x; // 創建一個attribute

    // 創建一個 class constructors，名字要跟class一樣，不能return東西(void)
    public E_Constructors(int y) {
        x = y;
        // 為 E_Constructors class 中的變數設定初始值
        // 允許我們在創建物件的同時完成這個初始化過程
        // 使用 constructor 可以使代碼更簡潔、更不容易出錯，並確保物件在創建時就處於一個完全初始化的狀態。
    }

    public static void main(String[] args) {
        E_Constructors myObj = new E_Constructors(6); // 在創建實例時就會呼叫 constructor
        System.out.println(myObj.x);
    }
}
