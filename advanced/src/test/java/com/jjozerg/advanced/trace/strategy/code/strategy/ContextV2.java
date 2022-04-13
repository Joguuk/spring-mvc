package com.jjozerg.advanced.trace.strategy.code.strategy;

import lombok.extern.slf4j.Slf4j;

/**
 * packageName : com.jjozerg.advanced.trace.strategy.code.strategy
 * fileName : ContextV1
 * author : joguk
 * date : 2022/04/13
 * description :
 * ===========================================================
 * DATE AUTHOR NOTE
 * 2022/04/13 joguk 최초 생성
 * -----------------------------------------------------------
 */

/**
 * 전략을 파라미터로 전달하는 방식
 */
@Slf4j
public class ContextV2 {
    public void execute(Strategy strategy) {
        long startTime = System.currentTimeMillis();
        // 비니지스 로직 실행
        strategy.call();    // 위임

        // 비니지스 로직 종료
        long endTime = System.currentTimeMillis();
        long resultTime = endTime - startTime;
        log.info("resultTime = {}", resultTime);
    }
}
