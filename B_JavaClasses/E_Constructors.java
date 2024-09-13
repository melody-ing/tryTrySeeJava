package B_JavaClasses;

import B_JavaClasses.tryConstructors.Point;

/* Constructors 建構式 */
// 類別Class：只有一個 (設計藍圖)
// 物件Object：可以有很多個 (各種依照藍圖做出來的產品)

// 類別的屬性：static 權限控制 資料型態 屬性名稱
// 類別的方法：static 權限控制 回傳值型態 方法名稱(參數){}
// 物件的屬性：權限控制 資料型態 屬性名稱
// 物件的方法：權限控制 回傳值型態 方法名稱(參數){}
// 物件的建構式：權限控制 類別名稱(參數){}

public class E_Constructors {
    int x; // 創建一個attribute

    // 創建一個 class constructors，名字要跟class一樣，不用return東西(預設為 void 不用宣告型別)
    // 構造函數總是"返回"一個新的物件實例，這是隱含的。
    public E_Constructors(int y) {
        x = y;
        // 為 E_Constructors class 中的變數設定初始值
        // 允許我們在創建物件的同時完成這個初始化過程
        // 使用 constructor 可以使代碼更簡潔、更不容易出錯，並確保物件在創建時就處於一個完全初始化的狀態。
    }

    public static void main(String[] args) {
        // int myObj = new E_Constructors(0)
        // 由於我們創造了class等於是創造了一個新的資料型態，就代表在宣告新object時需要指定為此物件的資料型態(也就是 class 名稱)
        E_Constructors myObj = new E_Constructors(6); // 當你創建一個新的物件時，你實際上是在調用構造函數
        System.out.println(myObj.x);

        Point p = new Point(3, 4);
        // 上面上面有import這邊才可以直接用Point
        // 那到Point中的物件屬性以及方法
        p.render();
        p.x = 10;
        System.out.println(p.x + p.y);

    }
}
