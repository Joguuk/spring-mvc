package hello.proxy.common.service;

import lombok.extern.slf4j.Slf4j;

/**
 * packageName : hello.proxy.common.service
 * fileName : ServiceImpl
 * author : joguk
 * date : 2022/06/26
 * description :
 * ===========================================================
 * DATE AUTHOR NOTE
 * 2022/06/26 joguk 최초 생성
 * -----------------------------------------------------------
 */

@Slf4j
public class ServiceImpl implements ServiceInterface{
    @Override
    public void save() {
        log.info("save 호출");
    }

    @Override
    public void find() {
        log.info("find 호출");
    }
}
