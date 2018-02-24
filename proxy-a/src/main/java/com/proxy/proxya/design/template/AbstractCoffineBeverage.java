/**
 * @copyright remark holdings
 */
package com.proxy.proxya.design.template;

/**
 * @author kobe_t
 * @date 2018/2/15 22:33
 */
public abstract class AbstractCoffineBeverage {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();

    }

    final void boilWater() {
        System.out.println("Boiling water");
    }

    final void pourInCup() {
        System.out.println("pour water into a Cup");
    }

    public void hook() {

    }

    public abstract void brew();

    public abstract void addCondiments();
}
