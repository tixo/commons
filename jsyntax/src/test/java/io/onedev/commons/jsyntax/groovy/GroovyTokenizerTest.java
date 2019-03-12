package io.onedev.commons.jsyntax.groovy;

import org.junit.Test;

import io.onedev.commons.jsyntax.AbstractTokenizerTest;
import io.onedev.commons.jsyntax.groovy.GroovyTokenizer;


public class GroovyTokenizerTest extends AbstractTokenizerTest{
	@Test
	public void test() {
		verify(new GroovyTokenizer(), new String[] {"groovy/groovy.js"}, "test.groovy");
	}
}

