import org.junit.*;
import org.junit.rules.*;
import static org.junit.Assert.*;

import java.util.*;

public class TestFile {

	private File file_open;
	private File file_other;
	private File file_null;

	private long statup_time;
	
	@Before
	public void setUp() {
		statup_time = System.currentTimeMillis() / 1000;
		file_open = File.open("test_file.h5", FileMode.Overwrite);
		file_other = File.open("test_file_other.h5", FileMode.Overwrite);
		file_null = null;
	}

	@After
	public void tearDown() {
		file_open.close();
		file_other.close();
	}

	@Test
	public void testFormat() {
		assertEquals(file_open.format(), "nix");
	}

	@Test
	public void testLocation() {
		assertEquals(file_open.location(), "test_file.h5");
		assertEquals(file_other.location(), "test_file_other.h5");
	}

	@Test
	public void testVersion() {
		IntVector version = file_open.version();
		assertEquals(version.get(0), 1);
		assertEquals(version.get(1), 0);
		assertEquals(version.get(2), 0);
	}

	@Test
	public void testCreatedAt() {
		assertTrue(file_open.createdAt() >= statup_time);
		long past_time = (System.currentTimeMillis() / 1000) - 10000000;
		file_open.forceCreatedAt(past_time);
		assertEquals(file_open.createdAt(), past_time);
	}

	@Test
	public void testUpdatedAt() {
		assertTrue(file_open.updatedAt() >= statup_time);
	}

	@Test
	public void testBlockAccess() {
		List<String> names = Arrays.asList("block_a", "block_b", "block_c", "block_d", "block_e");
		Block b = null;
		assertEquals(file_open.blockCount(), 0);
		assertEquals(file_open.blocks().size(), 0);
		assertFalse(file_open.hasBlock("invalid_id"));
		try {
			file_open.hasBlock(b);
			fail();
		} catch (NullPointerException npe) {
		}

		for (String name : names) {
			Block bl = file_open.createBlock(name, "dataset");
			assertTrue(file_open.hasBlock(bl));
			assertTrue(file_open.hasBlock(name));
		}

		// Error thrown as expected. Need to handle it 
		// file_open.createBlock(names.get(0), "dataset");
			    
		assertEquals(file_open.blockCount(), names.size());
		assertEquals(file_open.blocks().size(), names.size());

		for (String name : names) {
			assertNotNull(file_open.getBlock(name));
			file_open.deleteBlock(name);
		}

		try {
			file_open.deleteBlock(b);
			fail();
		} catch (NullPointerException npe) {
		}

		b = file_open.createBlock("test", "test");
		assertTrue(file_open.deleteBlock(b));
		assertEquals(file_open.blockCount(), 0);
		assertEquals(file_open.blocks().size(), 0);
	}

	@Test
	public void testSectionAccess() {
		List<String> names = Arrays.asList("section_a", "section_b", "section_c", "section_d", "section_e");
		Section s = null;
		assertEquals(file_open.sectionCount(), 0);
		assertEquals(file_open.sections().size(), 0);
		assertFalse(file_open.hasSection("invalid_id"));
		try {
			file_open.hasSection(s);
			fail();
		} catch (NullPointerException npe) {
		}

		for (String name : names) {
			Section sec = file_open.createSection(name, "dataset");
			assertTrue(file_open.hasSection(sec));
			assertTrue(file_open.hasSection(name));
		}

		// Error thrown as expected. Need to handle it 
		// file_open.createSection(names.get(0), "root section");
			    
		assertEquals(file_open.sectionCount(), names.size());
		assertEquals(file_open.sections().size(), names.size());

		for (String name : names) {
			assertNotNull(file_open.getSection(name));
			file_open.deleteSection(name);
		}

		try {
			file_open.deleteSection(s);
			fail();
		} catch (NullPointerException npe) {
		}

		s = file_open.createSection("test", "test");
		assertTrue(file_open.deleteSection(s));
		assertEquals(file_open.sectionCount(), 0);
		assertEquals(file_open.sections().size(), 0);
	}

	@Test
	public void testReopen() {
		Block b = file_open.createBlock("a", "a");
		b = null;

		file_open.close();
		file_open = File.open("test_file_b.h5", FileMode.Overwrite);
		b = file_open.createBlock("b", "b");
	}
}
