package david.augusto.luan.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api/inventories")
public class InventoryService {

    @GetMapping("/test")
    public String testInventory(String headerValue) {
        return headerValue;
    }
}
