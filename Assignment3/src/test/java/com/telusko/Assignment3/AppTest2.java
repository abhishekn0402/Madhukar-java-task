package com.telusko.Assignment3;

import static org.junit.Assert.assertEquals;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.junit.Test;

public class AppTest2 {

	@Test
	void test11() throws IOException {
		FileReader reader = new FileReader("propertiesfile");
		Properties properties = new Properties();
		properties.load(reader);
		assertEquals("root1", properties.getProperty("username"));
	}
	@Test
	void test22() throws IOException {
		FileReader reader = new FileReader("propertiesfile");
		Properties properties = new Properties();
		properties.load(reader);
		assertEquals("root1", properties.getProperty("password"));
	}


}
