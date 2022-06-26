package hello.proxy.common.service;

import lombok.extern.slf4j.Slf4j;

/**
 * packageName : hello.proxy.common.service
 * fileName : ConcreteService
 * author : joguk
 * date : 2022/06/26
 * description :
 * ===========================================================
 * DATE AUTHOR NOTE
 * 2022/06/26 joguk 최초 생성
 * -----------------------------------------------------------
 */

@Slf4j
public class ConcreteService {

    public void call() {
        log.info("ConcreteService 호출");
    }
}
