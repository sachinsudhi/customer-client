package trng.springweb.controller;

import java.util.Collections;
import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import trng.springweb.model.Customer;

@Controller
@RequestMapping("/customers")
public class CustomerController {
	
	String basicURL="http://localhost:8091/customers";
   
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
   
   @RequestMapping(value="/load", method= {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView loadCustomer(@RequestParam(value="customerId" ,required=false)Integer customerId, Model model) {
	   ModelAndView modelandView = new ModelAndView("loadcustomer");
	   RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
		ResponseEntity<Customer> responseEntity = restTemplate.exchange(basicURL + "/" + customerId, HttpMethod.GET, entity, Customer.class);
		System.out.println(responseEntity.getStatusCodeValue());
		System.out.println(responseEntity.getBody());
        modelandView.addObject("customer", new Customer());
       return modelandView;
	}
   
   @RequestMapping(value="/delete", method=RequestMethod.GET)
	public String deleteCustomer() {
		return "deletecustomer";
	}
}
