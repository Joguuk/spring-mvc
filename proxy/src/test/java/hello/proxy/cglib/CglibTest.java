package hello.proxy.cglib;

import hello.proxy.cglib.code.TimeMethodInterceptor;
import hello.proxy.common.service.ConcreteService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.cglib.proxy.Enhancer;

/**
 * packageName : hello.proxy.cglib
 * fileName : CglibTest
 * author : joguk
 * date : 2022/06/26
 * description :
 * ===========================================================
 * DATE AUTHOR NOTE
 * 2022/06/26 joguk 최초 생성
 * -----------------------------------------------------------
 */

@Slf4j
public class CglibTest {

    @Test
    void cglib() {
        ConcreteService target = new ConcreteService();

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(ConcreteService.class);

        // 왜 callback일까??
        // TimeMethodInterceptor가 구현한 MethodInterceptor가 org.springframework.cglib.proxy.Callback을 구현하고 있기 떄문인거 같다..
        enhancer.setCallback(new TimeMethodInterceptor(target));
        ConcreteService proxy = (ConcreteService) enhancer.create();
        log.info("targetClass={}", target.getClass());
        log.info("proxyClass={}", proxy.getClass());

        proxy.call();
    }
}
