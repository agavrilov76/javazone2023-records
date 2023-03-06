package org.example.records;

import java.util.List;

public record Fragment(List<String> sentences) {

  public Fragment {
    if (sentences == null) {
      throw new IllegalArgumentException("sentences must not be null");
    }

    sentences = List.copyOf(sentences);
  }
}
