/**
 * @copyright remark holdings
 */
package com.proxy.proxya.design.template;

/**
 * @author kobe_t
 * @date 2018/2/15 22:22
 */
public class Tea2  {

    /**
     * 泡茶
     */
    void prepareRecipe() {
        SteepingToBag();
        addLemon();
    }



    /**
     * 将茶叶浸泡
     */
    public void SteepingToBag() {
        System.out.println("Steeping the tea");
    }

    /**
     * 加柠檬
     */
    public void addLemon() {
        System.out.println("Adding lemon");
    }
}
