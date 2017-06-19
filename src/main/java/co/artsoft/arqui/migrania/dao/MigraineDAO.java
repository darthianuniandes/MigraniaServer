package co.artsoft.arqui.migrania.dao;

import org.springframework.data.repository.CrudRepository;

import co.artsoft.arqui.migrania.entity.Migraine;

public interface EpisodioDAO extends CrudRepository<Migraine, Long>{

}
