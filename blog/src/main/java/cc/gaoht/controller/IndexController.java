package cc.gaoht.controller;

import cc.gaoht.NotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class IndexController {
    @GetMapping("")
    public String index(){
//        int i=9/0;
//        throw new NotFoundException("blog not found");
        return "index";
    }

    @GetMapping("/detail")
    public String detail(){
        return "blog";
    }
}
