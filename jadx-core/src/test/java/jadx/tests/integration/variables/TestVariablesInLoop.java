package jadx.tests.integration.variables;

import org.junit.jupiter.api.Test;

import jadx.tests.api.SmaliTest;

import static jadx.tests.api.utils.assertj.JadxAssertions.assertThat;

public class TestVariablesInLoop extends SmaliTest {

	@Test
	public void test() {
		assertThat(getClassNodeFromSmali())
				.code()
				.containsOne("int iMth;")
				.countString(2, "iMth = 0;")
				.doesNotContain("i2");
	}
}
