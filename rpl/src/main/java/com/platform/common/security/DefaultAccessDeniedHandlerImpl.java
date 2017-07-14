package com.platform.common.security;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;

public class DefaultAccessDeniedHandlerImpl implements AccessDeniedHandler {
	public DefaultAccessDeniedHandlerImpl() {

	}

	public String getAccessDeniedUrl() {
		return accessDeniedUrl;
	}

	public void setAccessDeniedUrl(String accessDeniedUrl) {
		this.accessDeniedUrl = accessDeniedUrl;
	}

	public DefaultAccessDeniedHandlerImpl(String accessDeniedUrl) {
		this.accessDeniedUrl = accessDeniedUrl;
	}

	private String accessDeniedUrl;

	@Override
	public void handle(HttpServletRequest req, HttpServletResponse resp,
			AccessDeniedException reason) throws ServletException, IOException {
		boolean isAjaxRequest = "XMLHttpRequest".equals(req
				.getHeader("X-Requested-With"));
		System.out.println("...............sss");
		// 如果是ajax请求
		if (isAjaxRequest) {
			String contentType = "application/json";
			resp.setContentType(contentType);
			String jsonObject = "noright";
			PrintWriter out = resp.getWriter();
			out.print(jsonObject);
			out.flush();
			out.close();
			return;
		} else {
			String path = req.getContextPath();
			String basePath = req.getScheme() + "://" + req.getServerName()
					+ ":" + req.getServerPort() + path + "/";
			resp.sendRedirect(basePath + accessDeniedUrl);
		}
	}
}
