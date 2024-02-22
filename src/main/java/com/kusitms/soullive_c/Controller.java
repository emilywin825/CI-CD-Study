package com.kusitms.soullive_c;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "API test", description = "ci/cd 구축 프로젝트 api test")
public class Controller {

    @Operation(summary = "test해봅니다")
    @GetMapping("/api")
    public String apiTest() {
        System.out.println("성공");
        return "갓진우완벽진우미친놈";
    }
}