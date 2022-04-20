package hello.proxy.pureproxy.decorator.code;

import lombok.extern.slf4j.Slf4j;

/**
 * packageName : hello.proxy.pureproxy.decarator.code
 * fileName : TimeDecorator
 * author : joguk
 * date : 2022/04/20
 * description :
 * ===========================================================
 * DATE AUTHOR NOTE
 * 2022/04/20 joguk 최초 생성
 * -----------------------------------------------------------
 */
@Slf4j
public class TimeDecorator implements Component{
    private Component component;

    public TimeDecorator(Component component) {
        this.component = component;
    }

    @Override
    public String operation() {
        log.info("TimeDecorator operation");
        long startTime = System.currentTimeMillis();

        String result = component.operation();

        long endTime = System.currentTimeMillis();
        long resultTime = endTime - startTime;
        log.info("TimeDecorator End / Result Time={}", resultTime);

        return result;
    }
}
