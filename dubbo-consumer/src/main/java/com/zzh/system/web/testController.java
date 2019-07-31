package com.zzh.system.web;

import com.zzh.api.TestDubboService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zzh
 * @Description:
 * @Date: 2019/7/31
 */
@RestController
public class testController {
    @Reference(version = "1.0.0")
    TestDubboService testDubboService;

    @GetMapping("/test")
    String test() {
        return testDubboService.testDubbo();
    }
}
