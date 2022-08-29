package com.fu.mathutil;

public class MathUtilLive {

    
    public static void main(String[] args) {
        long result = MathUtil.getFactorial(5);//hàm tính di coi là may
        System.out.println("expected: 5! = 120; actual: " + result);
        
        System.out.println("expected: 6! = 720; actual: " + MathUtil.getFactorial(6));
        System.out.println("expected: 0! = 1; actual: " + MathUtil.getFactorial(0));
        //MathUtil.getFactorial(-5); nem ngoai le that roi, ai bieu dua cà chon làm chi!!!
        
        
        
        //ky thuat kiem thu phan mem: uoc luong xem gia tri tra ve cua hàm là gi
        //expected value: 5! = 120
        //mày/hàm ai dó viet khi chay thuc te là may = actual, gia su 120
        //if expected == actual, hàm ngon trong tình huong nay
        
        
    }
    
}
