package hizhangbo.proxy.provider;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author hizhangbo
 */
@Service
@FeignClient(name = "provider")
public interface HomeService {
    /**
     * http rpc demo interface
     *
     * @return Demo String
     */
    @GetMapping(value = "/home/index")
    String index();
}
