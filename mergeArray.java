package BT_Gop2Mang_Java;

import java.util.Arrays;
import java.util.Random;

public class mergeArray {
    public static void main(String[] args) {
        // khởi tạo mảng
        int []array1=new int[10];
        int[]array2=new int[10];
        int[]array3=new int[array1.length+array2.length];
        Random random=new Random();
        for (int i=0;i<array1.length;i++){
            array1[i]=random.nextInt(50)-20;
            array3[i]=array1[i];
            array2[i]=random.nextInt(10)-10;
            array3[array1.length+i]=array2[i];
        }
        System.out.println("array1 : "+ Arrays.toString(array1));
        System.out.println("array2 : "+ Arrays.toString(array2));
        System.out.println("array3 : "+Arrays.toString(array3));
        // khởi tạo mảng thứ 3 có kích thước bằng 2 mảng đầu:
    }
    // tạo 1 phương thức cộng mảng
}
