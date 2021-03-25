/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhultq.mathutil.test;

import com.nhultq.mathutil.MathUtility;
import java.sql.SQLException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ASUS
 */
public class MathUtilityTest {
    @Test //biến hàm này thành main(), Shift-F6 để chạy
    //gọi hàm getF() như thường lệ, tự động so sánh
    //so sánh expected và actual
    //khớp thì thấy màu xanh
    //không khớp thấy màu đỏ
    public void testFactorialRightArgumentRunsWell(){
        long expected = 120; //5!
        int n = 5; //đầu vào
        long actual = MathUtility.getFactorial(n); //tính thử
        assertEquals(expected, actual);//so sánh tự động
        
        //tui sẽ test các tình huống còn lại
        assertEquals(720, MathUtility.getFactorial(6));//6! co phai 720
        assertEquals(24, MathUtility.getFactorial(4));
        assertEquals(2, MathUtility.getFactorial(2));
        assertEquals(1, MathUtility.getFactorial(1));
        
        //0! là một tình huống cần test
        //1! là một tình huống khac cần test
        //Nghề TESTER/QA là nghề nghĩ ra các TEST CASE rồi thử nghiệm.
        
        //assertEquals(0, MathUtility.getFactorial(0));
        //kì vọng sai, tính đúng -> màu đỏ
        //actual, tính sai -> màu đỏ
    }
    
    
    //ta test xem phần ngoại lệ - exception 
    //exception là tình huống bất thường xảy ra trong code khi thực thi
    //nó khogno phải là 1 value có thể so sánh
    //Lỗi SQL trùng key, sai khóa ngoại, null trên cột yêu cầu khác null
    //đều là lỗi liên quan SQL nhưng không thể nói giá trị nào bằng giá trị nào
    //Đối với exception, chỉ có thể đo nó bằng câu hỏi có xuất hiện không
    //không dùng assertEquals()
    //trong thiết kế của hàm getFactorial() thì nếu đưa vào n<0 hoặc n>2
    //thì hàm ném ra, sẽ new 1 ngoại lệ
    //cứ đưa n vi phạm, nhận về ngoại lệ
    //nếu có ngoại lệ xảy khi đưa n vi phạm, HÀM CHẠY ĐÚNG
    //Sẽ có TEST CASE, tình huống TEST: xem có Ngoại Lệ xảy ra không.
    @Test(expected = IllegalArgumentException.class)
    public void testFactorialGivenWrongArgumentThrowsException(){
        MathUtility.getFactorial(-1);//phải xuất hiện Exception
        MathUtility.getFactorial(-10);//phải xuất hiện Exception
        MathUtility.getFactorial(21);//phải xuất hiện Exception
        MathUtility.getFactorial(40);//phải xuất hiện Exception
        
        //nếu xh Exception như kì vọng, XANH
        //vì mầu xanh ở đây hàm ý rằng hàm chạy như thiết kế
        
        //ra ĐỎ vì không có kì vọng
        //TA CẦN KĨ THUẬT ĐỂ BẮT NGOẠI LỆ, ĐÚNG NGOẠI LỆ CẦN BẮT XUẤT HIỆN THÌ XANH
    }
}

//QUY ƯỚC XANH: Nếu tất cả các lời gọi hàm getFactorial() đều trả về giá trị như kì vọng,
// nói cách khác tất cả các hàm asertEquals() đều so sánh khớp expected với actual
// thì có màu xanh.

//XANH: KHI TẤT CẢ CÁC TÌNH HUỐNG TES HÀM ĐỀU CHẠY ĐÚNG
//ĐỎ: CHỈ CẦN MỘT CÁI SAI COI NHƯ TẤT CẢ SAI

//LÝ DO: đã test hàm thì phải đúng cho tất cả các tình huống.
//Không chơi trò: hầu hết hàm đúng, lâu lâu mới sai

//Nếu báo ĐỎ không cho Clean and Build
//Cần JUnit + 