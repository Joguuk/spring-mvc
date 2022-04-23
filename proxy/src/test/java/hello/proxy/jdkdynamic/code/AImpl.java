package hello.proxy.jdkdynamic.code;

import lombok.extern.slf4j.Slf4j;

/**
 * packageName : hello.proxy.jdkdynamic.code
 * fileName : AImpl
 * author : joguk
 * date : 2022/04/21
 * description :
 * ===========================================================
 * DATE AUTHOR NOTE
 * 2022/04/21 joguk 최초 생성
 * -----------------------------------------------------------
 */

@Slf4j
public class AImpl implements AInterface{
    @Override
    public String call() {
        log.info("A 호출");
        return "A";
    }
}
