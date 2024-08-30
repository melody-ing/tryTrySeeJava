/* Java Variables */

/* Primitive Data Types（基本數據類型） */
// 這些類型直接存儲值，而不是引用

// Number 整數類型
// byte: 1 byte, 範圍 -128 到 127
// short: 2 bytes, 範圍 -32,768 到 32,767
// int: 4 bytes, 範圍 -2,147,483,648 到 2,147,483,647
// long: 8 bytes, 範圍 -9,223,372,036,854,775,808 到 9,223,372,036,854,775,807，長整數值結尾需加 L，例如：100000L

// 浮點數類型
// float: 4 bytes, 可儲存 6-7 位小數，float 值結尾需加 f，例如：19.99f
// double: 8 bytes, 可計算更精確的浮點數, 可儲存 15 位小數，結尾需加f，double 是浮點數的預設類型

// 字元類型
// char: 2 bytes, 儲存單一字元/字母或 ASCII 值, 字元值使用單引號，例如：'A'

// 布林類型
// boolean: 1 bit, 儲存 true 或 false 值

/* Non-Primitive Data Types（非基本數據類型，也稱為引用類型）*/
// 這些類型存儲對象的引用，而不是直接存儲值，有方法可以呼叫，不能是null，類型名稱都是大寫開頭

// 字串類型
// String: 儲存文字，例如 "Hello", 字串值使用雙引號
// Arrays: 用於存儲多個值在單個變量中
// Classes: 用戶定義的類型
// Interface: 用於實現抽象和多重繼承

public class B_Variables {
    /* type variableName = value */
    public static void main(String[] args) {
        // 變數命名一定要小寫字母開頭，可以包含_$數字
        // final 可以讓他變 const
        final String name = "Melody";
        String lastName = "Yin \fgoooood\"";
        // \n:newline, \r將定位的字重置到行首, \t:tab, \b:backspace, \f:換頁
        int x = 1, y = 2, z = 3;
        int a, b, c;
        a = b = c = 50;
        float floatNum;
        floatNum = 3.3333f;
        char letter = 'b';
        char myASCII = 33; // char可以來表達ASCII
        boolean myBoolean = true;

        System.out.println(name + "www" + x + y + z + floatNum + letter + myBoolean + a + b + c + myASCII);
        System.out.println(x + y + z);
        System.out.println(name.concat(lastName).toUpperCase() + name.length());
    }

}
