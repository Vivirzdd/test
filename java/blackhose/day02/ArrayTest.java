/**
 * Copyright (C), 2020-2021, XXX有限公司
 * FileName: ArrayTest
 * Author:   apple
 * Date:     2021/1/4 下午5:58
 * Description: 请使用 Arrays 相关的API，将一个随机字符串中的所有字符升序排列，并倒序打印。
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package blackhose.day02;

/**
 * 【一句话功能简述:】使用 Arrays 相关的API，将一个随机字符串中的所有字符升序排列，并倒序打印。
 * @author apple
 * @create 2021/1/4
 * @since 2020.1.4
 */
import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        // 定义随机的字符串
        String line = "ysKUreaytWTRHsgFdSAoidq";
        // 转换为字符数组
        char[] chars = line.toCharArray();
        // 升序排序
        Arrays.sort(chars);
        // 反向遍历打印
        for (int i = chars.length-1; i >= 0 ; i--) {
            System.out.print(chars[i]+" ");// y y t s s r q o i g e d d a W U T S R K H F A
            }
    }
}