package com.zzh.service;

import com.zzh.api.TestDubboService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @Author: zzh
 * @Description:
 * @Date: 2019/7/30
 */
@Service(version = "1.0.0")
public class TestDubboServiceImpl implements TestDubboService {

    @Override
    public String testDubbo() {
        return "test dubbo";
    }
}
