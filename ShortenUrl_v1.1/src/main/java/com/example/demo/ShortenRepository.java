package com.example.demo;
import com.example.demo.ShortenEntity;


import org.springframework.data.repository.CrudRepository;

public interface ShortenRepository extends CrudRepository<ShortenEntity, Integer>
{

}
