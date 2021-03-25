/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhultq.mathutil;

/**
 *
 * @author ASUS
 */
public class MathUtility {
    //đây là class mô phỏng lại class Math, chứa các hàm xài chung, 
    //không lưu lại điều gì -> STATIC
    
    public static final double PI = 3.14;
    
    //hàm tính n!
    //n! tăng nhanh về giá trị
    //21! tràn kiểu long
    
    public static long getFactorial(int n){
        if(n<0 || n>20){
            throw new IllegalArgumentException("n must be from 0 to 20");
        }
        if(n==0 || n ==1){
            return 1; //0!, 1! = 1
        }
        
        long result = 0; //giả bộ
        for(int i = 2; i<=n; i++){
            result *= i;
        }
        return result; //nhân từ 2, 3, 4, 5, 6...
    }
}
