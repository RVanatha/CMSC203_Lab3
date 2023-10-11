import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {
	
	GradeBook g1 = new GradeBook(4);
	
	GradeBook g2 = new GradeBook(4);
	@BeforeEach
	void setUp() throws Exception {
		
		
		g1.addScore(80);
		g1.addScore(0);
		
		g2.addScore(74);
		g2.addScore(20);
	}

	@AfterEach
	void tearDown() throws Exception {
		g1 = null;
		g2 = null;
	}

	@Test
	void testAddScore() {
		assertEquals(4,g1.getScoreSize());
		
		String expectedResult = "GradeBook [scores=" + Arrays.toString(scores) + ", scoresSize=" + g1.getScoreSize + "]";
		String actualResult = g1.toString();
		
		assertEquals(expectedResult, expectedResult);
	}

	@Test
	void testSum() {
		double expectedSum = 80 + 0 + 74 + 20;
		
		assertEquals(expectedSum, g1.sum(), 0);
	}

	@Test
	void testMinimum() {
		double minimum = 0;
		assertEquals(minimum, g1.minimum(), 0);
	}

	@Test
	void testFinalScore() {
		fail("Not yet implemented");
	}

	@Test
	void testGetScoreSize() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

}
