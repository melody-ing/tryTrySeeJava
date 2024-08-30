package C_JavaClasses;

/* Class Method */
// Static vs. Public
// 1. Static（靜態）
// - 用於類級別的成員（變量或方法）
// - 屬於類本身，而不是類的實例
// - 可以通過類名直接訪問，無需創建類的實例
// - 在整個程序中只有一個副本
// - 常用於實用工具方法或共享資源

// 2. Public（公有）
// - 用於指定訪問修飾符
// - 表示該成員（變量、方法或類）可以被任何其他類訪問
// - 適用於類、方法和變量
// - 不限制於類級別，可以用於實例成員

public class C_Method {

    // 在class裡宣告 static method
    static void myStaticMethod() {
        System.out.println("Static method");
    }

    // 在class裡宣告 public method
    // 要呼叫的話要先創再實例才可以呼叫
    public void myPublicMethod() {
        System.out.println("Public method");
    }

    public static void main(String[] args) {
        myStaticMethod();

        C_Method myObj = new C_Method();
        myObj.myPublicMethod();
    }

}
