/**
 * Copyright (C), 2020-2021, XXX有限公司
 * FileName: RandomGuessGame
 * Author:   apple
 * Date:     2021/1/2 下午10:37
 * Description: 猜字游戏
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

/**
 * 【一句话功能简述:】猜字游戏
 * @author apple
 * @create 2021/1/2
 * @since 2020.1.4
 */
import java.util.Random;
import java.util.Scanner;

public class RandomGuessGame {
    public static void main(String[] args){
        Random r = new Random();
        int number = r.nextInt(100)+1;
        while (true){
            System.out.println("请输入一个1～100的数：");
            Scanner sc = new Scanner(System.in);
            int gn = sc.nextInt();
            if (number>gn){
                System.out.println("猜大了，再往小一点猜！");
            }
            else if (number<gn){
                System.out.println("猜小了，再往大一点猜！");
            }
            else{
                System.out.println("恭喜你猜对了！");
            }
        }
    }
}