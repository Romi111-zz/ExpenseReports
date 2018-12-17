package notaSpese;

import org.springframework.data.repository.CrudRepository;

import notaSpese.Trasferta;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface TrasferteRepository extends CrudRepository<Trasferta, Integer> {

}