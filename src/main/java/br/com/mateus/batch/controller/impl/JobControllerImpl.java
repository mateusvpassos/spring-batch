package br.com.mateus.batch.controller.impl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.mateus.batch.controller.JobController;
import br.com.mateus.batch.service.JobService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/jobs")
@RequiredArgsConstructor
public class JobControllerImpl implements JobController {

    private final JobService jobService;

    @Override
    public void importCsvToDBJob() {
        jobService.importCsvToDBJob();
    }
}
