public class C_Casting {
    public static void main(String[] args) {
        /* Widening Casting（自動類型轉換） */
        // 1. 將較小的類型自動轉換為較大的類型
        // 2. 不會損失數據
        // 3. 順序：byte -> short -> char -> int -> long -> float -> double
        // 例子：
        int myInt = 9;
        double myDouble = myInt; // 自動轉換，不需要額外語法
        System.out.println(myDouble);

        /* Narrowing Casting（強制類型轉換） */
        // 1. 將較大的類型轉換為較小的類型
        // 2. 需要手動轉換，可能會損失數據
        // 3. 需要使用強制轉換語法
        // 例子：
        double myDouble2 = 9.78;
        int myInt2 = (int) myDouble2; // 手動轉換，使用 (int) 進行強制類型轉換
        System.out.println(myInt2);

        // 重要性：
        // 1. 理解數據類型對於正確管理內存和選擇適當的變量類型很重要
        // 2. Widening Casting 很安全，但要注意精度問題（尤其是 long 到 float）
        // 3. Narrowing Casting 可能導致數據丟失，使用時需要格外小心
        // 4. 在進行數學運算或數據處理時，了解這些概念可以幫助避免意外的數據丟失或不準確

        // 注意：在實際編程中，應該盡量避免依賴自動類型轉換，
        // 而是明確地進行類型轉換，以提高代碼的可讀性和可維護性。

    }

}
