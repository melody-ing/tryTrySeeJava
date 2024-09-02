package B_JavaClasses;
/* 實例（非靜態）成員： */

// 這些就像是每個具體學校的特徵。
// 例如，name 和 studentCount 對每所學校都是不同的。
// 每創建一個新的 School 物件，就會有一組新的實例變數。

/* 非實例（靜態）成員： */
// 這些就像是所有學校共享的信息。
// 例如，country 和 totalStudents 對所有學校都是一樣的。
// 不管創建多少個 School 物件，這些靜態變數都只有一份。

public class F_MethodEx {
    // 靜態（非實例）成員：所有學校共享
    public static String country = "台灣"; // 所有學校都在台灣
    public static int totalStudents = 0; // 所有學校的學生總數

    // 實例成員：每個學校獨有
    public String name; // 學校名稱
    public int studentCount; // 該學校的學生數

    // 構造函數
    public F_MethodEx(String name) {
        this.name = name;
        this.studentCount = 0;
    }

    /* 實例方法 & 靜態方法 */
    // 區分是為了更清晰、更高效、更易維護的代碼
    // 訪問代表修改以及讀取
    // 實例方法：可以訪問實例變數以及靜態變數(處理特定學校的邏輯)
    public void addStudent() {
        this.studentCount++; // 增加這所學校的學生數
        F_MethodEx.totalStudents++; // 增加總學生數
    }

    // 靜態方法：只能訪問靜態變數，用於表示處理全局變數的method(處理所有學校共享的邏輯)
    public static void changeCountry(String newCountry) {
        F_MethodEx.country = newCountry; // 改變所有學校的國家
    }

    // 主方法示範使用
    public static void main(String[] args) {
        // main 方法是 Java 程式的入口點。
        // 當 Java 運行時環境（JRE）啟動你的程式時，它需要一個固定的、可預測的方式來開始執行。
        // 靜態方法可以在不創建類的實例的情況下被呼叫。

        // 創建兩所不同的學校
        F_MethodEx school1 = new F_MethodEx("台北第一中學");
        F_MethodEx school2 = new F_MethodEx("高雄第一中學");

        // 使用實例方法和成員
        school1.addStudent();
        school1.addStudent();
        school2.addStudent();

        System.out.println(school1.name + " 的學生數: " + school1.studentCount);
        System.out.println(school2.name + " 的學生數: " + school2.studentCount);

        // 使用靜態方法和成員
        System.out.println("所有學校的總學生數: " + F_MethodEx.totalStudents);
        System.out.println("學校所在國家: " + F_MethodEx.country);

        F_MethodEx.changeCountry("日本");
        System.out.println("更改後的學校所在國家: " + F_MethodEx.country);
    }
}
