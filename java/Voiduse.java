/**
 * Copyright (C), 2020-2021, XXX有限公司
 * FileName: Voiduse
 * Author:   apple
 * Date:     2021/1/2 下午1:29
 * Description: 没有返回值的调用
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

/**
 * 【一句话功能简述:】没有返回值的调用
 * @author apple
 * @create 2021/1/2
 * @since 2020.1.4
 */

public class Voiduse {
    public static void main(String[] args) {
        //调用方法，接收数组的返回值
        // 接收到的是数组的内存地址
        int[] arr = getArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    //创建方法，返回值是数组类型 return返回数组的地址 */
    public static int[] getArray() {
    //public static void getArray(){
        int[] arr = {1, 3, 5, 7, 9};
        //返回数组的地址，返回到调用者
        return arr;
    }
}