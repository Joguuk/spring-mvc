package hello.proxy.pureproxy.decorator.code;

import lombok.extern.slf4j.Slf4j;

/**
 * packageName : hello.proxy.pureproxy.decarator.code
 * fileName : RealComponent
 * author : joguk
 * date : 2022/04/19
 * description :
 * ===========================================================
 * DATE AUTHOR NOTE
 * 2022/04/19 joguk 최초 생성
 * -----------------------------------------------------------
 */
@Slf4j
public class RealComponent implements Component{
    @Override
    public String operation() {
        log.info("RealComponent operation");
        return "data";
    }
}
