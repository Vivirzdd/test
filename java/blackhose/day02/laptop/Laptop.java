/**
 * Copyright (C), 2020-2021, XXX有限公司
 * FileName: Laptop
 * Author:   apple
 * Date:     2021/1/4 下午11:14
 * Description: 定义笔记本类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package blackhose.day02.laptop;

/**
 * 【一句话功能简述:】定义笔记本类
 * @author apple
 * @create 2021/1/4
 * @since 2020.1.4
 */

class Laptop {
    // 笔记本开启运行功能
    public void run() {
        System.out.println("笔记本运行");
    }
    // 笔记本使用usb设备，这时当笔记本对象调用这个功能时，必须给其传递一个符合USB规则的USB设备
    public void useUSB(USB usb) {
        // 判断是否有USB设备
        if (usb != null) {
            usb.open();
            // 类型转换,调用特有方法
            if(usb instanceof Mouse){
                Mouse m =(Mouse)usb;
                m.click();
            }
            else if (usb instanceof KeyBoard){
                KeyBoard kb = (KeyBoard)usb; kb.type();
            }
            usb.close();
        }
    }public void shutDown() {
        System.out.println("笔记本关闭");
    }
}
