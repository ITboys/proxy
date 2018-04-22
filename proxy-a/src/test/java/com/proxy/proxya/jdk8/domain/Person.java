/**
 * @copyright remark holdings
 */
package com.proxy.proxya.jdk8.domain;

import lombok.Data;

/**
 * @author kobe_t
 * @date 2018/4/10 9:35
 */
@Data
public class Person {

    /**
     * 名字
     */
    private String name;

    /**
     * 年龄
     */
    private int age;

    /**
     * 性别
     */
    private int sex;

    public Person(String name, Integer age, Integer sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}
