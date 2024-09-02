package B_JavaClasses;

public class E_Constructors {
    int x; // 創建一個attribute

    // 創建一個 class constructors，名字要跟class一樣，不能return東西(預設為 void 不用宣告型別)
    // 構造函數總是"返回"一個新的物件實例，這是隱含的。
    public E_Constructors(int y) {
        x = y;
        // 為 E_Constructors class 中的變數設定初始值
        // 允許我們在創建物件的同時完成這個初始化過程
        // 使用 constructor 可以使代碼更簡潔、更不容易出錯，並確保物件在創建時就處於一個完全初始化的狀態。
    }

    public static void main(String[] args) {
        E_Constructors myObj = new E_Constructors(6); // 當你創建一個新的物件時，你實際上是在調用構造函數
        System.out.println(myObj.x);
    }
}
