/**
 * Copyright (C), 2020-2021, XXX有限公司
 * FileName: DataChange
 * Author:   apple
 * Date:     2021/1/1 上午8:44
 * Description: 数据类型的转换和运算
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

/**
 * 【一句话功能简述:】数据类型的转换、运算、方法调用
 * @author apple
 * @create 2021/1/1
 * @since 2020.1.4
 */

public class DataChange {

    public static void main(String args[]){

        int i = 1;
        byte b = 2;
       // byte x = i+b;//会报错
        //将取值范围小的类型 自动提升为 取值范围大的类型,byte、short、char 运算时直接提升为 int 。
        int j = b+i;
        System.out.println(j);

        /*扩展运算符
        b=b+1进行两次运算 ，+=是一个运算符，只运算一次，并带有强制转换的特点，
        也就是说 b+= 1 就是 b = (short)(b + 1) ，因此程序没有问题编译通过，运行结果是2.
         */
        b+=1;
        System.out.println(b);

        //将 取值范围大的类型 强制转换成 取值范围小的类型 。
        //s定义为最大的数值
        short s = 32767;
        //s = s+1;//会报错，因为1是int形，做运算之后s会自动提升为int型
        // 运算后，强制转换，砍掉2个字节后会出现不确定的结果
        s = (short)(s+1);
        System.out.println(s);

        //方法调用
        methodName();
    }
    //方法定义注意事项：1、方法必须定义在一类中方法外；2、方法不能定义在另一个方法的里面。
    static void methodName(){
        //尝试了在方法里面定义一个方法，行不通，只有在类里面定义方法，在main方法中调用方法，才会得到想要的那个结果。
        System.out.println("这是b被main方法调用的一个方法！");

        /*
        常量和变量之间注意的事项：
        1、b3 = 1 + 2 ， 1 和 2 是常量，为固定不变的数据，在编译的时候（编译器javac），已经确定了 1+2 的结果并没 有超过byte类型的取值范围，
        可以赋值给变量 b3 ，因此 b3=1 + 2 是正确的。
        2、b4 = b2 + b3 ， b2 和 b3 是变量，变量的值是可能变化的，在编译的时候，编译器javac不确定b2+b3的结果是什 么，因此会将结果以int类
        型进行处理，所以int类型不能赋值给byte类型，因此编译失败。
         */
        byte b1=1;
        byte b2=2;
        byte b3=1 + 2;
       // byte b4=b1 + b2;
        System.out.println(b3);
       // System.out.println(b4);
    }
}