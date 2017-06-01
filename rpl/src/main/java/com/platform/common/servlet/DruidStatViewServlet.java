package com.platform.common.servlet;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

import com.alibaba.druid.support.http.StatViewServlet;


/**
 * 配置druid监控统计功能
 * 在SpringBoot项目中基于注解的配置，
 * @author wangqq
 *
 */

@WebServlet(urlPatterns = "/druid/*",
    initParams = {
            @WebInitParam(name="loginUsername",value="druid"),// 用户名
            @WebInitParam(name="loginPassword",value="druid"),// 密码
            @WebInitParam(name="resetEnable",value="false")// 禁用HTML页面上的“Reset All”功能
    }
)
public class DruidStatViewServlet extends StatViewServlet {

}