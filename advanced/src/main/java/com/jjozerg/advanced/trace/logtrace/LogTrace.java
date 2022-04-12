package com.jjozerg.advanced.trace.logtrace;

import com.jjozerg.advanced.trace.TraceStatus;

/**
 * packageName : com.jjozerg.advanced.trace.logtrace
 * fileName : LogTrace
 * author : joguk
 * date : 2022/04/12
 * description :
 * ===========================================================
 * DATE AUTHOR NOTE
 * 2022/04/12 joguk 최초 생성
 * -----------------------------------------------------------
 */
public interface LogTrace {
    TraceStatus begin(String message);

    void end(TraceStatus status);

    void exception(TraceStatus status, Exception e);
}
