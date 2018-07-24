package trng.springweb.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import trng.springweb.model.Customer;

@Controller
@RequestMapping("/customers")
public class CustomerController {
   
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
