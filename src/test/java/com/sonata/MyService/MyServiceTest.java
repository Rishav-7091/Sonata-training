package com.sonata.MyService;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;
import java.util.List;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import com.example.demos.*;

@RunWith(Suite.class)
@SuiteClasses({})
public class MyServiceTest {
	
	@Test
	void test() {
		MyServiceIntf my = new MyServiceStub();
		MyServiceImpla mys = new MyServiceImpla(my);
		List<String> filterMySer = mys.retriveRelated("Dummy");
		assertEquals(2, filterMySer.size());
	}

}
