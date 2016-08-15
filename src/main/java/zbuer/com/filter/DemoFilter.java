package zbuer.com.filter;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author buer
 * @since 16/8/15
 */
@Component
public class DemoFilter implements Filter{
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("init filter>>>>>>>>>>>");
	}

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,
			FilterChain filterChain) throws IOException, ServletException {

		System.out.println("do filter>>>>>>>>>>>>>>");
		filterChain.doFilter(servletRequest,servletResponse);
	}

	@Override
	public void destroy() {

		System.out.println("destory>>>>>>>>>>>>>>>>");

	}
}
