package com.zzh.system.impl;

import com.zzh.api.TestDubboService;
import com.zzh.system.IDemoService;
import org.apache.dubbo.config.annotation.Reference;

/**
 * @Author: zzh
 * @Description:
 * @Date: 2019/7/30
 */
public class DemoServiceImpl implements IDemoService {
    @Reference(version = "1.0.0")
    private TestDubboService testDubboService;

    @Override
    public void sayHello() {
        testDubboService.testDubbo();
    }
}
