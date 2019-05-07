/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: UrlFilter
 * Author:   Administrator
 * Date:     2019/5/8 0008 0:04
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.word.filter;

import com.word.common.Const;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 〈〉
 *
 * @author Administrator
 * @create 2019/5/8 0008
 * @since 1.0.0
 */
public class UrlFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

	}

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
		HttpServletResponse response = (HttpServletResponse) servletResponse;
		HttpServletRequest request=(HttpServletRequest) servletRequest;
		servletRequest.setCharacterEncoding("utf-8");
		servletResponse.setCharacterEncoding("utf-8");
		String servletPath = request.getServletPath();

		if (request.getSession().getAttribute(Const.CURRENT_USER) != null || servletPath.contains("login") || servletPath.contains("register.jsp")){
			filterChain.doFilter(servletRequest, servletResponse);
			return;
		}

		if (servletPath.contains(".jsp") || servletPath.contains(".html") || servletPath.contains(".do")) {
			response.sendRedirect("/login.jsp");
		}else {
			filterChain.doFilter(servletRequest, servletResponse);
		}

	}

	@Override
	public void destroy() {

	}
}