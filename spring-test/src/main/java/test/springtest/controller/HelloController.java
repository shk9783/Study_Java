package test.springtest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class HelloController {
    @GetMapping("hello")
    public String hello(Model model){
        model.addAttribute("data", "hello!!");
        return "hello"; // 리턴 값으로 문자를 반환하면 뷰 리졸버('viewResolver')가 화면을 찾아서 처리한다.
    }
}
