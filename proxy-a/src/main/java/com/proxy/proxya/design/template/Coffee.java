/**
 * @copyright remark holdings
 */
package com.proxy.proxya.design.template;

/**
 * @author kobe_t
 * @date 2018/2/15 22:12
 */
public class Coffee extends AbstractCoffineBeverage {

    @Override
    public void brew() {
        System.out.println("Dripping Coffee through filter");
    }


    @Override
    public void addCondiments() {
        System.out.println("Adding sugar and milk");
    }

    public static void main(String args[]){
        Coffee coffee = new Coffee();
        coffee.prepareRecipe();
    }

}
