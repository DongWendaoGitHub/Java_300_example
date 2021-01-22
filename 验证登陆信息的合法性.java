package D_with_L_Forever;

import java.util.Scanner;

public class 验证登陆信息的合法性 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入登陆信息： ");
        String username = scan.nextLine();
        System.out.println("请输入密码： ");
        String password = scan.nextLine();
        if(!username.equals("dwd")){
            System.out.println("用户名非法");
        }
        else if(!password.equals("lsp")){
            System.out.println("通往心里的密码错误");
        }
        else{
            System.out.println("宝宝，欢迎回家.");
        }

    }

}
