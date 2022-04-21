package hello.proxy.pureproxy.concreteproxy.code;

import lombok.extern.slf4j.Slf4j;

/**
 * packageName : hello.proxy.pureproxy.concreteproxy.code
 * fileName : TimeProxy
 * author : joguk
 * date : 2022/04/21
 * description :
 * ===========================================================
 * DATE AUTHOR NOTE
 * 2022/04/21 joguk 최초 생성
 * -----------------------------------------------------------
 */

@Slf4j
public class TimeProxy extends ConcreteLogic {

    private ConcreteLogic concreteLogic;

    public TimeProxy(ConcreteLogic concreteLogic) {
        this.concreteLogic = concreteLogic;
    }

    @Override
    public String operation() {
        log.info("TimeDecorator operation");
        long startTime = System.currentTimeMillis();

        String result = concreteLogic.operation();

        long endTime = System.currentTimeMillis();
        long resultTime = endTime - startTime;
        log.info("TimeDecorator End / Result Time={}", resultTime);

        return result;

    }
}
