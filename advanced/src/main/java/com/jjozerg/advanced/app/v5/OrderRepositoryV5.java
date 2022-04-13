package com.jjozerg.advanced.app.v5;

import com.jjozerg.advanced.trace.callback.TraceCallback;
import com.jjozerg.advanced.trace.callback.TraceTemplate;
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
public class OrderRepositoryV5 {
    private final TraceTemplate traceTemplate;

    public OrderRepositoryV5(LogTrace trace) {
        this.traceTemplate = new TraceTemplate(trace);
    }

    public void save(String itemId) {
        traceTemplate.execute("OrderRepository.save()", () -> {
            if (itemId.equals("ex")) {
                throw new IllegalStateException("예외 발생!!");
            }
            sleep(1000);
            return null;
        });
    }

    private void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
