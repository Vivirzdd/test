/**
 * Copyright (C), 2020-2021, XXX有限公司
 * FileName: Manager
 * Author:   apple
 * Date:     2021/1/4 下午8:14
 * Description: 群主管理类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package blackhose.day02;
import java.util.ArrayList;
/**
 * 【一句话功能简述:】群主管理类
 * @author apple
 * @create 2021/1/4
 * @since 2020.1.4
 */

//群主类
public class Manager extends User {
    //添加构造方法
    public Manager(){
        //一个默认构造，其实是有一个super（）方法的，默认赠送
    }

    //去调用父类的方法
    public Manager(String name,int money){
        super(name,money);
    }

    //发红包的方法
    public ArrayList<Integer> send(int money, int count){
        //这就是发红包的逻辑
        //首先需要一个集合来存放若干红包的金额
        ArrayList<Integer> redList = new ArrayList<Integer>();

        //首先看一些群主有多少钱
        int leftMoney = (int) super.getmoney();

        if (money>leftMoney){
            System.out.println("余额不足！");
        }

        //扣钱，其实就是重新设置余额
        super.setmoney(leftMoney-money);//这里就是剩下的钱

        //发红包，需要平均拆分成count份
        int avg = money / count;
        int mod = money % count;//余数，摔下的零头
        //剩下的零头，把它包在最后一个红包中。
        //把红包一个一个的放到集合当中
        for (int i = 0;i < count-1;i++){
            redList.add(avg);
            int last = avg+mod;
            redList.add(last);
        }
        return redList;
    }

}