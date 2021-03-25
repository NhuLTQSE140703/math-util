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
        
        //sửa code hàm giai thừa, dùng đệ quy 
        //đệ quy: vòng lại chính mình với một quy mô khác
        //recursion, làm khéo nếu không nó đi mãi mãi
        //stackoverflow.com
        if(n==0 || n ==1){
            return 1; //0!, 1! = 1
        }
        return n * getFactorial(n-1); //n! = n * (n-1)!
        
//        long result = 1; //XANH LOCAL VÀ SERVER //giả bộ
//        for(int i = 2; i<=n; i++){
//            result *= i;
//        }
//        return result; //nhân từ 2, 3, 4, 5, 6...
    }
}
