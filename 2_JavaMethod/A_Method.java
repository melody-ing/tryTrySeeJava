/* Method就相當於function */
// static void myMethod(){}
// static：表示該方法屬於類別本身,而不是類別的實例。這意味著你可以直接通過類別名稱來呼叫這個方法,而不需要先創建該類別的物件。

public class A_Method {
    static void myMethod(String lang) {
        System.out.println("乾我要無聊死了，" + lang + "是啥鬼");
    }
    // 這是方法的返回型別。"void" 表示這個方法不返回任何值。如果方法需要返回值,你會在這裡指定返回值的資料型別(例如 int, String 等)。

    static int myNumber(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        myMethod("Java");
        myMethod("python");
        myMethod("Go");

        System.out.println(myNumber(2, 3));
    }
}