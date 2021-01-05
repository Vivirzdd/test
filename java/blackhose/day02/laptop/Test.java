/**
 * Copyright (C), 2020-2021, XXX有限公司
 * FileName: Test
 * Author:   apple
 * Date:     2021/1/4 下午11:11
 * Description: 测试类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package blackhose.day02.laptop;

/**
 * 【一句话功能简述:】测试类
 * @author apple
 * @create 2021/1/4
 * @since 2020.1.4
 */

public class Test {
    public static void main(String[] args) {
        // 创建笔记本实体对象
        Laptop lt = new Laptop();

        // 笔记本开启
        lt.run();

        // 创建鼠标实体对象
        USB u = new Mouse();
        // 笔记本使用鼠标
        lt.useUSB(u);
        // 创建键盘实体对象
        KeyBoard kb = new KeyBoard();

        // 笔记本使用键盘
        lt.useUSB(kb);

        // 笔记本关闭
        lt.shutDown();
    }
}