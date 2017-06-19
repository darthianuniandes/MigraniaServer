package co.artsoft.arqui.migrania.dao;

import org.springframework.data.repository.CrudRepository;

import co.artsoft.arqui.migrania.entity.Food;

public interface LocationDAO extends CrudRepository<Food, Integer>{

}

