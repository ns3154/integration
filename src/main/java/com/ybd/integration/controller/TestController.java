package com.ybd.integration.controller;

import com.ybd.integration.model.Result;
import com.ybd.integration.service.TestService;
import com.ybd.integration.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <pre>
 *
 * </pre>
 *
 * @author 杨帮东 (qq:397827222)
 * @version 1.0
 * @date 2019/02/21 21:34
 **/
@RestController
@RequestMapping("test")
public class TestController
{

    @Autowired
    private TestService testService;

    @GetMapping("test")
    public Result<List<UserVO>> test(String req)
    {

        if(StringUtils.isEmpty(req))
        {
            return new Result<>();
        }
        return new Result<List<UserVO>>(200, "ok", testService.test());
    }

}
