/**
 * Copyright (C), 2020-2021, XXX有限公司
 * FileName: ArrayMax
 * Author:   apple
 * Date:     2021/1/4 下午11:46
 * Description: 用函数接口来求出数组里面的最大值
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package blackhose.day03;

/**
 * 【一句话功能简述:】用函数接口来求出数组里面的最大值
 * @author apple
 * @create 2021/1/4
 * @since 2020.1.4
 */
import java.util.function.Supplier;
public class ArrayMax {
    //定一个方法,方法的参数传递Supplier,泛型使用Integer
    public static int getMax(Supplier<Integer> sup){
        return sup.get();
    }
    public static void main(String[] args) {
        int arr[] = {2,3,4,52,333,23};
        //调用getMax方法,参数传递Lambda
        int maxNum = getMax(new Supplier<Integer>() {
            @Override
            public Integer get() {
                //计算数组的最大值
                int max = arr[0];
                for (int i : arr) {
                    if (i > max) {
                        max = i;
                    }
                }
                return max;
            }
        });
        System.out.println(maxNum);
    }
}

