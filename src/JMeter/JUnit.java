package JMeter;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class JUnit {
	@Test
	public void testGetName() {
		jmeter j = new jmeter();
		j.setName("string");
		assertEquals("string",j.getName());
	}
	@Test
	public void testGetFriend() {
		jmeter j = new jmeter();
		j.setFriend("string");
		assertEquals("string",j.getFriend());
	}
}
