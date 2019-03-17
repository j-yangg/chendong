package org.chendong.studygraphql.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @classname: GraphqlController
 * @description:
 * @author: Danny Chen
 * @create: 2018-12-22 16:08
 */
@RestController
@RequestMapping("/hello")
public class GraphqlController {

    @RequestMapping("/graphql")
    @ResponseBody
    public Object graphql() {
        return "hello danny";
    }

}
