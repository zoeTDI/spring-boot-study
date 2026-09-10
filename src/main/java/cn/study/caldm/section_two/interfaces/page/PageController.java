package cn.study.caldm.section_two.interfaces.page;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/")
    public String index(Model model) {
        HashMap<String, String> map = new HashMap();
        map.put("name", "Caldm");
        model.addAllAttributes(map);
        return "index";
    }

}
