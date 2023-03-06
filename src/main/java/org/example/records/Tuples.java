package org.example.records;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Tuples {
  record Tuple(String field1, int field2, Long field3) {}

  public Tuple getOneTuple() {
    return new Tuple("foo", -1, null);
  }

  public static void main(final String[] args) {
    record KeyValue(String key, String value) {}

    Stream.of("key1=a", "key2=b", "key3=c")
        .map(a -> a.split("="))
        .map(array -> new KeyValue(array[0], array[1]))
        .map(kv -> "%s --- %s".formatted(kv.key, kv.value))
        .forEach(System.out::println);
  }
}
