package trng.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import trng.springweb.model.Customer;
import trng.springweb.utility.CustomerControllerHelper;

@Controller
@RequestMapping("/customers")
public class CustomerController {
	
   @RequestMapping(method = RequestMethod.GET)
	public ModelAndView initloadForm() {
	   return new ModelAndView("addcustomer", "customer", new Customer());
	}
   
   @RequestMapping(value="/add", method = RequestMethod.POST)
   public String processCreationForm(@ModelAttribute("customer")Customer customer, Model model) {
	  Customer ret=CustomerControllerHelper.addCustomerRESTHandler(customer);
	     if(ret!=null)
	     {
	      model.addAttribute("customer",ret);
	      return "customerlist";
	     }
	     return "error";
   }
   
   @RequestMapping(value="/loadmenu", method = RequestMethod.GET)
  	public String loadMenuCustomer() {
         return "loadcustomer";
  	}
     
     @RequestMapping(value="/deletemenu", method = RequestMethod.GET)
  	public String deleteMenuCustomer() {
  		 return "deletecustomer";
  	}
   
   @RequestMapping(value="/update", method=RequestMethod.GET)
  	public ModelAndView updateCustomerMenu() {
	   return new ModelAndView("updatecustomer", "customer", new Customer());
  	}
   
   @RequestMapping(value="/updated", method=RequestMethod.POST)
 	public ModelAndView updateCustomer(@ModelAttribute("customer")Customer customer, Model model) {
	  Customer ret= CustomerControllerHelper.updateCustomerRESTHandler(customer);
	      ModelAndView mdv=new ModelAndView("customerlist");
	      mdv.addObject(customer);
	      return mdv;
 	}
   
   @RequestMapping(value="/list", method=RequestMethod.GET)
	public String loadCustomerList() {
		return "customerlist";
	}
   
   @RequestMapping(value="/load", method= {RequestMethod.GET, RequestMethod.POST})
	public String loadCustomer(@RequestParam(value="customerId" ,required=false)Integer customerId, Model model) {
	   Customer ret= CustomerControllerHelper.loadCustomerRESTHandler(customerId);
	    if(ret!=null)
	     {
	      model.addAttribute("customer",ret);
	      return "customerlist";
	     }
	     return "error";
	}
   
   @RequestMapping(value="/delete", method={RequestMethod.GET, RequestMethod.POST})
	public ModelAndView deleteCustomer(@RequestParam(value="customerId")Integer customerId, Model model) {
		 ModelAndView modelandView = new ModelAndView("deletecustomer");
		CustomerControllerHelper.deleteCustomerRESTHandler(customerId);
		 return modelandView;
	}
}
