package trng.springweb.utility;

import java.util.Collections;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import trng.springweb.modell.Customer;

public class CustomerControllerHelper {
	static String basicURL="http://localhost:8091/customers";

	public static void loadCustomerRESTHandler(Integer customerId) {
		  RestTemplate restTemplate = new RestTemplate();
			HttpHeaders headers = new HttpHeaders();
			headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
			headers.setContentType(MediaType.APPLICATION_JSON);
			HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
			ResponseEntity<Customer> responseEntity = restTemplate.exchange(basicURL + "/" + customerId, HttpMethod.GET, entity, Customer.class);
			System.out.println(responseEntity.getStatusCodeValue());
			System.out.println(responseEntity.getBody());
	}
	
	public static void deleteCustomerRESTHandler(Integer customerId) {
		 RestTemplate restTemplate = new RestTemplate();
		 restTemplate.delete(basicURL + "/delete/" + customerId);
	}
}
