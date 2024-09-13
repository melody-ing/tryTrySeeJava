package B_JavaClasses;

/* Scanner */
// 一個簡單的文字讀取器，可以解析來自控制台輸入的字串成各個基本資料型態
import java.util.Scanner;

public class J_Scanner {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // 初始化一個輸入Scanner
        // Scanner可以把一整行的字串切成很多的token，預設以空白為基礎隔開，再透過next方法，解析並轉換成我們需要的一資料型態，然後回傳
        System.out.println("請問你的名字是？");
        String name = s.nextLine();
        // 有很多種next方法，.next()用來找下一個token並回傳，.nextLine讀一整行的字串並回傳
        System.out.println(name + " 你好，幾歲");
        int age = s.nextInt();
        // .nextInt()，找下一個token並轉換成int回傳
        // while (s.hasNext()) {
        // .hasNext() 如果還有token就回傳true
        // System.out.println(age + " 歲喔，真老");
        // }
        System.out.println(age + " 歲喔，真老");
        System.out.println("掰掰");
        s.close();
        // 結束後要關掉 Scanner
    }

}
