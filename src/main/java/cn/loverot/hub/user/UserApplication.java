package cn.loverot.hub.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class UserApplication {




    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }

}
