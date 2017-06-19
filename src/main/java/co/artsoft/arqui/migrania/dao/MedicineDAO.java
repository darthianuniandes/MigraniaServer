package co.artsoft.arqui.migrania.dao;

import org.springframework.data.repository.CrudRepository;

import co.artsoft.arqui.migrania.entity.Food;

public interface MedicineDAO extends CrudRepository<Food, Integer>{

}
