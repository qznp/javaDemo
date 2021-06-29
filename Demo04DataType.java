/*
 * @Descripttion: 数据类型转换
 * @Author: yanyan
 * @Date: 2021-06-29 11:07:33
 * @LastEditTime: 2021-06-29 11:15:14
 */
 /**
 自动类型转换：（隐式）
    1、特点：代码不需要进行特殊处理，自动完成
    2、规划：数据范围从小到大
 强制类型转换：
  */
public class Demo04DataType {
  public static void main(String[] args) {
    // int --> long
    long num1 = 100;
    System.out.println(num1);

    // float --> double
    double num2 = 2.5;
    System.out.println(num2);

    // long --> float
    float num3 = 30L;
    System.out.println(num3);
  }
}