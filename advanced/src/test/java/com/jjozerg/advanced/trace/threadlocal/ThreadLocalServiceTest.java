package com.jjozerg.advanced.trace.threadlocal;

import com.jjozerg.advanced.trace.threadlocal.code.ThreadLocalService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * packageName : com.jjozerg.advanced.trace.threadlocal
 * fileName : ThreadLocalServiceTest
 * author : joguk
 * date : 2022/04/12
 * description :
 * ===========================================================
 * DATE AUTHOR NOTE
 * 2022/04/12 joguk 최초 생성
 * -----------------------------------------------------------
 */

@Slf4j
public class ThreadLocalServiceTest {
    private ThreadLocalService threadLocalService = new ThreadLocalService();

    @Test
    void field() {
        log.info("main start");
        Runnable userA = () -> {
            threadLocalService.logic("userA");
        };
        Runnable userB = () -> {
            threadLocalService.logic("userB");
        };

        Thread threadA = new Thread(userA);
        threadA.setName("thread-A");
        Thread threadB = new Thread(userB);
        threadB.setName("thread-B");

        threadA.start();
        sleep(100);    // 동시성 오류 발생X
        threadB.start();

        sleep(3000);    // 메인 쓰레드 종료 대기(래치, 카운트다운으로 하는게 훨씬 좋은 방법)
        log.info("main exit");
    }

    private void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
