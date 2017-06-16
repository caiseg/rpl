package com.platform.common.exception;

import javax.servlet.http.HttpServletRequest;

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
	public ErrorInfo exception(Exception e, HttpServletRequest webRequest) {
		ErrorInfo r = new ErrorInfo();
		//r.setMessage(e.getMessage());
		r.setMessage(e.toString());
		r.setCode(ErrorInfo.ERROR);
		r.setUrl(webRequest.getRequestURL().toString());
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
						"/401");
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
