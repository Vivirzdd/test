/**
 * Copyright (C), 2020-2021, XXX有限公司
 * FileName: KeyBoard
 * Author:   apple
 * Date:     2021/1/4 下午11:17
 * Description: 定义键盘类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package blackhose.day02.laptop;

/**
 * 【一句话功能简述:】定义键盘类
 * @author apple
 * @create 2021/1/4
 * @since 2020.1.4
 */

class KeyBoard implements USB {
    public void open() {
        System.out.println("键盘开启，绿灯闪一闪");
    }
    public void close() {
        System.out.println("键盘关闭，绿灯熄灭");
    }
    public void type(){
        System.out.println("键盘打字");
    }
}