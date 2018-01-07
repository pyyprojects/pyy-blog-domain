/**
 * Copyright (C), 2015-2018, XXX有限公司
 * 项目名称:
 * 文件名称:
 * 作者: wolf
 * 日期: 2018/1/7 下午8:40
 * 描述:
 * 版本: V1.0
 */
package com.pyy.pyyblogdomain.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈〉
 *
 * @author wolf
 * @create 2018/1/7
 * @since 1.0.0
 */
@Controller
@RestController
public class IndexController {

    @GetMapping("/hello")
    public String index() {
        return "index";
    }
}