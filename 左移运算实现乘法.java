package D_with_L_Forever;

import java.util.Scanner;

/**如果一个数左移运算n位，   相当于是乘以 2 的 n 次方*/

public class 左移运算实现乘法 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个整数： ");
        long number = scan.nextLong();
        System.out.println(number<<1);

        System.out.println(number<<2);

        System.out.println(number<<3);

        System.out.println(number<<4);
    }
}
