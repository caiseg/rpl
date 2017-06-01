/**
 * 文件名[fileName]：FwSession.java
 * @author 王求卿[wangqq] Email:455654995@qq.com Tel:18101037995
 * @version: v1.0.0.1
 * 日期：2014-3-19 下午4:44:24
 * Copyright 【中公高科养护科技股份有限公司】 2016  
 */
package com.platform.common.cache;

import javax.servlet.http.HttpSession;

/**
 * 
 * <p>
 * 类描述：FwHttpSession。
 * </p>
 * 
 * @author 王求卿[wangqq] Email:455654995@qq.com Tel:18101037995。
 * @version: v1.0.0.1。
 * @since JDK1.6。
 *        <p>
 *        创建日期：2014-3-19 下午4:44:24。
 *        </p>
 */

public class FwHttpSession {
	static ThreadLocal<HttpSession> threadSession = new ThreadLocal<HttpSession>();

	public static void setThreadSession(HttpSession httpSession) {
		threadSession.set(httpSession);
	}

	public static HttpSession getThreadSession() {
		return (HttpSession) threadSession.get();
	}

	public static void clear() {
		threadSession.set(null);
	}

	/**
	 * 获取或者设置HttpSession
	 */
	public static HttpSession httpSession() {
		return getThreadSession();
	}
}
