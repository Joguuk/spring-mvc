package com.typeconverter.converter;

import com.typeconverter.type.IpPort;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.convert.converter.Converter;

/**
 * packageName : com.typeconverter.converter
 * fileName : StringToIpPortConverter
 * author : joguk
 * date : 2022/03/20
 * description :
 * ===========================================================
 * DATE AUTHOR NOTE
 * 2022/03/20 joguk 최초 생성
 * -----------------------------------------------------------
 */
@Slf4j
public class StringToIpPortConverter implements Converter<String, IpPort> {
    @Override
    public IpPort convert(String source) {
        log.info("convert source={}", source);
        // "127.0.0.1:8080"
        String[] split = source.split(":");
        String ip = split[0];
        int port = Integer.parseInt(split[1]);
        return new IpPort(ip, port);
    }
}
