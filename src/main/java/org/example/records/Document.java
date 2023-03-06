package org.example.records;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.util.List;

public record Document(@NotNull @Size(max = 256) String title, List<@Valid Paragraph> paragraphs) {

  public Document {
    if (title == null || title.length() > 256) {
      throw new IllegalArgumentException("Document is not valid");
    }

    paragraphs = paragraphs == null ? List.of() : List.copyOf(paragraphs);
  }
}
