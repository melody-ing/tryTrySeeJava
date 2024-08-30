package C_JavaClasses;

public class E_Constructors {
    int x; // 創建一個attribute

    // 創建一個 class constructors，名字要跟class一樣，不能return東西(void)
    public E_Constructors() {
        x = 5;
        // 為 E_Constructors class 中的變數設定初始值
    }

    public static void main(String[] args) {
        E_Constructors myObj = new E_Constructors(); // 在創建實例時就會呼叫 constructor
        System.out.println(myObj.x);
    }
}
