/**
 * Copyright (C), 2020-2021, XXX有限公司
 * FileName: Noname
 * Author:   apple
 * Date:     2021/1/2 下午7:10
 * Description: 匿名对象
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

/**
 * 【一句话功能简述:】匿名对象
 * @author apple
 * @create 2021/1/2
 * @since 2020.1.4
 */
import java.util.Scanner;
public class Noname {
    public static void main(String args[]){
        /*
        1、匿名对象可以直接使用，但是最好只使用一次，对于下方的程序，它其实是会造成浪费的
         */
       int a = new Scanner(System.in).nextInt();
       int b = new Scanner(System.in).nextInt();
        System.out.println("测试是否有结果，a="+a);
        System.out.println("测试是否有结果，b="+b);
    }

}