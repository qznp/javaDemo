/*
 * @Descripttion: 变量：程序运行期间，内容可以发生改变的量
 * @Author: yanyan
 * @Date: 2021-06-29 10:36:05
 * @LastEditTime: 2021-06-29 10:53:04
 */
/**
创建一个变量并且使用的格式
数据类型 变量名称; //创建一个变量
变量名称 = 数据值; //赋值

数据类型 变量名称 = 数据值;
*/
public class Demo02Variable {
  public static void main(String[] args) {
    // 创建一个变量
    int num1;
    // 赋值
    num1 = 10;
    System.out.println(num1);
    num1 = 20;
    System.out.println(num1);

    // 一步到位赋值
    int num2 = 30;
    System.out.println(num2);

    // 注意：右侧数值的范围不能超过左侧数据类型的取值范围
    byte num3 = 40;
    System.out.println(num3);
    // 右侧超出了byte数据类型，错误
    // byte num4 = 4000;
    // System.out.println(num4);

    short num5 = 50;
    System.out.println(num5);

    long num6 = 10000000000000L;
    System.out.println(num6);

    float num7 = 2.5F;
    System.out.println(num7);

    double num8 = 1.2;
    System.out.println(num8);

    char zifu1 = 'a';
    System.out.println(zifu1);
    zifu1 = '中';
    System.out.println(zifu1);

    boolean var1 = true;
    System.out.println(var1);

    boolean var2 = var1;
    System.out.println(var2);
  }
}
