package com.example.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;
import java.time.LocalDateTime;

/**
 * @author naihe
 * @date 2025/09/17 ❤ 下午 03:44
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExampleProduct {

    @NotNull(message = "产品ID不能为空")
    private Long id;

    @NotBlank(message = "产品名称不能为空")
    @Size(max = 50, message = "产品名称不能超过50个字")
    private String name;

    @Size(max = 200, message = "产品描述不能超过200个字")
    private String description;

    @NotNull(message = "产品价格不能为空")
    @DecimalMin(value = "0.01", message = "产品价格不能小于0.01")
    @Digits(integer = 5, fraction = 2, message = "产品价格整数部分最多5位, 小数部分最多2位")
    private Double price;

    @NotNull(message = "产品库存不能为空")
    @Min(value = 1, message = "产品库存至少为1")
    private Integer stockQuantity;

    @PastOrPresent(message = "创建时间不能超过当前时间")
    private LocalDateTime createdAt;

    @PastOrPresent(message = "更新时间不能超过当前时间")
    private LocalDateTime updatedAt;
}
