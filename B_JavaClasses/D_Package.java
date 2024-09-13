package B_JavaClasses;

import B_JavaClasses.C_Method;
import B_JavaClasses.*;
// 載入封包中的所有類別，但是因為我現在調用的是同一個封包的方法，所以不需要import

/* Package 封包 */
// 也就是資料夾，將多個程式檔案分群處理

/* 基礎權限控制 */
// class 預設權限：僅限同個封包中的其他類別可以調用
// public class 公開權限：可被所有其他類別調用，所有類別 變數 方法都要是public才可以
// 還有很多其他的權限

// -App.java (無所屬封包名稱)(可以調用 math 裡 public 的 method)
// /math/
//      --BasicMath.java (package math)
//      /geometry/
//          --Rectangle.java (package math.geometry)

// 也可以用 import 的方式將檔案放進來，就可以直接調用，不用每次都加入封包名稱
// import math.BasicMath

public class D_Package {
    public static void main(String[] args) {
        C_Method fromC = new C_Method();
        fromC.myPublicMethod();
        C_Method.myStaticMethod();
    }
}

class class1 {
    static int x = 3;

    public static void main(String[] args) {

        // 當你使用 new 關鍵字時，Java 會自動調用構造函數並返回新創建的物件。

        System.out.println(class1.x);
        System.out.println(class2.x);
        System.out.println(class2.newNum(2, 5));
        // 會取到不同class中的x
    }
}

class class2 {
    static double x = 5.4;

    static int newNum(int n1, int n2) {
        return n1 + n2;
        // 如果直接用 return 來終止 method 就代表不回傳東西，所以 method 的型別為void
    }
}
