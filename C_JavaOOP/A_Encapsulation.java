package C_JavaOOP;
/* OOP三大支柱 */

// 封裝 (Encapsulation)
// 繼承 (Inheritance)
// 多型 (Polymorphism)

/* 封裝 (Encapsulation) */
// 把真實世界的某個事物包成物件，裡面的資訊對外不公開，只公開某些特定方法讓別人使用，也就是資訊隱藏(Information hiding)
// 常用修飾子為 private, public

/* getter(), setter() */
// 若要存取private資料，會利用getter(), setter()方法來間接存取

class ATM {
    private int remainingMoney;
    private String firstName;
    private String lastName;
    // 無法得知提款機裡有多少錢以及用戶姓名

    private boolean identityComfirm(String card, String password) {
        return true;
    }
    // 也無法得知內部如何運作

    private void spitMoney() {
    }

    public void setUserName(String first, String last) {
        // 用setter跟getter可以建立公開方法來讓別人呼叫並設定private變數，並且做預先處理
        if (first == null || last == null || first.length() == 0 || last.length() == 0) {
            System.out.println("你沒輸入啦");
        } else {
            firstName = first;
            lastName = last;
        }
    }

    public String getName() {
        if (firstName == null || lastName == null) {
            return "unset";
        } else {
            return firstName + lastName;
        }
    }

    public void deposit(String card, String password) {
        if (identityComfirm(card, password) == true)
            spitMoney();
    }
    // 但還是可以查詢餘額跟提款

    public void checkBalance(String card, String password) {
    }
}
