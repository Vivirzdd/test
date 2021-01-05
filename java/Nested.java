/**
 * Copyright (C), 2020-2021, XXX有限公司
 * FileName: Nested
 * Author:   apple
 * Date:     2021/1/2 上午9:42
 * Description: 循环嵌套的使用
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

/**
 * 【一句话功能简述:】循环嵌套的使用，做一个三角形
 * @author apple
 * @create 2021/1/2
 * @since 2020.1.4
 */

public class Nested {
public static void main(String args[]){

    for (int i = 0;i <= 7;i++){
        //这里第一次并没有成功，后来是进行了位置的调整，所以才有这样能达到自己想要的那个结果！
        for (int k = 7-i;k > 0;k--){
            System.out.print(" ");
        }

        for (int j = 1;j <= 2*i+1;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}
}