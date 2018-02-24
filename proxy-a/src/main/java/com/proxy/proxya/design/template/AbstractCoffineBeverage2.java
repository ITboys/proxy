/**
 * @copyright remark holdings
 */
package com.proxy.proxya.design.template;

/**
 * @author kobe_t
 * @date 2018/2/15 22:33
 */
public abstract class AbstractCoffineBeverage2 {

    /**
     * 烧水
     */
    void boilWater() {
        System.out.println("Boiling water");
    }

    /**
     * 将开水倒进杯子
     */
    void pourInCup() {
        System.out.println("pour water into a Cup");
    }

    public abstract void brew();

    public abstract void addCondiments();


}
