package D_with_L_Forever;

import java.util.Scanner;

public class 使用异或加密字符串 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个英文字符串或解密字符串： ");
        String password = scan.nextLine();
        char[] array = password.toCharArray();
        for(int i=0; i<array.length; i++){
            array[i] = (char)(array[i]^20000);
        }
        System.out.println("加密结果如下： ");
        System.out.println(new String(array));   /*输出密钥**/
    }
}
