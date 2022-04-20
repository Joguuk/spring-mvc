package hello.proxy.config.v1_proxy.interface_proxy;

import hello.proxy.app.v1.OrderRepositoryV1;
import hello.proxy.trace.TraceStatus;
import hello.proxy.trace.logtrace.LogTrace;
import lombok.RequiredArgsConstructor;

/**
 * packageName : hello.proxy.config.v1_proxy.interface_proxy
 * fileName : OrderRepositoryInterfaceProxy
 * author : joguk
 * date : 2022/04/20
 * description :
 * ===========================================================
 * DATE AUTHOR NOTE
 * 2022/04/20 joguk 최초 생성
 * -----------------------------------------------------------
 */
@RequiredArgsConstructor
public class OrderRepositoryInterfaceProxy implements OrderRepositoryV1 {
    private final OrderRepositoryV1 target;
    private final LogTrace logTrace;

    @Override
    public void save(String itemId) {
        TraceStatus status = null;
        try {
            status = logTrace.begin("OrderRepository.request()");
            // target 호출
            target.save(itemId);
            logTrace.end(status);
        } catch (Exception e) {
            logTrace.exception(status, e);
            throw e;
        }
    }
}
