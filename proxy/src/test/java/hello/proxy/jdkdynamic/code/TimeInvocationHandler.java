package hello.proxy.jdkdynamic.code;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * packageName : hello.proxy.jdkdynamic.code
 * fileName : TimeInvocationHandler
 * author : joguk
 * date : 2022/04/21
 * description :
 * ===========================================================
 * DATE AUTHOR NOTE
 * 2022/04/21 joguk 최초 생성
 * -----------------------------------------------------------
 */

@Slf4j
public class TimeInvocationHandler implements InvocationHandler {

    private final Object target;

    public TimeInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] args) throws Throwable {
        log.info("TimeProxy 실행");
        long startTime = System.currentTimeMillis();

        Object result = method.invoke(target, args);

        long endTime = System.currentTimeMillis();
        long resultTime = endTime - startTime;
        log.info("TimeProxy 종료 resultTime=>{}", resultTime);

        return result;
    }
}
