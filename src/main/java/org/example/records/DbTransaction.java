package org.example.records;

import java.math.BigDecimal;
import java.time.Instant;

public record DbTransaction(long id, String state, BigDecimal amount, Instant timeUpdated) {}
