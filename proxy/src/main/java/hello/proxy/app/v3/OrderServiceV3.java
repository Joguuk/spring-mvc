package hello.proxy.app.v3;

import org.springframework.stereotype.Service;

/**
 * packageName : hello.proxy.app.v2
 * fileName : OrderServiceV3
 * author : joguk
 * date : 2022/04/19
 * description :
 * ===========================================================
 * DATE AUTHOR NOTE
 * 2022/04/19 joguk 최초 생성
 * -----------------------------------------------------------
 */

@Service
public class OrderServiceV3 {
    private final OrderRepositoryV3 orderRepository;

    public OrderServiceV3(OrderRepositoryV3 orderRepository) {
        this.orderRepository = orderRepository;
    }

    public void orderItem(String itemId) {
        orderRepository.save(itemId);
    }
}
