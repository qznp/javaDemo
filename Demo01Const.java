/*
 * @Descripttion: 常量：固定不变的量
 * @Author: yanyan
 * @Date: 2021-06-28 16:44:14
 * @LastEditTime: 2021-06-28 16:56:59
 */
//  javac -encoding UTF-8 XXX.java  // 转义编码
// 常量的分类
// 1、字符串常量：凡是用双引号引起来的部分，叫做字符串常量，例如“abc”
// 2、整数常量：直接写上的数字，没有小数点，例如：100
// 3、浮点数常量：直接写上的数字，有小数点，例如：100.3
// 4、字符常量：凡是用单引号引起来的单个字符，例如：‘a’
// 5、布尔常量：true，false
// 6、空常量：null
public class Demo01Const {
  public static void main(String []args) {
    // 字符串常量
    System.out.println("ADB");
    System.out.println(""); //字符串两个双引号中间的内容为空
    System.out.println("XCV"); 

    // 整数常量
    System.out.println(30);
    System.out.println(-30);

    // 浮点数常量
    System.out.println(1.2);
    System.out.println(-1.2);

    // 字符常量
    System.out.println('A');
    // 两个单引号中间必须有且只有一个字符，没有不行
    // System.out.println('');
    // 两个单引号中间必须有且只有一个字符，有两个也不行
    // System.out.println('AB');

    // 布尔常量
    System.out.println(true);
    System.out.println(false);

    // 空常量，不能用来直接打印输出
    System.out.println(null);
  }
}