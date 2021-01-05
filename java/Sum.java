/**
 * Copyright (C), 2020-2021, XXX有限公司
 * FileName: Sum
 * Author:   apple
 * Date:     2021/1/2 上午9:10
 * Description: 计算1-100之间的奇数和
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

/**
 * 【一句话功能简述:】计算1-100之间的奇数和
 * @author apple
 * @create 2021/1/2
 * @since 2020.1.4
 */

public class Sum {

public static void main(String agrs[]){

    int sum = 0;
    int s = 0;
    for (int i = 1;i <= 100;i++){

        if (i%2 == 1){
            sum+=i;
        }
    }

    System.out.println("100以内的奇数和是："+sum);

    for (int j = 1;j<=100;j++){
      s+=j;
    }
    System.out.println(s);
}
}