

import com.intuit.karate.junit5.Karate;

public class TestRunner {
	@Karate.Test
	Karate testTags() {
		return Karate.run("classpath:./apis").tags("@execute").relativeTo(getClass());
	}

}
