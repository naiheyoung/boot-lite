package com.how.controller;

import com.how.common.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author naihe
 * @date 2024/10/11 ❤ 下午 08:31
 */
@RestController
public class InitController {

    @GetMapping({"/", "/init"})
    ApiResponse<String> init() {
        return ApiResponse.success("the springboot server was started");
    }
}
