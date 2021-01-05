/**
 * Copyright (C), 2020-2021, XXX有限公司
 * FileName: Arrtest
 * Author:   apple
 * Date:     2021/1/2 下午1:02
 * Description: 数组相关内容
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

/**
 * 【一句话功能简述:】数组相关内容
 * @author apple
 * @create 2021/1/2
 * @since 2020.1.4
 */


//两个数组在堆中用的是同一个内存
public class Arrtest {
    public static void main(String[] args) {
        // 定义数组，存储3个元素
        int[] arr = new int[3];
        //数组索引进行赋值
        arr[0] = 5;
        arr[1] = 6;
        arr[2] = 7;
        //输出3个索引上的元素值
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        //定义数组变量arr2，将arr的地址赋值给arr2
        int[] arr2 = arr;
        arr2[1] = 9;
        System.out.println(arr[1]);
    }
}