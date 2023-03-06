package org.example.records;

import java.util.Objects;

public record Address(String host, Integer port) {
  public Address {
    host = Objects.requireNonNull(host, "host must not be null");
    port = Objects.requireNonNullElse(port, 80);
  }
}
