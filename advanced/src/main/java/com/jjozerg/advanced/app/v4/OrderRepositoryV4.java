package com.jjozerg.advanced.app.v4;

import com.jjozerg.advanced.trace.TraceStatus;
import com.jjozerg.advanced.trace.logtrace.LogTrace;
import com.jjozerg.advanced.trace.template.AbstractTemplate;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

/**
 * packageName : com.jjozerg.advanced.app.v2
 * fileName : OrderRepositoryV2
 * author : joguk
 * date : 2022/04/10
 * description :
 * ===========================================================
 * DATE AUTHOR NOTE
 * 2022/04/10 joguk 최초 생성
 * -----------------------------------------------------------
 */

@Repository
@RequiredArgsConstructor
public class OrderRepositoryV4 {
    private final LogTrace trace;

    public void save(String itemId) {
        AbstractTemplate<Void> template = new AbstractTemplate<Void>(trace) {
            @Override
            protected Void call() {
                if (itemId.equals("ex")) {
                    throw new IllegalStateException("예외 발생!!");
                }
                sleep(1000);
                return null;
            }
        };
        template.execute("OrderRepository.save()");
    }

    private void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
