package net.codejava.repoclass;

import org.springframework.data.jpa.repository.JpaRepository;

import net.codejava.beanclass.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
