package com.yujin123.web;

import com.alibaba.druid.support.http.StatViewServlet;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

/**
 * ${DESCRIPTION}
 *
 * @author yujin
 * @email yujin7@staff.sina.com.cn
 * @create 2016-09-01 12:39
 */
@WebServlet(urlPatterns="/druid/*",
    initParams={
            @WebInitParam(name="allow",value="127.0.0.1, 10.236.27.1"),// IP白名单(没有配置或者为空，则允许所有访问)
            @WebInitParam(name="deny",value="10.236.27.88"),// IP黑名单 (存在共同时，deny优先于allow)
            @WebInitParam(name="loginUsername",value="admin"),// 用户名
            @WebInitParam(name="loginPassword",value="123456"),// 密码
            @WebInitParam(name="resetEnable",value="false")// 禁用HTML页面上的“Reset All”功能
    }
)
public class DruidStatViewServlet extends StatViewServlet {
}
