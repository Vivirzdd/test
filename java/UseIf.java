/**
 * Copyright (C), 2020-2021, XXX有限公司
 * FileName: UseIf
 * Author:   apple
 * Date:     2021/1/1 上午10:02
 * Description: if条件语句的使用
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

/**
 * 【一句话功能简述:】if条件语句的使用
 * @author apple
 * @create 2021/1/1
 * @since 2020.1.4
 */

public class UseIf {
    public static void main(String[] args) {
        //判断学生升级等级
        int score = 78;

        if(score<0 || score>100){
            System.out.println("你的成绩是错误的");
        }

        else if (score>=90 && score<=100) {
            System.out.println("你的成绩属于优秀");
        }

        else if(score>=80 && score<90) {
            System.out.println("你的成绩属于好");
        }

        else if(score>=70 && score<80) {
            System.out.println("你的成绩属于良");
        }

        else if(score>=60 && score<70) {
            System.out.println("你的成绩属于及格");
        }

        else {
                System.out.println("你的成绩属于不及格");
            }
    }
}
