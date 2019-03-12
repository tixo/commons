package io.onedev.commons.jsyntax.python;

import org.junit.Test;

import io.onedev.commons.jsyntax.AbstractTokenizerTest;
import io.onedev.commons.jsyntax.python.CythonTokenizer;

public class CythonTokenizerTest extends AbstractTokenizerTest {
	
	@Test
	public void test() {
		verify(new CythonTokenizer(true), new String[] {"python/python.js"}, "test.pyx");
	}
}
