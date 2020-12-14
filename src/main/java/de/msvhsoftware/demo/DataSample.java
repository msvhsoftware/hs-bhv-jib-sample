package de.msvhsoftware.demo;

import java.time.Instant;

public class DataSample {

    private Instant timestamp;

    private String name;

    private String value;

    public DataSample(Instant timestamp, String name, String value) {
        this.timestamp = timestamp;
        this.name = name;
        this.value = value;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
