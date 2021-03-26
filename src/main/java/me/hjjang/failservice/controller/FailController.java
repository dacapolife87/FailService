package me.hjjang.failservice.controller;

import me.hjjang.failservice.controller.dto.FailDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FailController {

    @GetMapping("/fallback")
    @ResponseBody
    public FailDto failIntroduce() {
        return FailDto.create("Service Fail!");
    }
}
