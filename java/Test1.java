/**
 * Copyright (C), 2020-2021, XXX有限公司
 * FileName: Test1
 * Author:   apple
 * Date:     2021/1/2 上午11:13
 * Description: 方法的定义与使用
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

/**
 * 【一句话功能简述:】方法的定义与使用
 * @author apple
 * @create 2021/1/2
 * @since 2020.1.4
 */

/*
比较两个整数是否相同
        分析：定义方法实现功能，需要有两个明确，即 返回值 和 参数列表 。
        明确返回值：比较整数，比较的结果只有两种可能，相同或不同，因此结果是布尔类型，比较的结果相 同为true。
        明确参数列表：比较的两个整数不确定，所以默认定义两个int类型的参数。
 */
public class Test1{

    public static void main(String args[]){

        boolean result=compare(3,8);
        System.out.println(result);
    }

    public static boolean compare(int a,int b){
        if (a == b) {
            return true;
        }
        else {
            return false;
        }
    }
}