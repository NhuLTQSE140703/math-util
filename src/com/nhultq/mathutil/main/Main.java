/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhultq.mathutil.main;

import com.nhultq.mathutil.MathUtility;

/**
 *
 * @author ASUS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        System.out.println("1st upload from local to GitHub");
//        System.out.println("Welcome to GitHub");
          //TEST TRÂU BÒ
          
          long expected = 120;//tui kì vọng hàm tính gt trả 120 nếu tui nhập 5
          long actual;
          int input = 5; //đầu vào 5
          
          actual = MathUtility.getFactorial(input);
          System.out.println("5!: Expected: "+expected+
                  "; Actual: "+actual);
          //một test case, 1 tình huống xài hàm, test hàm, dùng hàm
          
          //CASE2 
          expected = 1;
          input = 0;
          actual = MathUtility.getFactorial(input);
          System.out.println("0!: Expected: "+expected+
                  "; Actual: "+actual);
          //CASE3 
          expected = 2;
          input = 2;
          actual = MathUtility.getFactorial(input);
          System.out.println("2!: Expected: "+expected+
                  "; Actual: "+actual);
          //CASE4 
          //expected = ???; ngoại lệ, không so sánh được, không phải value
          input = -1;
          actual = MathUtility.getFactorial(input);
          //Không in được ngoại lệ
          
          //CHÚNG TA PHẢI NHING ĐỂ KẾT LUẬN, NHÌN NHIỀU CASES
          
          //CHƠI TEST AUTOMATION DÙNG THƯ VIỆN
          //tdd
    }
    
}
