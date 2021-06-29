/*
 * @Descripttion: 变量注意事项
 * @Author: yanyan
 * @Date: 2021-06-29 10:55:31
 * @LastEditTime: 2021-06-29 11:16:59
 */
/**
1、如果创建多个变量，那么变量之前的名称不可以重复
2、对于float和long类型来说，字母后缀F和L不要丢掉
3、如果使用byte或者short类型的变量，那么右侧数值不能超过左侧类型的范围
4、没有进行赋值的变量，不能直接使用，一定要赋值之后，才能使用
5、变量使用不能超过作用域的范围
【作用域】：从定义变量的一行开始，一直到使用所属的大括号结束为止
6、可以通过一个语句来创建多个变量，但是一般情况不推荐这么做
 */
 public class Demo03VariableNotice {
   public static void main(String[] args) {
    //  int num1;
    //  System.out.println(num1);

    // 先创建，后使用
    // System.out.println(num2);
    int num2 = 500;
    System.out.println(num2);
    {
      int num3 = 20;
      System.out.println(num3);
    }
    // 超出作用域，不能使用
    // System.out.println(num3);
   }
 }
