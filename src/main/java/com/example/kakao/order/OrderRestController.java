package com.example.kakao.order;

import com.example.kakao._core.security.CustomUserDetails;
import com.example.kakao._core.utils.ApiUtils;
import com.example.kakao.cart.CartService;
import com.example.kakao.user.User;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class OrderRestController {
    private final OrderService orderService;

    // TODO: (기능9) 결재하기 - (주문 인서트) POST
    // /orders/save
    @PostMapping("/orders/save")
    public ResponseEntity<?> save(@AuthenticationPrincipal CustomUserDetails userDetails) {
        User user = userDetails.getUser();
        OrderResponse.SaveDTO saveOrder = orderService.saveOrder(user);
        return ResponseEntity.ok().body(ApiUtils.success(saveOrder));
    }

    // TODO: (기능10) 주문 결과 확인 GET
    // /orders/{id}
    @GetMapping("/orders/{id}")
    public ResponseEntity<?> findById(@AuthenticationPrincipal CustomUserDetails userDetails, @PathVariable("id") int id) {
        User user = userDetails.getUser();
        OrderResponse.FindByIdDTO orderRes = orderService.findById(user, id);
        return ResponseEntity.ok().body(ApiUtils.success(orderRes));
    }
}
