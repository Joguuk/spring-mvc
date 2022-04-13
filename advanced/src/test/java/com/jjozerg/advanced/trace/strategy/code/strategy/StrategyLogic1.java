package com.jjozerg.advanced.trace.strategy.code.strategy;

import lombok.extern.slf4j.Slf4j;

/**
 * packageName : com.jjozerg.advanced.trace.strategy.code.strategy
 * fileName : StrategyLogic1
 * author : joguk
 * date : 2022/04/13
 * description :
 * ===========================================================
 * DATE AUTHOR NOTE
 * 2022/04/13 joguk 최초 생성
 * -----------------------------------------------------------
 */

@Slf4j
public class StrategyLogic1 implements Strategy{
    @Override
    public void call() {
        log.info("비지니스 로직 1 실행");
    }
}
