package com.jjozerg.advanced.trace.template.code;

import lombok.extern.slf4j.Slf4j;

/**
 * packageName : com.jjozerg.advanced.trace.template.code
 * fileName : AbstractTemplate
 * author : joguk
 * date : 2022/04/13
 * description :
 * ===========================================================
 * DATE AUTHOR NOTE
 * 2022/04/13 joguk 최초 생성
 * -----------------------------------------------------------
 */

@Slf4j
public abstract class AbstractTemplate {

    public void execute() {
        long startTime = System.currentTimeMillis();
        // 비니지스 로직 실행
        call(); // 상속

        // 비니지스 로직 종료
        long endTime = System.currentTimeMillis();
        long resultTime = endTime - startTime;
        log.info("resultTime = {}", resultTime);
    }

    protected abstract void call();
}
