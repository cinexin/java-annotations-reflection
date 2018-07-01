package org.learning.cinexin.annotations;

import org.learning.cinexin.annotations.core.Test;
import org.learning.cinexin.annotations.core.TesterInfo;
import org.learning.cinexin.annotations.core.TesterInfo.Priority;

@TesterInfo(
	priority = Priority.HIGH, 
	createdBy = "mkyong.com",  
	tags = {"sales","test" }
)
public class TestExample {

	@Test
	void testA() {
	  if (true)
		throw new RuntimeException("This test always failed");
	}

	@SuppressWarnings("unused")
	@Test(enabled = false)
	void testB() {
	  if (false)
		throw new RuntimeException("This test always passed");
	}

	@Test(enabled = true)
	void testC() {
	  if (10 > 1) {
		// do nothing, this test always passed.
	  }
	}

}
