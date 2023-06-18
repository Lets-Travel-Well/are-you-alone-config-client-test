package rualone.springcloudconfigclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

    @Value("${spring.datasource.uri}")
    private synchronized String dbUri;

    @GetMapping("/config")
    public String config() {
        return dbUri;
    }
}
