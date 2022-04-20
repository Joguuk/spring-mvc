package hello.proxy.app.v1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * packageName : hello.proxy.app.v1
 * fileName : OrderControllerV1
 * author : joguk
 * date : 2022/04/19
 * description :
 * ===========================================================
 * DATE AUTHOR NOTE
 * 2022/04/19 joguk 최초 생성
 * -----------------------------------------------------------
 */

// 스프링은 @Controller 또는 @RequestMapping 이 있어야 스프링 컨트롤러로 인식
@RequestMapping
@ResponseBody
public interface OrderControllerV1 {
    @GetMapping("/v1/request")
    String requset(@RequestParam("itemId") String itemId);

    @GetMapping("/v1/no-log")
    String noLog();
}
