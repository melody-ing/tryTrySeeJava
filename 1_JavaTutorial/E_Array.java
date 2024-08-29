public class E_Array {
    public static void main(String[] args) {
        String[] fruits = { "apple", "banana", "orange" };
        // 資料型別後面放[]，宣告時包在{}裡

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
