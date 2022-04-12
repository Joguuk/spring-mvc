package com.typeconverter.converter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.convert.converter.Converter;

/**
 * packageName : com.typeconverter.converter
 * fileName : StringToIntegerConverter
 * author : joguk
 * date : 2022/03/20
 * description :
 * ===========================================================
 * DATE AUTHOR NOTE
 * 2022/03/20 joguk 최초 생성
 * -----------------------------------------------------------
 */

@Slf4j
public class StringToIntegerConverter implements Converter<String, Integer> {
    @Override
    public Integer convert(String source) {
        log.info("convert source={}", source);
        return Integer.valueOf(source);
    }
}
