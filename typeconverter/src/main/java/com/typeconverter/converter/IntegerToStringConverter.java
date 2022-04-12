package com.typeconverter.converter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.convert.converter.Converter;

/**
 * packageName : com.typeconverter.converter
 * fileName : IntegerToStringConverter
 * author : joguk
 * date : 2022/03/20
 * description :
 * ===========================================================
 * DATE AUTHOR NOTE
 * 2022/03/20 joguk 최초 생성
 * -----------------------------------------------------------
 */
@Slf4j
public class IntegerToStringConverter implements Converter<Integer, String> {
    @Override
    public String convert(Integer source) {
        log.info("convert source={}", source);
        return String.valueOf(source);
    }
}
