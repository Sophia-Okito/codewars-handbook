import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class PangramTest {
  @Test
  void sample() {
    assertTrue(PangramChecker.check("The quick brown fox jumps over the lazy dog."));
    assertFalse(PangramChecker.check("You shall not pass!"));
  }
}
