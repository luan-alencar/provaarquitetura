package david.augusto.luan.accountservice.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/accounts")
@RestController
public class AccountResource {

    @GetMapping("/test")
    public String testProdutos(@RequestHeader(value = "Account Service") String headerValue) {
        return headerValue;
    }
}

