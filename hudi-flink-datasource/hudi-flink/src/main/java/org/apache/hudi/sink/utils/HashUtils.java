package org.apache.hudi.sink.utils;

import java.nio.charset.StandardCharsets;
import org.apache.hadoop.util.hash.Hash;

public class HashUtils {
  public static int murmurHash(String input) {
    return Hash.getInstance(Hash.MURMUR_HASH).hash(input.getBytes(StandardCharsets.UTF_8));
  }
}
