package de.msvhsoftware.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
public class DataController {

    @Autowired
    private DataService dataService;

    @PostMapping("/data")
    public void postData(@RequestBody DataSample dataSample) {
        dataService.addSample(dataSample);
    }

    @GetMapping("/data")
    public Set<DataSample> getData() {
        return dataService.getSamples();
    }

}
