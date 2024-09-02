package B_JavaClasses;

// 可以再另一個資料夾呼叫 public method

public class D_Method {
    public static void main(String[] args) {

        C_Method fromC = new C_Method();
        // 當你使用 new 關鍵字時，Java 會自動調用構造函數並返回新創建的物件。

        fromC.myPublicMethod();

    }
}
