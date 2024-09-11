package com.revature.jobpostservice.service;

import com.revature.jobpostservice.model.Job;
import com.revature.jobpostservice.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobService {


    @Autowired
    private JobRepository jobRepository;

    public Job createJob(Job job) {
        return jobRepository.save(job);
    }

    public Optional<Job> getJobById(Long jobId) {
        return jobRepository.findById(jobId);
    }

    public List<Job> getAllJobs() {
        return jobRepository.findAll();
    }

}

