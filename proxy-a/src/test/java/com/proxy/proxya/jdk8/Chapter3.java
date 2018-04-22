package com.proxy.proxya.jdk8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

import com.proxy.proxya.jdk8.domain.Person;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Chapter3 {

	@Test
	public void test() {

		// 数据并行化处理
		// 学生集合
//		Person kobe = new Person("kobe", 40, 1);
//		Person jordan = new Person("jordan", 50, 1);
//		Person mess = new Person("mess", 20, 2);
		List<Person> personList = new ArrayList<>(1000000);
		for(int i=0,j=1000000;i<j;i++) {
			int sex = i % 2;
			Person p = new Person(String.valueOf(i), i, sex);
			personList.add(p);
		}
		
		long beginTime = System.currentTimeMillis();
		
		// 原来的方式
        List<Person> oldBoys = new ArrayList<>(personList.size());
        for (Person p : personList) {
            // 性别男
            if (p.getSex() == 1) {
                oldBoys.add(p);
            }
        }
        long endTime = System.currentTimeMillis();
        log.info("原来的方式 take time:" + (endTime - beginTime));
        
//        beginTime = System.currentTimeMillis();
//		// 流方式：找出所有男同学
//		List<Person> newBoys = personList.stream()
//				.filter(p -> 1 == p.getSex())
//				.collect(Collectors.toList());
//		
//		endTime = System.currentTimeMillis();
//		log.info("流方式 take time:" + (endTime - beginTime));
		

        beginTime = System.currentTimeMillis();
		// 流方式：找出所有男同学
		List<Person> parallelBoys = personList.parallelStream()
				.filter(p -> 1 == p.getSex())
				.collect(Collectors.toList());
		
		endTime = System.currentTimeMillis();
		log.info("并行流方式 take time:" + (endTime - beginTime));
	}

}
