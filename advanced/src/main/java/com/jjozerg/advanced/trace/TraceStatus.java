package com.jjozerg.advanced.trace;

/**
 * packageName : com.jjozerg.advanced.trace
 * fileName : TraceStatus
 * author : joguk
 * date : 2022/04/10
 * description :
 * ===========================================================
 * DATE AUTHOR NOTE
 * 2022/04/10 joguk 최초 생성
 * -----------------------------------------------------------
 */
public class TraceStatus {
    private final TraceId traceId;
    private final Long startTimeMs;
    private final String message;

    public TraceStatus(TraceId traceId, Long startTimeMs, String message) {
        this.traceId = traceId;
        this.startTimeMs = startTimeMs;
        this.message = message;
    }

    public TraceId getTraceId() {
        return traceId;
    }

    public Long getStartTimeMs() {
        return startTimeMs;
    }

    public String getMessage() {
        return message;
    }
}
