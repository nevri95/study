package com.polymor;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * @author Nevri on 2021/4/5
 * @Title:
 * @Description:
 */
public class PolymorTest {

    public static void main(String[] args) {
        //此类 根据入参判断返回不同实例(但同父类)
        Factory factory = new Factory();
        //实例化调用方法类
        Report report = new Report();
        //返回偏向实例化子类父类调用方法 由于运行期 为子类 则重写方法生效
        report.rep(factory.function("C"));
    }
}
