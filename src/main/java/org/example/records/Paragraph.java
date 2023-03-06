package org.example.records;

import java.util.List;

public record Paragraph(List<String> sentences) {

  public Paragraph {
    if (sentences == null) {
      throw new IllegalArgumentException("sentences must not be null");
    }

    sentences = List.copyOf(sentences);
  }
}
