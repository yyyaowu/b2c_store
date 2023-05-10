package com.yao.clients;

import com.yao.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@FeignClient(value = "collect-service")
public interface CollectClient {

    @PostMapping("/collect/remove/bypid")
    R removeByPID(@RequestBody Integer productId);
}
