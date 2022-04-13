package com.jjozerg.advanced.trace.strategy.code.template;

import lombok.extern.slf4j.Slf4j;

/**
 * packageName : com.jjozerg.advanced.trace.strategy.code.template
 * fileName : TimeLogTemplate
 * author : joguk
 * date : 2022/04/13
 * description :
 * ===========================================================
 * DATE AUTHOR NOTE
 * 2022/04/13 joguk 최초 생성
 * -----------------------------------------------------------
 */

@Slf4j
public class TimeLogTemplate {
    public void execute(Callback callback) {
        long startTime = System.currentTimeMillis();
        // 비니지스 로직 실행
        callback.call();    // 위임

        // 비니지스 로직 종료
        long endTime = System.currentTimeMillis();
        long resultTime = endTime - startTime;
        log.info("resultTime = {}", resultTime);
    }
}
