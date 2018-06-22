package com.taobao.pamirs.schedule;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

/**
* @Description:¿ØÖÆÌ¨Servlet
* @author KinLin
* @date 2017/11/1 22:02
*/
public class WebInitial extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void init() throws ServletException {
		super.init();
		try {
			ConsoleManager.initial();
		} catch (Exception e) {
			throw new ServletException(e);
		}
	}
}
