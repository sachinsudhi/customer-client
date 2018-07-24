package trng.springweb.controller;

import java.util.Collections;
import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

import trng.springweb.model.Customer;

@Controller
@RequestMapping("/customers")
public class CustomerController {
	
	String basicURL="$localhost:8091/customers";
   
   @RequestMapping(method = RequestMethod.GET)
	public String initloadForm(Map<String, Object> model) {
	   Customer customer=new Customer();
	   model.put("customer", customer);
		return "addcustomer";
	}
   
   @RequestMapping(value="/update", method=RequestMethod.GET)
  	public String updateCustomer() {
  		return "updatecustomer";
  	}
   
   @RequestMapping(value="/list", method=RequestMethod.GET)
	public String loadCustomerList() {
		return "customerlist";
	}
   
   @RequestMapping(value="/load", method=RequestMethod.GET)
	public String loadCustomer() {
		return "loadcustomer";
	}
   
   @RequestMapping(value="/delete", method=RequestMethod.GET)
	public String deleteCustomer() {
		return "deletecustomer";
	}
}
