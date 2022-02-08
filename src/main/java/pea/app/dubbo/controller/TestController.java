package pea.app.dubbo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangwei
 * @date 2022/2/7 15:44
 */
@RestController
@RequestMapping("test")
public class TestController {

    @GetMapping("/say1")
    public String say1(String msg) {
        return msg;
    }

    @GetMapping("/say2")
    public String say2(String msg) {
        return msg;
    }
}
