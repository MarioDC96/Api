package com.develhope.Api.Repositories;

import com.develhope.Api.ApiRestRepository01.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CarRepositories extends JpaRepository<Car,Long> {
}
