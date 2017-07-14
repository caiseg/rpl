package com.platform.common.exception;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.servlet.ErrorPage;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(value = { Exception.class })
	public ErrorInfo exception(Exception e, HttpServletRequest webRequest,HttpServletResponse response) {
		
	//	boolean isAjaxRequest = "XMLHttpRequest".equals(webRequest.getHeader("X-Requested-With"));
	//	System.out.println("是否是ajax请求："+isAjaxRequest);
		ErrorInfo r = new ErrorInfo();
		r.setMessage(e.toString());
		r.setCode(ErrorInfo.ERROR);
		r.setUrl(webRequest.getRequestURL().toString());
		/* if(isAjaxRequest){  
			 	try {
			 		PrintWriter out = response.getWriter();
			 		out.print(r.toString());
					out.flush();
					out.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
		        return null;  
		 }else{  
			return r;
		 }*/
		return r;
	}
	
	
	/**
	 * 处理404页面的错误
	 * @return
	 */
	@Bean
	public EmbeddedServletContainerCustomizer containerCustomizer() {
		return new EmbeddedServletContainerCustomizer() {
			@Override
			public void customize(ConfigurableEmbeddedServletContainer container) {
				
				
				ErrorPage error401Page = new ErrorPage(HttpStatus.FORBIDDEN,
						"/403");
				ErrorPage error404Page = new ErrorPage(HttpStatus.NOT_FOUND,
						"/404");
				ErrorPage error500Page = new ErrorPage(
						HttpStatus.INTERNAL_SERVER_ERROR, "/500");
				container.addErrorPages(error401Page, error404Page,
						error500Page);
			}

		};
	}
	
	
}
