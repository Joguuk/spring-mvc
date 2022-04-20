package hello.proxy.config.v1_proxy.interface_proxy;

import hello.proxy.app.v1.OrderControllerV1;
import hello.proxy.trace.TraceStatus;
import hello.proxy.trace.logtrace.LogTrace;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * packageName : hello.proxy.config.v1_proxy.interface_proxy
 * fileName : OrderControllerInterfaceProxy
 * author : joguk
 * date : 2022/04/20
 * description :
 * ===========================================================
 * DATE AUTHOR NOTE
 * 2022/04/20 joguk 최초 생성
 * -----------------------------------------------------------
 */
@Slf4j
@RequiredArgsConstructor
public class OrderControllerInterfaceProxy implements OrderControllerV1 {
    private final OrderControllerV1 target;
    private final LogTrace logTrace;

    @Override
    public String requset(String itemId) {
        TraceStatus status = null;
        try {
            status = logTrace.begin("OrderController.request()");
            // target 호출
            String result = target.requset(itemId);
            logTrace.end(status);
            return result;
        } catch (Exception e) {
            logTrace.exception(status, e);
            throw e;
        }
    }

    @Override
    public String noLog() {
        return target.noLog();
    }
}
