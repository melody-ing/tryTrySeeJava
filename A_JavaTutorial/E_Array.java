import java.util.Arrays;

public class E_Array {
    public static void main(String[] args) {
        String[] fruits = { "apple", "banana", "orange" };
        // 資料型別後面放[]，宣告時包在{}裡

        /* Array method */
        // length
        System.out.println(fruits.length);
        // deep copy
        String[] fruits2 = fruits.clone();
        String[] fruits3 = fruits;
        fruits[0] = "watermelon";
        // 印出array Arrays.toString()
        System.out.println(Arrays.toString(fruits));
        System.out.println(Arrays.toString(fruits2));
        // 填滿陣列元素 Arrays.fill()
        String[] array = new String[10]; // 建立新array時要設定array長度
        Arrays.fill(array, "嗚啦");
        System.out.println(Arrays.toString(array));
        // 排序 Arrays.sort()
        int[] sortArray = { 3, -231, 100000, 4353, -42 };
        Arrays.sort(sortArray);
        System.out.println(Arrays.toString(sortArray));
        // 陣列搜尋 Array.binarySearch(Object[],key) 二分搜尋
        // 有找到會回傳index，找不到會回傳負值，時間複雜度為O(logN)
        // 放入的array一定要是排序過的，如果放入沒有排序過的array不會報錯，但是有可能會回傳錯誤訊息。
        System.out.println(Arrays.binarySearch(sortArray, 3));
        // 陣列相等
        // 回傳boolean
        // 兩個array值跟順序都相等就會true，同一個reference也是true，都是null也是true
        System.out.println(Arrays.equals(fruits, fruits2));
        System.out.println(Arrays.equals(fruits, fruits3));

        /* for-each loop */
        // for(type variableName : arrayName){}
        // 他會自己按照index來遍歷array
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 二維陣列
        int[][] myNumbers = { { 1, 3, 5 }, { 2, 4, 6 } };
        System.out.println(myNumbers[1][2]);
        for (int i = 0; i < myNumbers.length; i++) {
            for (int j = 0; j < myNumbers[i].length; j++) {
                System.out.println(myNumbers[i][j]);
            }
        }

    }

}
