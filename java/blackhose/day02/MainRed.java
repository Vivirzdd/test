/**
 * Copyright (C), 2020-2021, XXX有限公司
 * FileName: MainRed
 * Author:   apple
 * Date:     2021/1/4 下午8:48
 * Description: 测试类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package blackhose.day02;

import java.util.ArrayList;

/**
 * 【一句话功能简述:】测试类
 * @author apple
 * @create 2021/1/4
 * @since 2020.1.4
 */

public class MainRed {
    //psvm快捷键
    public static void main(String[] args) {
        Manager manager = new Manager("群主",100);

        Menber one = new Menber("成员A",0);
        Menber two = new Menber("成员B",0);
        Menber three = new Menber("成员C",0);
        Menber four = new Menber("成员D",0);

        manager.show();

        one.show();
        two.show();
        three.show();
        four.show();

        System.out.println("===================================");
        //群主共法21个红包，分成4个
        ArrayList<Integer> redList = manager.send(22,4);

        //四个普通成员收红包
        one.receive(redList);
        two.receive(redList);
        three.receive(redList);
        four.receive(redList);

        manager.show();//这里是少类了的
        //随机分给这四个人
        one.show();
        two.show();
        three.show();
        four.show();
    }
}