package org.example.records;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public interface RequestApi {
  @Schema(description = "Operation result")
  boolean result();

  @NotNull
  @Size(min = 1, max = 200)
  String message();
}

record RequestC(boolean result, String message) implements RequestApi {}

record RequestD(boolean result, String message, String details) implements RequestApi {}
