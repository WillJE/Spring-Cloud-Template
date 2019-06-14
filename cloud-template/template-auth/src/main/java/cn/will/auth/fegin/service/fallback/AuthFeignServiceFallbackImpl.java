package cn.will.auth.fegin.service.fallback;

import cn.will.auth.fegin.service.AuthFeignService;
import org.springframework.stereotype.Component;

/**
 * Created by wenli on 2019/6/12.
 */
@Component
public class AuthFeignServiceFallbackImpl implements AuthFeignService {

    @Override
    public String hello(String name) {
        return "hello " + name + ", this is template-auth, but request error";
    }
}
