package com.example.controller;

import com.example.common.ApiResponse;
import com.example.pojo.ExampleProduct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author naihe
 * @date 2024/10/11 ❤ 下午 08:31
 */
@RestController
public class ExampleController {

    @GetMapping({"/", "/init"})
    ApiResponse<String> init() {
        return ApiResponse.ok("the springboot server was started");
    }

    @PostMapping("/product/create")
    ApiResponse<?> create(@Valid @RequestBody ExampleProduct product) {
        return ApiResponse.ok(String.format("产品(%s-%s)创建成功.", product.getName(), product.getId()));
    }
}
