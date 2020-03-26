package com.chcpc.feignclient.common.client;

import com.chcpc.feignclient.entity.EmpVo;
import com.chcpc.feignclient.entity.PageBean;
import com.chcpc.feignclient.entity.ResultVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.List;

@FeignClient("client-demo")
public interface FeignClientInterface {
    @PostMapping("/demo/empTo")
    public EmpVo empTo(@RequestHeader Integer id);

    @PostMapping("/demo/empTo/list")
    public List<EmpVo> empToList(@RequestHeader Integer id);

    @PostMapping("/demo/empTo/pageBean")
    public PageBean<EmpVo> empToPageBean(@RequestHeader Integer id);

    @PostMapping("/demo/empTo/resultVo")
    public ResultVo<EmpVo> empToResultVo(@RequestHeader Integer id);

    @PostMapping("/demo/empTo/resultVo/pageBean")
    public ResultVo<PageBean<EmpVo>> empToResultVoList(@RequestHeader Integer id);
}
