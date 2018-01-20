/**
 * @copyright remark holdings
 */
package com.proxy.proxya.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author kobe_t
 * @date 2018/1/17 9:07
 */
@Controller
public class IndexController {
	
	protected static Logger logger=LoggerFactory.getLogger(IndexController.class);

    @RequestMapping("/")
    public String index(ModelMap map){
    	logger.info("=======================start==========");
        map.put("host","巨人代理");
        return "index";
    }


}
