/**
 * Copyright (C), 2020-2021, XXX有限公司
 * FileName: User
 * Author:   apple
 * Date:     2021/1/4 下午7:17
 * Description: 模拟发红包
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package blackhose.day02;

/**
 * 【一句话功能简述:】模拟发红包，主要练习的是继承相关的知识点
 * @author apple
 * @create 2021/1/4
 * @since 2020.1.4
 */

//定义用户类
public class User {
    //成员变量
    private String name;//姓名
    private int money;//余额，当前用户的钱数

    //构造方法
    public User(){}
    public User(String name,int money){
        this.name=name;
        this.money=money;
    }

    //展示一下当前用户有多少钱，定义一个show方法
    public void show(){

        System.out.println("我叫："+name+",我有多少钱："+money);
    }

    // get/set方法
    public String getname() {
        return name;
    }

    public void setname(String username) {
        this.name = name;
    }

    public double getmoney() {
        return money;
    }

    public void setmoney(double leftMoney) {
        this.money = money;
    }
}