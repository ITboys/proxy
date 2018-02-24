/**
 * @copyright remark holdings
 */
package com.proxy.proxya.design.decorate;

/**
 * @author kobe_t
 * @date 2018/2/18 21:09
 */
public abstract class Beverage {

    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    /**
     * 计费
     *
     * @return
     */
    public abstract double cost();
}
