package hello.proxy.pureproxy.decorator.code;

import lombok.extern.slf4j.Slf4j;

/**
 * packageName : hello.proxy.pureproxy.decarator.code
 * fileName : MessageDecorator
 * author : joguk
 * date : 2022/04/19
 * description :
 * ===========================================================
 * DATE AUTHOR NOTE
 * 2022/04/19 joguk 최초 생성
 * -----------------------------------------------------------
 */
@Slf4j
public class MessageDecorator implements Component{
    private Component component;

    public MessageDecorator(Component component) {
        this.component = component;
    }

    @Override
    public String operation() {
        log.info("MessageDecorator operation");

        String result = component.operation();
        String decoratorResult = "*****" + result + "*****";
        log.info("MessageDecoratr 꾸미기 적용 전={}, 적용 후={}", result, decoratorResult);
        return decoratorResult;
    }
}
