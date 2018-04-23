package com.proxy.proxya.jdk8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

import com.proxy.proxya.jdk8.domain.Person;
import com.proxy.proxya.jdk8.domain.Teacher;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Chapter4 {

	@Test
	public void test() {

		// 学生集合
		List<Person> personList = new ArrayList<>(7000000);
		List<Person> linkedPersonList = new LinkedList<>();
		for (int i = 0, j = 7000000; i < j; i++) {
			int sex = i % 2;
			Person p = new Person(String.valueOf(i), i, sex);
			personList.add(p);
			linkedPersonList.add(p);
		}

		long beginTime2 = System.currentTimeMillis();
		// 流方式：年龄之和
		personList.parallelStream()
				.filter(p -> p.getSex() == 1 && p.getSex() %2 == 0)
				.map(p -> {
					return new Teacher(p.getName(), p.getAge(), p.getSex());
				})
				.collect(Collectors.toList());
		long endTime2 = System.currentTimeMillis();
		log.info("ArrayList方式 take time:" + (endTime2 - beginTime2));
		
		
		long beginTime = System.currentTimeMillis();
		// 流方式：年龄之和
		linkedPersonList.parallelStream()
				.filter(p -> p.getSex() == 1 && p.getSex() %2 == 0)
				.map(p -> {
					return new Teacher(p.getName(), p.getAge(), p.getSex());
				})
				.collect(Collectors.toList());
		long endTime = System.currentTimeMillis();
		log.info("LinkedList方式 take time:" + (endTime - beginTime));
		

//		teachers.clear();
//		long beginTime = System.currentTimeMillis();
//
//		// 原来的方式
//		for (Person p : personList) {
//			// 年龄之和
//			if (p.getSex() == 1 && p.getSex() %2 == 0) {
//				Teacher t = new Teacher(p.getName(), p.getAge(), p.getSex());
//				teachers.add(t);
//			}
//		}	
//		long endTime = System.currentTimeMillis();
//		log.info("原来的方式 take time:" + (endTime - beginTime));

	}

}
