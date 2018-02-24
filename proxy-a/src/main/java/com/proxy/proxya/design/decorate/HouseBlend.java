/**
 * @copyright remark holdings
 */
package com.proxy.proxya.design.decorate;

/**
 * @author kobe_t
 * @date 2018/2/18 22:37
 */
public class HouseBlend extends Beverage {
    @Override
    public double cost() {
        return .89;
    }

    public HouseBlend() {
        description = "HouseBlend";
    }
}
