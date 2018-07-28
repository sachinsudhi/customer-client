package trng.springweb.utility;

import java.util.Collections;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import trng.springweb.model.Customer;

public class CustomerControllerHelper {
	static String basicURL = "http://localhost:8091/customers";

	public static Customer loadCustomerRESTHandler(Integer customerId) {
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
		ResponseEntity<Customer> responseEntity = restTemplate.exchange(basicURL + "/" + customerId, HttpMethod.GET,
				entity, Customer.class);
		if (responseEntity.getStatusCode() == HttpStatus.OK)
			return responseEntity.getBody();
		else
			return null;
	}

	public static void deleteCustomerRESTHandler(Integer customerId) {
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.delete(basicURL + "/delete/" + customerId);
	}

	public static Customer addCustomerRESTHandler(Customer customer) {
		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<Customer> entity = new HttpEntity<Customer>(customer);
		ResponseEntity<Customer> responseEntity = restTemplate.exchange(basicURL, HttpMethod.POST, entity,
				Customer.class);
		if (responseEntity.getStatusCode() == HttpStatus.CREATED) {
			System.out.println("Customer data created successfully, id: " + responseEntity.getBody().getCustomerID());
			return responseEntity.getBody();
		} else {
			return null;
		}
	}

	public static Customer updateCustomerRESTHandler(Customer customer) {
		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<Customer> entity = new HttpEntity<Customer>(customer);
		ResponseEntity<Customer> responseEntity = restTemplate.exchange(basicURL + "/update", HttpMethod.PUT, entity,
				Customer.class);
		if (responseEntity.getStatusCode() == HttpStatus.ACCEPTED) {
			//System.out.println("Customer data updated successfully, id: " + responseEntity.getBody().getCustomerID());
			return responseEntity.getBody();
		} else {
			return null;
		}
	}
}
