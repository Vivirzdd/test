/**
 * Copyright (C), 2020-2021, XXX有限公司
 * FileName: Scanner0
 * Author:   apple
 * Date:     2021/1/2 下午5:01
 * Description: 键盘输入
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

/**
 * 【一句话功能简述:】键盘输入
 * @author apple
 * @create 2021/1/2
 * @since 2020.1.4
 */
import java.util.Scanner;
public class Scanner0 {
    public static void main(String args[]){
        Scanner cp = new Scanner(System.in);//System.in表示从键盘上输入
        // int i = sc.nextInt();
        // int j = sc.nextInt();
        //int s=i+j;
       //System.out.println("i+j="+s);

        System.out.println("请输入第一个数：");
        int i = cp.nextInt();
        System.out.println("请输入第二个数：");
        int j = cp.nextInt();
        System.out.println("请输入第三个数：");
        int k = cp.nextInt();
        //      求最值
        int temp = (i>j ? i:j);
        /*
        1、注意三目后面两个值的顺序，因为第一次写的时候储出错了[其实是表明自己是没有理解的]
        2、三目的表达式自己还不是很清楚，也就是前面真的就是过一遍
         */
        int max = (k > temp ? k:temp);
        System.out.println("输入的最大值为："+max);
    }
}