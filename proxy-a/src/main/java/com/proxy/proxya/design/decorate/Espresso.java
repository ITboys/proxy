/**
 * @copyright remark holdings
 */
package com.proxy.proxya.design.decorate;

/**
 * @author kobe_t
 * @date 2018/2/18 22:35
 */
public class Espresso extends Beverage {
    @Override
    public double cost() {
        return 1.99;
    }

    public Espresso() {
        description = "Espresso";
    }

}
