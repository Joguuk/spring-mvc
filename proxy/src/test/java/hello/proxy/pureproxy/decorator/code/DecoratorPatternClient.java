package hello.proxy.pureproxy.decorator.code;

import lombok.extern.slf4j.Slf4j;

/**
 * packageName : hello.proxy.pureproxy.decarator.code
 * fileName : DecoratorPatternClient
 * author : joguk
 * date : 2022/04/19
 * description :
 * ===========================================================
 * DATE AUTHOR NOTE
 * 2022/04/19 joguk 최초 생성
 * -----------------------------------------------------------
 */
@Slf4j
public class DecoratorPatternClient {

    private Component component;

    public DecoratorPatternClient(Component component) {
        this.component = component;
    }

    public void execute() {
        String result = component.operation();
        log.info("result => {}", result);
    }
}
