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
public class Teacher {

    /**
     * 名字
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 性别
     */
    private Integer sex;

    public Teacher() {}

    public Teacher(String name, Integer age, Integer sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}
