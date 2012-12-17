package com.dylanvivi.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.sf.json.JSONObject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

@Controller
public abstract class BaseController extends MultiActionController {
	protected final transient Logger log = LoggerFactory.getLogger(getClass());
	public static final String MESSAGES_KEY = "successMessages";
	public static final String ERRORS_KEY = "errorMessages";

	public int getUserid(HttpServletRequest request) {
		Integer userid = (Integer) request.getSession().getAttribute("userid");
		return userid;
	}

	@SuppressWarnings("unchecked")
	public void saveMessage(HttpServletRequest request, String msg) {
		List<String> messages = (List<String>) request.getSession().getAttribute(MESSAGES_KEY);

		if (messages == null) {
			messages = new ArrayList<String>();
		}

		messages.add(msg);
		request.getSession().setAttribute(MESSAGES_KEY, messages);
	}

	@SuppressWarnings("unchecked")
	public void saveErrors(HttpServletRequest request, String msg) {
		List<String> messages = (List<String>) request.getSession().getAttribute(MESSAGES_KEY);

		if (messages == null) {
			messages = new ArrayList<String>();
		}

		messages.add(msg);
		request.getSession().setAttribute(ERRORS_KEY, messages);
	}

	/**
	 * Convenience method for getting a i18n key's value. Calling
	 * getMessageSourceAccessor() is used because the RequestContext variable is
	 * not set in unit tests b/c there's no DispatchServlet Request.
	 * 
	 * @param msgKey
	 * @param locale
	 *            the current locale
	 * @return
	 */
	public String getText(String msgKey) {
		return getMessageSourceAccessor().getMessage(msgKey);
	}

	/**
	 * Convenient method for getting a i18n key's value with a single string
	 * argument.
	 * 
	 * @param msgKey
	 * @param arg
	 * @param locale
	 *            the current locale
	 * @return
	 */
	public String getText(String msgKey, String arg) {
		return getText(msgKey, new Object[] { arg });
	}

	/**
	 * Convenience method for getting a i18n key's value with arguments.
	 * 
	 * @param msgKey
	 * @param args
	 * @param locale
	 *            the current locale
	 * @return
	 */
	public String getText(String msgKey, Object[] args) {
		return getMessageSourceAccessor().getMessage(msgKey, args);
	}

	public HttpSession getSession(HttpServletRequest request) {
		return request.getSession();
	}

	public Object[] getArgs(List<Object> args) {
		if (args == null || args.isEmpty()) {
			return null;
		}
		int len = args.size();
		Object[] objArgs = new Object[len];
		for (int i = 0; i < len; i++) {
			objArgs[i] = args.get(i);
		}
		return objArgs;
	}

	/**
	 * 把信息放入session
	 * 
	 * @param request
	 * @param obj
	 */
	public void putSession(HttpServletRequest request, String attributeKey, Object obj) {
		request.getSession().setAttribute(attributeKey, obj);
	}

	/**
	 * 从session中取得信息
	 * 
	 * @param request
	 * @param attributeKey
	 * @return
	 */
	public Object getSession(HttpServletRequest request, String attributeKey) {
		return request.getSession().getAttribute(attributeKey);
	}

	/**
	 * 直接输出纯字符串
	 */
	public void renderText(HttpServletResponse response, String content) {
		try {
			response.setContentType("text/plain;charset=UTF-8");
			response.getWriter().write(content);
			response.getWriter().flush();
		} catch (IOException e) {
			log.error("", e);
		}
	}

	/**
	 * 直接输出纯HTML
	 */
	public void renderHtml(HttpServletResponse response, String content) {
		try {
			response.setContentType("text/html;charset=UTF-8");
			response.getWriter().write(content);
		} catch (IOException e) {
			log.error("", e);
		}
	}

	/**
	 * 直接输出纯XML
	 */
	public void renderXML(HttpServletResponse response, String content) {
		try {
			response.setContentType("text/xml;charset=UTF-8");
			response.getWriter().write(content);
		} catch (IOException e) {
			log.error("", e);
		}
	}

	/**
	 * 把JSON数据以字符串形式输出
	 */
	protected void renderTextHTML(JSONObject data, HttpServletResponse response) {
		response.setContentType("text/html;charset=UTF-8");
		log.info(data.toString());
		try {
			if (data != null) {
				response.getWriter().print(data.toString());
			}
		} catch (IOException e) {
			log.error("ERROR", e.getMessage());
		}
	}

	/**
	 * 把JSON数据以字符串形式输出
	 */
	protected void renderTextHTML(String data, HttpServletResponse response) {
		response.setContentType("text/html;charset=UTF-8");
		log.info(data.toString());
		try {
			if (data != null) {
				response.getWriter().print(data.toString());
			}
		} catch (IOException e) {
			log.error("ERROR", e.getMessage());
		}
	}

	/**
	 * 直接输出json
	 */
	public void renderJson(HttpServletResponse response, String content) {
		try {
			response.setContentType("text/json;charset=UTF-8");
			response.getWriter().write(content);
		} catch (IOException e) {
			log.error("", e);
		}
	}

}
