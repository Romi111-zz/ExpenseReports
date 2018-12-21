package notaSpese;

import org.springframework.data.repository.CrudRepository;

import notaSpese.Spesa;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface SpeseRepository extends CrudRepository<Spesa, Integer> {

}