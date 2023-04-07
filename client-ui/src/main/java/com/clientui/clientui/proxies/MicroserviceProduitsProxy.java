package com.clientui.clientui.proxies;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.clientui.clientui.beans.ProductBean;

@FeignClient(name = "microservice-produits", url = "localhost:9001")
public interface MicroserviceProduitsProxy {
    @GetMapping(value = "/produits")
    List<ProductBean> listeDesProduits();

   @GetMapping( value = "/produits/{id}")
   ProductBean recupererUnProduit(@PathVariable("id") int id);    
}
