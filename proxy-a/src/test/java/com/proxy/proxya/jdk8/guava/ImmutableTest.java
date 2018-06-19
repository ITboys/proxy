/**
 * @copyright remark holdings
 */
package com.proxy.proxya.jdk8.guava;

import com.google.common.collect.*;
import com.proxy.proxya.jdk8.domain.Person;
import org.junit.Test;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.*;

/**
 * @author kobe_t
 * @date 2018/6/11 19:31
 */
public class ImmutableTest {

    @Test
    public void jdkTest() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println("list" + list);

        List<String> unmodifiableList = Collections.unmodifiableList(list);
        System.out.println(unmodifiableList);

        List<String> unmodifiableList1 = Collections.unmodifiableList(Arrays.asList("a", "b", "c"));
        System.out.println(unmodifiableList1);

        // 源数组修改
        list.add("baby");
        System.out.println("list add a item after list:" + list);
        System.out.println("list add a item after unmodifiableList:" + unmodifiableList);

        // 不可变数组修改
        unmodifiableList.add("dd");
        System.out.println("unmodifiableList add a item after list:" + unmodifiableList);

        unmodifiableList1.add("cc");
        System.out.println("unmodifiableList add a item after list:" + unmodifiableList1);


    }

    @Test
    public void guavaTest() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        // 不可变list
        ImmutableList coList = ImmutableList.copyOf(list);

        list.add("d");
        System.out.println("list add a item after list:" + list);
        System.out.println("list add a item after immutableList:" + coList);

        ImmutableList<String> ofList = ImmutableList.of("a", "b", "c");
        System.out.println("ofList:" + ofList);

        ImmutableSet immutableSet = ImmutableSet.of("a", "b", "c", "a");
        System.out.println("immutableSet:" + immutableSet);

        ImmutableSet<Person> personImmutableSet = ImmutableSet.<Person>builder().add(new Person("tw", 25, 1))
                .add(new Person("kobe", 40, 2)).build();
        System.out.println(personImmutableSet);

        // 不可变
//        personImmutableSet.add(new Person("test", 30, 3));

        ImmutableList personList = personImmutableSet.asList();
        System.out.println(personList);

        ImmutableMap<String, String> immutableMap = ImmutableMap.of("a", "b", "cd", "ef");
        ImmutableMap<String, String> immutableMap2 = ImmutableMap.<String, String>builder().put("q", "p").build();
        System.out.println(immutableMap);
        System.out.println(immutableMap2);

        // Multiset
        Multiset<String> multiset = HashMultiset.create();
        multiset.add("a");
        multiset.add("b");
        multiset.add("a");
        multiset.add("a");
        System.out.println("multiset:" + multiset);

        // 不重复元素
        Set<String> set = multiset.elementSet();
        System.out.println("Multiset 中不重复元素的集合：" + set);

        int countA = multiset.count("b");
        System.out.println("给定元素在 Multiset 中的计数:" + countA);

        multiset.entrySet().forEach(entry -> {
            System.out.println("返回Multiset中的元素：" + entry.getElement() + ",元素在 Multiset 中的计数:" + entry.getCount());
        });

        System.out.println("所有元素个数：" + multiset.size() + ", 不重复元素个数：" + multiset.elementSet().size());

        // BiMap
        BiMap<String, String> biMap = HashBiMap.create();
        biMap.put("a", "1");
        biMap.put("b", "2");
        biMap.put("c", "3");
        biMap.put("d", "4");
        biMap.put("d", "5");
        // 不能插入重复值
        // biMap.put("e", "5");
        biMap.put("f", null);
        // 可以存储null
        biMap.put(null, "6");

        System.out.println("biMap：" + biMap);
        // 反转映射
        BiMap<String, String> inverseBiMap = biMap.inverse();
        // 根据val获取key
        System.out.println("根据val反射映射获取key：" + inverseBiMap.get("1"));


    }
}
