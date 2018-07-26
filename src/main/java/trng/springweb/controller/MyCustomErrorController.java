package trng.springweb.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyCustomErrorController implements ErrorController {

	@RequestMapping("/error")
	@ResponseBody
	public String handleError(HttpServletRequest request) {
		Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
		return String.format("<html>\r\n" + "<body>\r\n" + "<h1>\r\n" + "Oops... Something went wrong\r\n"
				+ "</h1><div>There could be errors with the data you entered</div>\r\n"
				+ "	<a href=\"/home\">Go Home</a>\r\n" + "<div>Status code: <b>%s</b></div>\r\n"
				+ "<img alt=\"sad-puppy\" src=\"https://thumbs.dreamstime.com/b/cute-puppy-white-background-14660314.jpg\">\r\n"
				+ "</body>\r\n" + "</html>", statusCode);
	}

	@Override
	public String getErrorPath() {
		return "/error";
	}
}
