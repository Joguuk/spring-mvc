package com.jjozerg.advanced.trace.template.code;

import lombok.extern.slf4j.Slf4j;

/**
 * packageName : com.jjozerg.advanced.trace.template.code
 * fileName : SubClassLogic1
 * author : joguk
 * date : 2022/04/13
 * description :
 * ===========================================================
 * DATE AUTHOR NOTE
 * 2022/04/13 joguk 최초 생성
 * -----------------------------------------------------------
 */

@Slf4j
public class SubClassLogic1 extends AbstractTemplate{
    @Override
    protected void call() {
        log.info("비즈니스 로직1 실행");
    }
}
