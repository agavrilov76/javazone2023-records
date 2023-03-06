package org.example.records;

public interface Config {
  String name();

  default Address serverAddress() {
    return null;
  }
}

record BaseConfig(String name) implements Config {}