package com.chcpc.feignclient.controller;

import com.chcpc.feignclient.common.client.FeignClientInterface;
import com.chcpc.feignclient.entity.EmpTo;
import com.chcpc.feignclient.entity.EmpVo;
import com.chcpc.feignclient.entity.PageBean;
import com.chcpc.feignclient.entity.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/")
@RestController
public class MyController {
    @Autowired
    FeignClientInterface feignClientInterface;

    @GetMapping("test1")
    public EmpVo test1(){
        return feignClientInterface.empTo(1);
    }

    @GetMapping("test2")
    public List<EmpVo> test2(){
        return feignClientInterface.empToList(1);
    }

    @GetMapping("test3")
    public PageBean<EmpVo> test3(){
        return feignClientInterface.empToPageBean(1);
    }

    @GetMapping("test4")
    public ResultVo<EmpVo> test4(){
        return feignClientInterface.empToResultVo(1);
    }

    @GetMapping("test5")
    public ResultVo<PageBean<EmpVo>> test5(){
        return feignClientInterface.empToResultVoList(1);
    }

}
