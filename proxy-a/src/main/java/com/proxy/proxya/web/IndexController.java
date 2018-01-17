/**
 * @copyright remark holdings
 */
package com.proxy.proxya.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author kobe_t
 * @date 2018/1/17 9:07
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String index(ModelMap map){
        map.put("host","巨人代理");
        return "index";
    }


}
