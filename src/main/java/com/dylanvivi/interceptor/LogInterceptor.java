package com.dylanvivi.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.dylanvivi.entity.UpUser;

/**
 * 
 * @author lucas
 * @since  2011-12-31
 */

public class LogInterceptor extends HandlerInterceptorAdapter {
	private final Logger log = LoggerFactory.getLogger(LogInterceptor.class);

	private long start = 0L;

	private long warnTime;

	private String excludePaths;

	private String testid;

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

		boolean handlerOk = super.preHandle(request, response, handler);
		if (handlerOk) {

			String url = request.getRequestURI().toString();
			String contentPath = request.getContextPath();

			if (url.indexOf(".") > -1) {
				//log.debug("静态:" + url + ", 不拦截")
				return true;
			}

			if (("," + excludePaths + ",").indexOf("," + url + ",") > -1) {
				log.trace("" + url + ", excludePaths配置的路径不拦截");
				return true;
			}
			start = System.currentTimeMillis();

			HttpSession session = request.getSession();
			UpUser user = (UpUser) session.getAttribute("LoginUser");

			/*if (user == null) {
				response.sendRedirect(contentPath + "/user/login");
				return false;
			}*/

			return true;
		}
		return false;
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		String url = request.getRequestURI().toString();

		if (url.indexOf(".") == -1) {
			long time = System.currentTimeMillis() - start;
			if (time > warnTime) {
				log.warn("[url]:" + url + "; [time:]" + time + "ms; ");
			} else {
				log.info("[url]:" + url + "; [time:]" + time + "ms; ");
			}

		}

	}

	public void setWarnTime(long warnTime) {
		this.warnTime = warnTime;
	}

	public void setExcludePaths(String excludePaths) {
		this.excludePaths = excludePaths;
	}

	public void setTestid(String testid) {
		this.testid = testid;
	}
}
