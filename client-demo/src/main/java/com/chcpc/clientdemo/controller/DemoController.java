package com.chcpc.clientdemo.controller;

import com.chcpc.clientdemo.entity.EmpTo;
import com.chcpc.clientdemo.entity.PageBean;
import com.chcpc.clientdemo.entity.ResultVo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/demo")
@RestController
public class DemoController {
    @PostMapping("/empTo")
    public EmpTo empTo(@RequestHeader Integer id){
        return new EmpTo(id, "测试");
    }

    @PostMapping("/empTo/list")
    public List<EmpTo> empToList(@RequestHeader Integer id){
        List<EmpTo> empToList = new ArrayList<>();
        empToList.add(new EmpTo(id, "测试"));
        empToList.add(new EmpTo(3, "测试3"));
        empToList.add(new EmpTo(4, "测试4"));
        empToList.add(new EmpTo(5, "测试5"));
        return empToList;
    }

    @PostMapping("/empTo/pageBean")
    public PageBean<EmpTo> empToPageBean(@RequestHeader Integer id){
        PageBean<EmpTo> empToPageBean = new PageBean<>();
        List<EmpTo> empToList = new ArrayList<>();
        empToList.add(new EmpTo(id, "测试"));
        empToList.add(new EmpTo(6, "测试6"));
        empToList.add(new EmpTo(4, "测试4"));
        empToList.add(new EmpTo(7, "测试7"));
        empToPageBean.setList(empToList);
        return empToPageBean;
    }

    @PostMapping("/empTo/resultVo")
    public ResultVo<EmpTo> empToResultVo(@RequestHeader Integer id){
        ResultVo<EmpTo> empToResultVo = new ResultVo<>();
        empToResultVo.setData(new EmpTo(id, "测试"));
        return empToResultVo;
    }

    @PostMapping("/empTo/resultVo/pageBean")
    public ResultVo<PageBean<EmpTo>> empToResultVoList(@RequestHeader Integer id){
        ResultVo<PageBean<EmpTo>> pageBeanResultVo = new ResultVo<>();
        PageBean<EmpTo> empToPageBean = new PageBean<>();
        List<EmpTo> empToList = new ArrayList<>();
        empToList.add(new EmpTo(id, "测试"));
        empToList.add(new EmpTo(8, "测试8"));
        empToList.add(new EmpTo(9, "测试9"));
        empToList.add(new EmpTo(5, "测试5"));
        empToPageBean.setList(empToList);
        pageBeanResultVo.setData(empToPageBean);
        return pageBeanResultVo;
    }
}
