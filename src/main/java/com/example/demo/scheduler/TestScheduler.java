package com.example.demo.scheduler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class TestScheduler {

    @Async
    @Scheduled(fixedDelay = 2 * 1000)
    public void aaa() throws InterruptedException {
        Thread.sleep(6 * 1000);
        log.info("aaa");
    }

    @Scheduled(fixedDelay = 2 * 1000)
    public void bbb() {
        log.info("bbb");
    }


    @Scheduled(fixedDelay = 2 * 1000)
    public void ccc() {
        log.info("ccc");
    }
}
