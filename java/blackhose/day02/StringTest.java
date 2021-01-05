/**
 * Copyright (C), 2020-2021, XXX有限公司
 * FileName: StringTest
 * Author:   apple
 * Date:     2021/1/4 下午5:22
 * Description: 键盘录入一个字符，统计字符串中大小写字母及数字字符个数
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package blackhose.day02;
import java.util.Scanner;
import java.lang.String;

/**
 * 【一句话功能简述:】键盘录入一个字符，统计字符串中大小写字母及数字字符个数
 * @author apple
 * @create 2021/1/4
 * @since 2020.1.4
 */

public class StringTest {
    public static void main (String[] args){
        //完成键盘录入字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一串字符：");
        String st = sc.nextLine();

        //定义三个统计变量，并初始化
        int bigcharnumber = 0;
        int smallcharnumber = 0;
        int digitnumber = 0;

        //遍历字符串，得到字符
        for(int x=0; x<st.length(); x++) {
            char ch = st.charAt(x);
            //对字符进行判断
            if (ch>='A'&&ch<='Z'){
                bigcharnumber++;
            }
            else if (ch>='a'&&ch<='z'){
                smallcharnumber++;
            }
            else if (ch>='0'&&ch<='9'){
                digitnumber++;
            }
            else {
                System.out.println(ch+"是输入非法字符！");
            }
        }

        //输出结果
        System.out.println("输入的大写字符个数为："+bigcharnumber);
        System.out.println("输入的小写字符个数为："+smallcharnumber);
        System.out.println("输入的数字个数为："+digitnumber);
    }
}