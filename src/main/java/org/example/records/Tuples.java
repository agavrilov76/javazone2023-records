package org.example.records;

import java.util.stream.Stream;

public class Tuples {
  record Tuple(String field1, int field2, Long field3) {}

  public Tuple returnMultipleValuesAsTuple() {
    return new Tuple("foo", -1, null);
  }

  public static void main(final String[] args) {
    // intermediate result
    record KeyValue(String key, String value) {}

    Stream.of("key1=a", "key2=b", "key3=c")
        .map(arg -> arg.split("="))
        .map(parts -> new KeyValue(parts[0], parts[1]))
        .map(kv -> "%s --- %s".formatted(kv.key, kv.value))
        .forEach(System.out::println);
  }
}
