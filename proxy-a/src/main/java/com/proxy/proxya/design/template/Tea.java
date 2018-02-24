/**
 * @copyright remark holdings
 */
package com.proxy.proxya.design.template;

/**
 * @author kobe_t
 * @date 2018/2/15 22:22
 */
public class Tea extends AbstractCoffineBeverage {


    @Override
    public void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding lemon");
    }

    public static void main(String args[]){
        Tea tea = new Tea();
        tea.prepareRecipe();
        System.out.println();
    }
}
