package $7_ApplicationProperties_Value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class AppConfig {

    // Lấy giá trị config từ file application.properties
    @Value("${moon.mysql.url}")
    String mysqlUrl;
@Bean
    DatabaseConnector mysqlConfigure() {
        DatabaseConnector mySqlConnector = new MySqlConnector();
        // Set Url
        System.out.println("Config Mysql Url: " + mysqlUrl);
        mySqlConnector.setUrl(mysqlUrl);
        // Set username, password, format, v.v...
        return mySqlConnector;
    }
}