package com.typeconverter.type;

import lombok.EqualsAndHashCode;
import lombok.Getter;

/**
 * packageName : com.typeconverter.type
 * fileName : IpPort
 * author : joguk
 * date : 2022/03/20
 * description :
 * ===========================================================
 * DATE AUTHOR NOTE
 * 2022/03/20 joguk 최초 생성
 * -----------------------------------------------------------
 */
@Getter
@EqualsAndHashCode
public class IpPort {
    private String ip;
    private int port;

    public IpPort(String ip, int port) {
        this.ip = ip;
        this.port = port;
    }
}
