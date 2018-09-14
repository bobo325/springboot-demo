package mybatis.springboot.connection;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("mybatis.springboot.connection.dao")//不加会报错，
// （Consider defining a bean of type 'mybatis.springboot.connection.dao.UserMapper' in your configuration.）
public class ConnectionApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConnectionApplication.class, args);
    }
}
