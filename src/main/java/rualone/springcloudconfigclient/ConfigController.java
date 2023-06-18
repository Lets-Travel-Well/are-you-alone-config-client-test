package rualone.springcloudconfigclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigController {

    @Value("${spring.datasource.uri}")
    private String dbUri;

    @GetMapping("/config")
    public String config() {
        return dbUri;
    }
}
