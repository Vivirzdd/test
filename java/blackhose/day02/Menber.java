/**
 * Copyright (C), 2020-2021, XXX有限公司
 * FileName: Menber
 * Author:   apple
 * Date:     2021/1/4 下午8:35
 * Description: 普通用户
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package blackhose.day02;

import java.util.ArrayList;
import java.util.Random;

/**
 * 【一句话功能简述:】普通用户
 * @author apple
 * @create 2021/1/4
 * @since 2020.1.4
 */

public class Menber extends User{
    public Menber(){}

    public Menber(String name,int money) {
        super(name, money);
    }

    public void receive(ArrayList<Integer> list){
        //从多个红包当中随便抽取一个给自己
        //随机获取集合当中的索引编号
        int index = new Random().nextInt(list.size());

        //根据索引，从集合当中删除，并得到被删除的红包给自己
       int delta = list.remove(index);
       //   当前成员自己本来有多少钱

        int money = (int)super.getmoney();
        //加法，并且重新设置回去

        super.setmoney(money+delta);
    }

}