/**
 * @copyright remark holdings
 */
package com.proxy.proxya.design.template;

/**
 * @author kobe_t
 * @date 2018/2/15 22:12
 */
public class Coffee2 {

    void prepareRecipe() {
        boilWater();
        pourInCup();
        brewCofferGrinds();
        addSugarAndMilk();
    }


    /**
     * 烧水
     */
    public void boilWater() {
        System.out.println("Boiling water");
    }

    /**
     * 将开水倒进杯子
     */
    public void pourInCup() {
        System.out.println("pour water into a Cup");
    }

    /**
     * 把咖啡倒进杯子
     */
    public void brewCofferGrinds() {
        System.out.println("Dripping Coffee through filter");
    }

    /**
     * 加糖和牛奶
     */
    public void addSugarAndMilk() {
        System.out.println("Adding sugar and milk");
    }


}
