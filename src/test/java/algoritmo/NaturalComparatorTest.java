package algoritmo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { NaturalComparator.class })
public class NaturalComparatorTest {
	@Autowired
	private NaturalComparator<Integer> intComparator;

	@Test
	public void testCompare() {
		assertEquals(-1, intComparator.compare(1, 2));
		assertEquals(0, intComparator.compare(1, 1));
		assertEquals(1, intComparator.compare(2, 1));
	}
}
