package com.fu.mathutil;

//Ta viet cái class de cung cap cái tien ich cho noi khác xài, khi ta cung cap cái tien 
//ich cho noi khác xài, do là lúc ta ko can nho cái gì cho rieng ta
//hàm static giúp làm dieu này
public class MathUtil {

    //n! = 1.2.3.4.5.6.7....n
    //0! = 1
    //ko tính duoc giai thua am cho so âm
    //20! là vua khop kieu long, kieu long toi da 18 con so 0
    //21! lo kieu long
    //neu dua vào am, 21 giai thua, ta éo tính, ta dap vào mat ai xài hàm 
    //.mot cái ngoai le, chui éo tính duoc
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid argument. n must bi betwenn 0 - 20");
        }
        //hàm dung lien éo can return

        //xuong day là n = 0...20 ròi
        if (n == 0 || n == 1) {
            return 1; //dung ngay khi n dac biet
        }      //xuong den day, n = 2...20 roi
        //choi for hoac de quy - recursion
        //ki thuat nhoi con heo dat, oc buu don thit
        //i = 2, i = 3, i = 4, i = 5,.. i = n, nhoi lien tuc i vào tich
        long product = 1;// tich khoi dau bang 1, nhoi 2 3 4 5 6 7 8,...,n
        for (int i = 2; i <= n; i++) 
            product *= i; //product = product dang có nhan con i, dap nguoc tro lai
            //product = product * i;
            //nhan tu 2 den n
        return product;
    }
}
