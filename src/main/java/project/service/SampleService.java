package project.service;

import org.springframework.stereotype.Service;

@Service
public class SampleService {
    public SampleService() {
    }
    
    public void print() {
        System.out.println("Sample Service 입니다.");
    }
}
