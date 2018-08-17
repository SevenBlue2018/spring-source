package com.gentlemanqc;

import com.gentlemanqc.spring.event.sync.DemoPublisher;
import com.gentlemanqc.spring.event.sync.EventConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Configuration
@ComponentScan({"com.gentlemanqc.spring.event"})
public class SpringSourceApplicationTests {

	@Test
	public void contextLoads() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
		DemoPublisher publisher = context.getBean(DemoPublisher.class);
		publisher.published();
		context.close();
	}

}
