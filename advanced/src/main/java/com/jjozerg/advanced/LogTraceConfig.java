package com.jjozerg.advanced;

import com.jjozerg.advanced.trace.logtrace.FieldLogTrace;
import com.jjozerg.advanced.trace.logtrace.LogTrace;
import com.jjozerg.advanced.trace.logtrace.ThreadLocalLogTrace;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * packageName : com.jjozerg.advanced
 * fileName : LogTraceConfig
 * author : joguk
 * date : 2022/04/12
 * description :
 * ===========================================================
 * DATE AUTHOR NOTE
 * 2022/04/12 joguk 최초 생성
 * -----------------------------------------------------------
 */

@Configuration
public class LogTraceConfig {

    @Bean
    public LogTrace logTrace() {
        return new ThreadLocalLogTrace();
    }
}
