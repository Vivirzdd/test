/**
 * Copyright (C), 2020-2021, XXX有限公司
 * FileName: AbstractIterface
 * Author:   apple
 * Date:     2021/1/4 下午10:18
 * Description: 接口中抽象方法的使用
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package blackhose.day03;

/**
 * 【一句话功能简述:】接口中抽象方法的使用
 * @author apple
 * @create 2021/1/4
 * @since 2020.1.4
 */

public class AbstractIterface {
    //定义接口
    public interface LiveAble {
        // 定义抽象方法
        public abstract void eat();
        public abstract void sleep();
    }

    //定义实现类
    static class Animal implements LiveAble {
        @Override
        public void eat() {
            System.out.println("吃东西");
        }

        @Override
        public void sleep() {
            System.out.println("晚上睡");
        }

    }
    public static void main(String[] args) {
        // 创建子类对象
        Animal a = new Animal();
        // 调用实现后的方法
        a.eat();
        a.sleep();
        }
}

