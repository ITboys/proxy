/**
 * @copyright remark holdings
 */
package com.proxy.proxya.design.decorate;

/**
 * @author kobe_t
 * @date 2018/2/18 22:40
 */
public class Mocha extends CondimentDector {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + .20;
    }
}
