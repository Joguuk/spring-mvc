package hello.proxy.common.advice;

import lombok.extern.slf4j.Slf4j;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * packageName : hello.proxy.common.advice
 * fileName : TimeAdvice
 * author : joguk
 * date : 2022/06/27
 * description :
 * ===========================================================
 * DATE AUTHOR NOTE
 * 2022/06/27 joguk 최초 생성
 * -----------------------------------------------------------
 */

@Slf4j
public class TimeAdvice implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        log.info("TimeProxy 실행");
        long startTime = System.currentTimeMillis();

//        Object result = method.invoke(target, args);
        // invocation.proceed()를 호출하면 타겟 클래스를 호출하고 결과를 받는다
        Object result = invocation.proceed();

        long endTime = System.currentTimeMillis();
        long resultTime = endTime - startTime;
        log.info("TimeProxy 종료 resultTime=>{}", resultTime);

        return result;
    }
}
