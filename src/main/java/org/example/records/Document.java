package org.example.records;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.util.List;

public record Document(@NotNull @Size(max = 256) String name, List<@Valid Fragment> fragments) {

  public Document {
    if (name == null || name.length() > 256) {
      throw new IllegalArgumentException("Document is not valid");
    }

    fragments = fragments == null ? List.of() : List.copyOf(fragments);
  }
}
