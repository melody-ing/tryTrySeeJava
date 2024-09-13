package B_JavaClasses;
/* Java 修飾符 (Modifiers) */

// public 關鍵字是一個存取修飾符，用於設置類別、屬性、方法和建構子的存取級別。

// 修飾符可分為兩組：
// 1. 存取修飾符：控制存取級別
// 2. 非存取修飾符：不控制存取級別，但提供其他功能

// 存取修飾符包括：
// - public：公開，可被任何其他類別存取
// - default（無修飾符）：同一套件內可存取
// - protected：受保護，可被同一套件內的類別和所有子類別存取
// - private：私有，只能在同一類別內存取

// 修飾子     | 同一類別 | 同一套件 | 不同套件的子類別 | 不同套件且非子類別
// public     |    o    |    o    |        o        |        o    
// protected  |    o    |    o    |        o        |
// default    |    o    |    o    |
// private    |    o    |

// 非存取修飾符例子：
// - static：用於創建類別方法和變數
// - final：用於使類別不可被繼承，方法不可被重寫，變數值不可被改變
// - abstract：用於創建抽象類別和方法
// - synchronized：用於線程安全
// - volatile：表示變數可能會被多個線程同時訪問和修改

public class G_Modifiers {
    // 1. 存取修飾符：控制程式碼的可見性和存取權限
    public int publicVar = 1; // 可以被任何類別存取
    private int privateVar = 2; // 只能在本類別內存取
    protected int protectedVar = 3; // 可被同一套件和子類別存取
    int defaultVar = 4; // 可被同一套件內的類別存取

    public void publicMethod() {
        System.out.println("公開方法");
    }

    private void privateMethod() {
        System.out.println("私有方法");
    }

    // 2. 非存取修飾符：不控制存取權限，而是提供其他功能
    // static：屬於類別而非實例，可以直接通過類別名稱存取
    public static int staticVar = 5;

    // final：值不能被改變
    public final int CONSTANT = 10;

    // volatile：表示變數可能會被多個線程同時存取和修改
    private volatile boolean isRunning = true;

    // synchronized：確保在多線程環境中方法的安全執行
    public synchronized void synchronizedMethod() {
        System.out.println("這是一個同步方法");
    }
}
