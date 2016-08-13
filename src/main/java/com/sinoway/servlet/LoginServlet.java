package com.sinoway.servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sinoway.entity.User;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static final Logger LOG = LoggerFactory.getLogger(LoginServlet.class);

	private static Map<String, String> accountDB = new HashMap<String, String>();

	static {
		accountDB.put("shirdrn", "123456");
		accountDB.put("admin", "999999");
		accountDB.put("dev", "000888");
		accountDB.put("007", "007007");
	}  
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		 this.doPost(request, response);  
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {  
        String userName = request.getParameter("userName");  
        String password = request.getParameter("password");  
        User user = null;
        user = (User) request.getSession().getAttribute("LOGIN_USER");
        if(null == user){
        	user = new User();
            user.setUsername(userName);
            user.setPassword(password);
        }else{
        	userName = user.getUsername();
        	password = user.getPassword();
        	
        	LOG.debug("current sessionId: " + request.getSession().getId());
        	LOG.debug("current session: " + user);
        }
        LOG.info("Raw input:userName=" + userName + ",password=" + password);  
        if(userName!=null && password!=null  
                  && accountDB.containsKey(userName)  
                  && accountDB.get(userName).equals(password)) {
        	
             LOG.info("Login;status=SUCCESS");  
             request.getSession().setAttribute("userName", userName); 
             request.getSession().setAttribute("LOGIN_USER", user);
             request.getRequestDispatcher("success.jsp").forward(request, response);                
        } else {  
             LOG.info("Login;status=FAIL");  
             request.getRequestDispatcher("login.jsp").forward(request, response);  
        }  
   }  

}
