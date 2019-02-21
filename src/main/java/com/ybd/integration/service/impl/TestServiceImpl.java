package com.ybd.integration.service.impl;

import com.ybd.integration.service.TestService;
import com.ybd.integration.vo.UserVO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * <pre>
 *
 * </pre>
 *
 * @author 杨帮东 (qq:397827222)
 * @version 1.0
 * @date 2019/02/21 21:50
 **/
@Service
public class TestServiceImpl implements TestService
{

    @Override
    public List<UserVO> test()
    {
        List<UserVO> list = new ArrayList<>();

        for (int i = 0;i < 10;i++)
        {
            UserVO uv = new UserVO();
            uv.setUserId(i);
            uv.setNickName(i + "sd");
            uv.setAge(i + 1);
            uv.setUpdateTime(new Date());
            list.add(uv);
        }

        return list;
    }
}
