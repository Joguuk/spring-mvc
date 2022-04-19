package hello.proxy.pureproxy.proxy.code;

import lombok.extern.slf4j.Slf4j;

/**
 * packageName : hello.proxy.pureproxy.proxy.code
 * fileName : CacheProxy
 * author : joguk
 * date : 2022/04/19
 * description :
 * ===========================================================
 * DATE AUTHOR NOTE
 * 2022/04/19 joguk 최초 생성
 * -----------------------------------------------------------
 */
@Slf4j
public class CacheProxy implements Subject {
    private Subject target;
    private String cacheValue;

    public CacheProxy(Subject target) {
        this.target = target;
    }

    @Override
    public String operation() {
        log.info("Proxy 호출");
        if (cacheValue == null) {
            cacheValue = target.operation();
        }
        return cacheValue;
    }
}
