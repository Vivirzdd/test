/**
 * Copyright (C), 2020-2021, XXX有限公司
 * FileName: ArrayListTest
 * Author:   apple
 * Date:     2021/1/4 下午2:07
 * Description: 集合练习
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package blackhose.day03;
import java.util.Random;
import java.util.ArrayList;

/**
 * 【一句话功能简述:】集合练习,数值添加到集合
 * @author apple
 * @create 2021/1/4
 * @since 2020.1.4
 */

public class ArrayListTest {
    public static void main(String[] args){
        // 创建Random 对象
        Random random = new Random();
        // 创建ArrayList 对象
        ArrayList<Integer> list = new ArrayList<Integer>();
        // 添加随机数到集合
        for (int i = 0; i < 6; i++) {
            int r = random.nextInt(33) + 1;
            list.add(r); }
        // 遍历集合输出
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
         }
    }

}