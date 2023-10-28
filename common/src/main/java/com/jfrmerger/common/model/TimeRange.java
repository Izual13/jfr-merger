package com.jfrmerger.common.model;

import java.time.Instant;

public record TimeRange(Instant start, Instant end) {

    public static TimeRange of(Long start, Long end) {
        if (start == null || end == null) {
            return null;
        }
        return new TimeRange(Instant.ofEpochSecond(0, start), Instant.ofEpochSecond(0, end));
    }

    public boolean validate(Instant date) {
        return date.isAfter(start) && date.isBefore(end);
    }
}
