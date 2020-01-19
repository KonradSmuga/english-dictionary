package pl.smuga.moviesweb.english.repository;

import org.apache.catalina.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.smuga.moviesweb.english.model.UserWords;

import java.util.List;
import java.util.Optional;

@Repository
public interface WordsRepository extends CrudRepository<UserWords, Long> {

    @Override
    List<UserWords> findAll();

    @Override
    Optional<UserWords> findById(Long id);

    @Override
    UserWords save(UserWords userWords);
}
