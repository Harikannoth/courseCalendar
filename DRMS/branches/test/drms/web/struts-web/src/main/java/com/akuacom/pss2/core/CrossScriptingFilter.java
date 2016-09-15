package com.akuacom.pss2.core;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class CrossScriptingFilter implements Filter {
	private FilterConfig filterConfig;
	
    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig = filterConfig;
    }
    public void destroy() {
        this.filterConfig = null;
    }
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
        throws IOException, ServletException {
       // chain.doFilter(new RequestWrapper((HttpServletRequest) request), response);
    	 chain.doFilter(new XSSRequestWrapper((HttpServletRequest) request), response);
    }
}