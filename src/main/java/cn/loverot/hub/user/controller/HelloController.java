package cn.loverot.hub.user.controller;

import cn.loverot.hub.user.pojo.School;
import cn.loverot.hub.user.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private SchoolService schoolService;
    @RequestMapping("/hello")
    public String hello(){
        School school = schoolService.findById(1);
        return "学校名："+school.getName();
    }
}
