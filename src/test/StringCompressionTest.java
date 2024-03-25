package test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import solutions.StringCompression;

public class StringCompressionTest {

  @Test
  public void test_no_repeating_characters() {
    StringCompression stringCompression = new StringCompression();
    char[] chars = {'a', 'b', 'c'};
    int result = stringCompression.compress(chars);
    assertEquals(3, result);
    assertArrayEquals(new char[]{'a', 'b', 'c'}, chars);
  }

  @Test
  public void test_empty_array() {
    StringCompression stringCompression = new StringCompression();
    char[] chars = {};
    int result = stringCompression.compress(chars);
    assertEquals(0, result);
    assertArrayEquals(new char[]{}, chars);
  }

  @Test
  public void test_compress_repeating_characters() {
    StringCompression stringCompression = new StringCompression();
    char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
    int result = stringCompression.compress(chars);
    assertEquals(6, result);
    assertArrayEquals(new char[]{'a', '2', 'b', '2', 'c', '3'}, chars);
  }

  @Test
  public void test_compress_repeating_characters_with_length_1() {
    StringCompression stringCompression = new StringCompression();
    char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c', 'd'};
    int result = stringCompression.compress(chars);
    assertEquals(7, result);
    assertArrayEquals(new char[]{'a', '2', 'b', '2', 'c', '3', 'd'}, chars);
  }
}