package hello.proxy.pureproxy.concreteproxy.code;

import lombok.extern.slf4j.Slf4j;

/**
 * packageName : hello.proxy.pureproxy.concreteproxy.code
 * fileName : ConcreteLogic
 * author : joguk
 * date : 2022/04/21
 * description :
 * ===========================================================
 * DATE AUTHOR NOTE
 * 2022/04/21 joguk 최초 생성
 * -----------------------------------------------------------
 */
@Slf4j
public class ConcreteLogic {

    public String operation() {
        log.info("ConcreteLogic 실행");
        return "data";
    }

}
