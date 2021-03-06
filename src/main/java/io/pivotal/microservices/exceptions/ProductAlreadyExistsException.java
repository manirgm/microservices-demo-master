package io.pivotal.microservices.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Allow the controller to return a 404 if a product is already exists by simply
 * throwing this exception. The @ResponseStatus causes Spring MVC to return a
 * 404 instead of the usual 500.
 * 
 * @author manikanta.s
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class ProductAlreadyExistsException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ProductAlreadyExistsException(String productName) {
		super("Product Already Exists: " + productName);
	}
}
