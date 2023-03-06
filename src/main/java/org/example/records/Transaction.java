package org.example.records;

import com.telenordigital.tdbase.api.annotation.Builder;
import java.math.BigDecimal;
import java.time.Clock;
import java.time.Instant;
import java.util.Objects;

@Builder
public record Transaction(Long id, Instant timeUpdated, BigDecimal amount, State state) {
  enum State {
    INITIAL,
    UPDATED
  }

  public Transaction {
    Objects.requireNonNull(timeUpdated);
    state = state == null ? State.INITIAL : state;
  }

  public Transaction updateState(Clock clock, BigDecimal newAmount) {
    return new Transaction(id, clock.instant(), newAmount, State.UPDATED);
  }

  public static void main(String[] args) {
    final var transaction =
        TransactionBuilder.builder()
            .id(1234L)
            .timeUpdated(Clock.systemUTC().instant())
            .amount(BigDecimal.TEN)
            .build();
  }
}
