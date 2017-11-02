package com.without_controller.without_controller.Repositories;

import com.without_controller.without_controller.Model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "/CustomerCollectn",path = "/CustomerPostman")
public interface CustRepo extends MongoRepository<Customer,Integer>{
}



// Their is no need of controller in this program
// only give the "path" name in postman and methods we want then send.