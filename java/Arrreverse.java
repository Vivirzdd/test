/**
 * Copyright (C), 2020-2021, XXX有限公司
 * FileName: Arrreverse
 * Author:   apple
 * Date:     2021/1/2 下午1:15
 * Description: 数组遍历和反转的使用【重】
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

/**
 * 【一句话功能简述:】数组遍历和反转的使用【重】
 * @author apple
 * @create 2021/1/2
 * @since 2020.1.4
 */
//这里的反转的思路就是从两端开始，然后进行数据的交换
public class Arrreverse {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };
        //循环中定义变量min=0最小索引 max=arr.length‐1最大索引 min++,max‐‐ */
        for (int min = 0,max = arr.length-1; min <= max; min++,max--){
            //利用第三方变量完成数组中的元素交换
            int temp = arr[min];
            arr[min] = arr[max];
            arr[max] = temp;
        }
        // 反转后，遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}