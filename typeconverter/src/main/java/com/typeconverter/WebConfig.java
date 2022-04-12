package com.typeconverter;

import com.typeconverter.converter.IntegerToStringConverter;
import com.typeconverter.converter.IpPortToStringConverter;
import com.typeconverter.converter.StringToIntegerConverter;
import com.typeconverter.converter.StringToIpPortConverter;
import com.typeconverter.formatter.MyNumberFormatter;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * packageName : com.typeconverter
 * fileName : WebConfig
 * author : joguk
 * date : 2022/03/20
 * description :
 * ===========================================================
 * DATE AUTHOR NOTE
 * 2022/03/20 joguk 최초 생성
 * -----------------------------------------------------------
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {
    // 스프링은 내부에서 conversionService를 제공하고, 우리는 WebMvcConfigurer가
    // 제공하는 addFormatter를 사용해서 추가하고 싶은 Converter를1 동록하면 된다.
    @Override
    public void addFormatters(FormatterRegistry registry) {
        // 우선순위로 인해 주석처리
//        registry.addConverter(new StringToIntegerConverter());
//        registry.addConverter(new IntegerToStringConverter());
        registry.addConverter(new StringToIpPortConverter());
        registry.addConverter(new IpPortToStringConverter());

        // 포맷터 추가
        registry.addFormatter(new MyNumberFormatter());
    }
}
