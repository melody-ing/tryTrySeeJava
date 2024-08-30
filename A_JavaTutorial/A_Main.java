// Java Syntax
// java -version：確定要裝Java
// javac 檔案名：javac 編譯器將 .java 文件轉換為 .class 文件
// java 檔案名：JVM 讀取並執行 .class 文件中的字節碼

/* .class */
// 版本控制中，通常只追踪 .java 文件，而忽略 .class 文件 (在 .gitignore 文件中添加 *.class)

// 在Java中,當你在一個資料夾(package)中創建一個class時,你實際上已經定義了一個新的型別。class本身就是一種自定義的型別,所以不需要額外宣告型別。
public class A_Main {
    public static void main(String[] args) {
        // 任何在main() method裡的code都會執行
        System.out.println(2 + 2 + "println");
        System.out.println("會換行");
        System.out.print("print這行跟");
        System.out.print("下面那一行會是同一行");
        // System為Java內建的class，包含多種屬性，out代表output
        // println來印出要的東西
    }
}

// Java為物件導向語言 皆須使用class
// 物件以及檔案名稱皆須大寫開頭
