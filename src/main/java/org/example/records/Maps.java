package org.example.records;

import java.util.HashMap;

public class Maps {
  public record Key(String part1, Long part2) {}

  public static void main(String[] args) {
    final var map = new HashMap<Key, String>();

    map.put(new Key("A string", 123L), "value1");
    map.put(new Key("Another string", 678L), "value2");
    map.put(new Key("A string", 123L), "value3");

    // map has only 2 items, value1 replaced by value3
    System.out.println(map);
  }
}
