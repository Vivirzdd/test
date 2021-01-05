/**
 * Copyright (C), 2020-2021, XXX有限公司
 * FileName: Mouse
 * Author:   apple
 * Date:     2021/1/4 下午11:19
 * Description: 定义鼠标类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package blackhose.day02.laptop;

/**
 * 【一句话功能简述:】定义鼠标类
 * @author apple
 * @create 2021/1/4
 * @since 2020.1.4
 */

class Mouse implements USB {
    public void open() {
        System.out.println("鼠标开启，红灯闪一闪");
    }
    public void close() {
        System.out.println("鼠标关闭，红灯熄灭");
    }
    public void click(){
        System.out.println("鼠标单击");
    }
}