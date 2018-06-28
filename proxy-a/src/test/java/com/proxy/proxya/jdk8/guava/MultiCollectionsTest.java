/**
 * @copyright remark holdings
 */
package com.proxy.proxya.jdk8.guava;

import com.google.common.collect.*;
import org.apache.commons.collections.MultiMap;
import org.junit.Test;

import java.util.*;

/**
 * @author kobe_t
 * @date 2018/6/28 15:20
 */
public class MultiCollectionsTest {

    @Test
    public void test() {
        // Multimap
        // 用于处理类似的：Map<K, List> 或 Map<K, Set>结构
        Multimap<String, String> arrayListMultimap = ArrayListMultimap.create();
        arrayListMultimap.putAll("1", Arrays.asList("a", "b"));
        arrayListMultimap.putAll("2", Arrays.asList("cd", "ef"));
        arrayListMultimap.putAll("3", Arrays.asList("ghi", "lmn"));
        // 添加重复key,会把值合并
        arrayListMultimap.putAll("3", Arrays.asList("ooo", "ppp"));

        // 输出集合
        System.out.println(arrayListMultimap);

        // 根据key获取对象，返回一个list
        System.out.println(arrayListMultimap.get("1"));
        // key不存在,返回空集合
        System.out.println(arrayListMultimap.get("4"));

        // 返回视图
        Map<String, Collection<String>> viewMap = arrayListMultimap.asMap();
        viewMap.entrySet()
                .stream()
                .forEach(entry ->
                        System.out.println("key:" + entry.getKey() + ",values:" + entry.getValue())
                );

        // 移除key=1,对应的值a
        if (arrayListMultimap.remove("1", "a")) {
            System.out.println("移除key对应的值成功!");
            System.out.println("移除之后的元素：" + arrayListMultimap);
        }

        // 获取所有key
        Multiset keys = arrayListMultimap.keys();
        System.out.println("所有的key:" + keys);

        System.out.println("如果元素不存在，则移除元素失败：" + arrayListMultimap.remove("1", "c"));

        // 获取所有的键值,包括重复值
        Collection<Map.Entry<String, String>> entries = arrayListMultimap.entries();
        entries.stream().forEach(entry ->
                System.out.println("键值对:" + entry.getKey() + "," + entry.getValue())
        );

        // 获取所有的键值,没有重复值
        Set<String> singleKeys = arrayListMultimap.asMap().keySet();
        singleKeys.stream()
                .forEach(key ->
                        System.out.println("不重复键值：" + key));

        // 不可变的Multimap
        ImmutableListMultimap<String, String> immutableListMultimap = new ImmutableListMultimap.Builder<String, String>()
                .put("1", "a")
                .putAll("2", "bc", "ef")
                .putAll("3", Arrays.asList("ghi", "lmn")).build();
        System.out.println(immutableListMultimap);
    }
}
