package B_JavaClasses;
/* OOP */

// 能夠創造 data 跟 method 的 object

// 面向對象程式設計（OOP）相較於程序式程式設計的優點

// 1. 執行更快、更容易
// - OOP 模型更接近真實世界，使得問題的抽象和解決更直觀
// - 通過封裝和繼承，可以更高效地組織和管理代碼

// 2. 提供清晰的程式結構
// - 通過類和對象，代碼結構更加明確和有組織
// - 易於理解系統的整體架構和各部分之間的關係

// 3. 遵循 DRY 原則（Don't Repeat Yourself）
// - 通過繼承和多態，可以重用代碼，減少重複
// - 使代碼更容易維護、修改和調試
// - 當需要更改時，只需在一個地方進行修改，而不是多個地方

// 4. 實現完全可重用的應用，減少代碼量和開發時間
// - 通過創建可重用的類和對象，可以在不同的項目中重複使用代碼
// - 減少了開發新應用或功能所需的時間和精力

public class A_OOP {
    // 這樣就可以建立class

    // 在class裡宣告變數
    int x = 5;
    final int y = 10;

    public static void main(String[] args) {
        A_OOP myObj = new A_OOP(); // 在放類別的時候是放 class 名稱，創造一個物件
        A_OOP myObj2 = new A_OOP();
        // myObj.y = 234;
        myObj2.x = 20;
        System.out.println(myObj.x);
        System.out.println(myObj2.x);
    }

}
