package Retos_ciclo4.Retos.Repository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Retos_ciclo4.Retos.Model.Product;
import Retos_ciclo4.Retos.Repository.Crud.ProductCrudRepository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductRepository {
    @Autowired
    private ProductCrudRepository productCrudRepository;

    public List<Product> getAll(){
        return productCrudRepository.findAll();
    }

    public Optional<Product> getProduct(String id){
        return productCrudRepository.findById(id);
    }

    public Product create(Product product){
        return productCrudRepository.save(product);
    }

    public void update(Product product){
        productCrudRepository.save(product);
    }

    public void delete(Product product){
        productCrudRepository.delete(product);
    }
}
