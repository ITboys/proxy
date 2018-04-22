package com.proxy.proxya.jdk8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

import com.proxy.proxya.jdk8.domain.Person;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Chapter4 {

	@Test
	public void test() {

		// 学生集合
		List<Person> personList = new ArrayList<>(3000000);
		for (int i = 0, j = 3000000; i < j; i++) {
			int sex = i % 2;
			Person p = new Person(String.valueOf(i), i, sex);
			personList.add(p);
		}

		long beginTime2 = System.currentTimeMillis();
		// 流方式：年龄之和
		int parallelAges = personList.parallelStream().mapToInt(p -> p.getAge()).sum();

		long endTime2 = System.currentTimeMillis();
		log.info("并行流方式 take time:" + (endTime2 - beginTime2));
		log.info("parallelAges:" + parallelAges);

		long beginTime = System.currentTimeMillis();

		// 原来的方式
		int totalAge = 0;
		for (Person p : personList) {
			// 年龄之和
			totalAge = totalAge + p.getAge();
		}	
		long endTime = System.currentTimeMillis();
		log.info("原来的方式 take time:" + (endTime - beginTime));
		log.info("totalAge:" + totalAge);

	}

}
