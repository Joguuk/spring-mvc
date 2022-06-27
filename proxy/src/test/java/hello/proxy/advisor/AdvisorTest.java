package hello.proxy.advisor;

import hello.proxy.common.advice.TimeAdvice;
import hello.proxy.common.service.ServiceImpl;
import hello.proxy.common.service.ServiceInterface;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.aop.ClassFilter;
import org.springframework.aop.MethodMatcher;
import org.springframework.aop.Pointcut;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.NameMatchMethodPointcut;

import java.lang.reflect.Method;

/**
 * packageName : hello.proxy.advisor
 * fileName : AdvisorTest
 * author : joguk
 * date : 2022/06/27
 * description :
 * ===========================================================
 * DATE AUTHOR NOTE
 * 2022/06/27 joguk 최초 생성
 * -----------------------------------------------------------
 */

@Slf4j
public class AdvisorTest {

    @Test
    @DisplayName("DefaultPointcutAdvisor를 통해 생성한 Advisor 적용된 Proxy")
    void advisorTest1() {
        ServiceInterface target = new ServiceImpl();
        ProxyFactory proxyFactory = new ProxyFactory(target);

        // 항상 참인 포인트컷과 선택한 어드바이스가 적용된 어드바이저 반환
        DefaultPointcutAdvisor defaultPointcutAdvisor = new DefaultPointcutAdvisor(Pointcut.TRUE, new TimeAdvice());
        proxyFactory.addAdvisor(defaultPointcutAdvisor);
        ServiceInterface proxy = (ServiceInterface) proxyFactory.getProxy();

        proxy.save();
        proxy.find();
    }

    @Test
    @DisplayName("직접 만든 포인트컷")
    void advisorTest2() {
        ServiceInterface target = new ServiceImpl();
        ProxyFactory proxyFactory = new ProxyFactory(target);

        // 항상 참인 포인트컷과 선택한 어드바이스가 적용된 어드바이저 반환
        DefaultPointcutAdvisor defaultPointcutAdvisor = new DefaultPointcutAdvisor(new MyPointcut(), new TimeAdvice());
        proxyFactory.addAdvisor(defaultPointcutAdvisor);
        ServiceInterface proxy = (ServiceInterface) proxyFactory.getProxy();

        proxy.save();
        proxy.find();
    }

    static class MyPointcut implements Pointcut {
        @Override
        public ClassFilter getClassFilter() {
            return ClassFilter.TRUE;
        }

        @Override
        public MethodMatcher getMethodMatcher() {
            return new MyMethodMatcher();
        }
    }

    static class MyMethodMatcher implements MethodMatcher {

        public static final String SAVE = "save";

        @Override
        public boolean matches(Method method, Class<?> targetClass) {
            boolean result = method.getName().equals(SAVE);
            log.info("Pointcut Call method={}, targetClass={}", method.getName(), targetClass);
            log.info("Pointcut result={}", result);
            return result;
        }

        // 구현안해도 무방
        // isRuntime이 false인 경우, 위의 메소드 호출
        // true인 경우 아래의 메소드가 호출되는데, 동적으로 변경되는 args가 동적이기 때문에 스프링 내부적으로 캐싱을 안한다고 하는데..
        // 별로 안중요하니 이정도만 합시다~~
        @Override
        public boolean isRuntime() {
            return false;
        }

        // 구현안해도 무방
        @Override
        public boolean matches(Method method, Class<?> targetClass, Object... args) {
            return false;
        }
    }

    @Test
    @DisplayName("스프링이 제공하는 포인트컷")
    void advisorTest3() {
        ServiceInterface target = new ServiceImpl();
        ProxyFactory proxyFactory = new ProxyFactory(target);

        // NameMatchMethodPointcut 적용
        NameMatchMethodPointcut pointcut = new NameMatchMethodPointcut();
        pointcut.setMappedName("save");
        DefaultPointcutAdvisor defaultPointcutAdvisor = new DefaultPointcutAdvisor(pointcut, new TimeAdvice());
        proxyFactory.addAdvisor(defaultPointcutAdvisor);
        ServiceInterface proxy = (ServiceInterface) proxyFactory.getProxy();

        proxy.save();
        proxy.find();
    }
}
