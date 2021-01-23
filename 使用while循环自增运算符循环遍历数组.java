package D_with_L_Forever;

public class 使用while循环自增运算符循环遍历数组 {
    public static void main(String[] args) {
        String[] array = new String[]{"白鹭","黄鹂","鹦鹉","乌鸦","喜鹊","布谷鸟","斑鸠","百灵鸟"};
        int index = 0;
        while (index < array.length){
            System.out.println(array[index++]);   /**自增索引值   减少代码行数量   */
            //index++;
        }
    }
}
