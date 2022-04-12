package com.jjozerg.advanced.app.v3;

import com.jjozerg.advanced.trace.TraceId;
import com.jjozerg.advanced.trace.TraceStatus;
import com.jjozerg.advanced.trace.hellotrace.HelloTraceV2;
import com.jjozerg.advanced.trace.logtrace.LogTrace;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * packageName : com.jjozerg.advanced.app.v2
 * fileName : OrderServiceV2
 * author : joguk
 * date : 2022/04/10
 * description :
 * ===========================================================
 * DATE AUTHOR NOTE
 * 2022/04/10 joguk 최초 생성
 * -----------------------------------------------------------
 */

@Service
@RequiredArgsConstructor
public class OrderServiceV3 {
    private final OrderRepositoryV3 orderRepository;
    private final LogTrace trace;

    public void orderItem(String itemId) {
        TraceStatus status = null;
        try {
            status = trace.begin("OrderServiceV3.orderItem()");
            orderRepository.save(itemId);
            trace.end(status);
        } catch (Exception e) {
            trace.exception(status, e);
            throw e;    // 예외를 꼭 다시 던져주어야 한다.
        }
    }
}
