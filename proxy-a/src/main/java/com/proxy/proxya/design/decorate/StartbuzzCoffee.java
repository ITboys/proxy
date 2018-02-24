/**
 * @copyright remark holdings
 */
package com.proxy.proxya.design.decorate;

/**
 * @author kobe_t
 * @date 2018/2/18 22:45
 */
public class StartbuzzCoffee {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.description + " $" + beverage.cost());

        Beverage beverage1 = new HouseBlend();
        beverage1 = new Mocha(beverage1);

        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());
    }
}
