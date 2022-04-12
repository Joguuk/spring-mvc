package com.jjozerg.advanced.trace.threadlocal.code;

import lombok.extern.slf4j.Slf4j;

/**
 * packageName : com.jjozerg.advanced.trace.threadlocal.code
 * fileName : FieldService
 * author : joguk
 * date : 2022/04/12
 * description :
 * ===========================================================
 * DATE AUTHOR NOTE
 * 2022/04/12 joguk 최초 생성
 * -----------------------------------------------------------
 */

@Slf4j
public class ThreadLocalService {
    private ThreadLocal<String> nameStore = new ThreadLocal<>();

    public String logic(String name) {
        log.info("저장 name={} -> nameStore={}", name, nameStore.get());
        nameStore.set(name);
        sleep(1000);
        log.info("조회 nameStore={}", nameStore.get());
        return nameStore.get();
    }

    private void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
