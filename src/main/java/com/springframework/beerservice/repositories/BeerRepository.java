package com.springframework.beerservice.repositories;

import com.springframework.beerservice.domain.Beer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

/**
 *
 */
public interface BeerRepository extends CrudRepository<Beer, UUID>  {
}
