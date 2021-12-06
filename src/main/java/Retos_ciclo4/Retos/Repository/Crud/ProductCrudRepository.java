package Retos_ciclo4.Retos.Repository.Crud;

import org.springframework.data.mongodb.repository.MongoRepository;

import Retos_ciclo4.Retos.Model.Product;

public interface ProductCrudRepository extends MongoRepository<Product,String> {

}
