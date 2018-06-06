/**
 * @copyright remark holdings
 */
package com.proxy.proxya.jdk8;

import com.proxy.proxya.jdk8.domain.Person;
import com.proxy.proxya.jdk8.domain.Teacher;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author kobe_t
 * @date 2018/4/10 9:23
 */
@Slf4j
public class Chapter2 {

    @Test
    public void test() {
        // 学生集合
        Person kobe = new Person("kobe", 40, 1);
        Person jordan = new Person("jordan", 50, 1);
        Person mess = new Person("mess", 20, 2);
        List<Person> personList = Arrays.asList(kobe, jordan, mess);

        // 找出所有男同学
        // 原来的方式
        List<Person> oldBoys = new ArrayList<>(personList.size());
        for (Person p : personList) {
            // 性别男
            if (p.getSex() == 1) {
                oldBoys.add(p);
            }
        }
        log.info(oldBoys.toString());

        // 流方式
        List<Person> newBoys = personList.stream().filter(p -> 1 == p.getSex()).collect(Collectors.toList());
        log.info(newBoys.toString());

        // 所有男同学按年龄排序
        List<Person> sortedBoys = personList.stream()
                // 筛选出男同学
                .filter(p -> 1 == p.getSex())
                // 排序
                .sorted(Comparator.comparing(Person::getAge))
                .collect(Collectors.toList());

        // 男同学人数
        long boys = personList.stream()
                // 不为空
                .filter(p -> {
                    System.out.println("过滤非空的同学");
                    return !Objects.isNull(p);
                })
                // 筛选出男同学
                .filter(p -> {
                    System.out.println("筛选出男同学");
                    return 1 == p.getSex();
                })
                //                // 年龄大于20
                .filter(p -> {
                    System.out.println("年龄大于20");
                    return p.getAge() > 20;
                })
                .count();

        log.info("==============================");

        // 男同学人数
        long boys2 = personList.stream()
                // 不为空
                .filter(p -> {
                    System.out.println("筛选出男同学");
                    return 1 == p.getSex();
                }).filter(p -> {
                    System.out.println("筛选出男同学");
                    return 1 == p.getSex();
                })
                .count();


        // 获取学生的姓名
        List<String> names = new ArrayList<>(personList.size());
        for (Person p : personList) {
            names.add(p.getName());
        }

        // 获取学生的姓名
        List<String> personNames = personList.stream().map(Person::getName).collect(Collectors.toList());

        // 获取学生姓名，年龄信息
        Map<String, Integer> personMap = personList.stream()
                .collect(Collectors.toMap(Person::getName, Person::getAge));

        // 获取学生姓名，年龄信息，处理重复key:用新的key覆盖旧key
        Map<String, Integer> dulipcateMap = personList.stream()
                .collect(Collectors.toMap(Person::getName, Person::getAge, (o, n) -> n));

        // 转换成set
        Set<Person> set = personList.stream().collect(Collectors.toSet());

        // 将age>45的学生提拔成师父
        personList.stream().filter(p -> p.getAge()> 45).map(p -> {
            Teacher t = new Teacher();
            t.setName(p.getName());
            t.setAge(p.getAge());
            t.setSex(p.getSex());
            return t;
        }).collect(Collectors.toList());

    }
}
