package org.example.records;

public interface Request {
  boolean result();

  String message();
}

record RequestA(boolean result, String message) implements Request {}

record RequestB(boolean result, String message, String details) implements Request {}
