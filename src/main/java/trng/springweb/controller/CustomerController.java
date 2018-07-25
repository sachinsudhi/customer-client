package trng.springweb.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import trng.springweb.modell.Customer;
import trng.springweb.utility.CustomerControllerHelper;

@Controller
@RequestMapping("/customers")
public class CustomerController {
	
   @RequestMapping(method = RequestMethod.GET)
	public String initloadForm(Map<String, Object> model) {
	   Customer customer=new Customer();
	   model.put("customer", customer);
		return "addcustomer";
	}
   
   @RequestMapping(value="/loadmenu",method={RequestMethod.GET, RequestMethod.POST})
  	public String loadMenuCustomer() {
         return "loadcustomer";
  	}
     
     @RequestMapping(value="/deletemenu", method={RequestMethod.GET, RequestMethod.POST})
  	public String deleteMenuCustomer() {
  		 return "deletecustomer";
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
	    CustomerControllerHelper.loadCustomerRESTHandler(customerId);
        modelandView.addObject("customer", new Customer());
       return modelandView;
	}
   
   @RequestMapping(value="/delete", method={RequestMethod.GET, RequestMethod.POST})
	public ModelAndView deleteCustomer(@RequestParam(value="customerId" ,required=false)Integer customerId, Model model) {
		 ModelAndView modelandView = new ModelAndView("deletecustomer");
		CustomerControllerHelper.deleteCustomerRESTHandler(customerId);
		 return modelandView;
	}
}
