package com.jjozerg.advanced.app.v4;

import com.jjozerg.advanced.trace.TraceStatus;
import com.jjozerg.advanced.trace.logtrace.LogTrace;
import com.jjozerg.advanced.trace.template.AbstractTemplate;
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
public class OrderServiceV4 {
    private final OrderRepositoryV4 orderRepository;
    private final LogTrace trace;

    public void orderItem(String itemId) {
        AbstractTemplate<Void> template = new AbstractTemplate<Void>(trace) {
            @Override
            protected Void call() {
                orderRepository.save(itemId);
                return null;
            }
        };
        template.execute("OrderService.orderItem()");
    }
}
