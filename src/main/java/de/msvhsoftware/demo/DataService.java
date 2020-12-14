package de.msvhsoftware.demo;

import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class DataService {

    private final Set<DataSample> dataSamples;

    public DataService() {
        dataSamples = new HashSet<>();
    }

    public void addSample(DataSample dataSample) {
        dataSamples.add(dataSample);
    }

    public Set<DataSample> getSamples() {
        return new HashSet<>(dataSamples);
    }

}
