package com.jjozerg.advanced.trace.template;

import com.jjozerg.advanced.trace.TraceStatus;
import com.jjozerg.advanced.trace.logtrace.LogTrace;

/**
 * packageName : com.jjozerg.advanced.trace.template
 * fileName : AbstractTemplate
 * author : joguk
 * date : 2022/04/13
 * description :
 * ===========================================================
 * DATE AUTHOR NOTE
 * 2022/04/13 joguk 최초 생성
 * -----------------------------------------------------------
 */
public abstract class AbstractTemplate<T> {

    private final LogTrace trace;

    public AbstractTemplate(LogTrace trace) {
        this.trace = trace;
    }

    public T execute(String message) {
        TraceStatus status = null;

        try {
            status = trace.begin(message);

            // 로직 호출
            T result = call();

            trace.end(status);
            return result;
        } catch (Exception e) {
            trace.exception(status, e);
            throw e;
        }
    }

    protected abstract T call();
}
