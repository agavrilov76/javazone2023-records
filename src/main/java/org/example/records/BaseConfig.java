package org.example.records;

import java.util.Set;

public interface BaseConfig {
  String name();

  String environment();

  default Address serverAddress() {
    return null;
  }

  static void validate(String name, String environment) {
    if (name == null) {
      throw new IllegalArgumentException("name must not be null");
    }

    if (environment == null || Set.of("test", "staging", "production").contains(environment)) {
      throw new IllegalArgumentException("environment is null or invalid");
    }
  }
}

record SimpleConfig(String name, String environment) implements BaseConfig {

  SimpleConfig {
    BaseConfig.validate(name, environment);
  }
}

record SererConfig(String name, String environment, Address serverAddress) implements BaseConfig {

  SererConfig {
    BaseConfig.validate(name, environment);
  }
}
