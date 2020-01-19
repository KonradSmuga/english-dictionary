package pl.smuga.moviesweb.english.repository;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.smuga.moviesweb.english.model.UserWords;
import pl.smuga.moviesweb.english.model.Words;

import java.util.List;

@Repository
public interface WordsRepository extends CrudRepository<UserWords, Long> {

    @Override
    List<UserWords> findAll();

    @Query(
            value = "SELECT * FROM words w INNER JOIN userwords u ON w.id = u.id WHERE words = ?2 AND userWords =?3 ",
            nativeQuery = true)
    List<Words> findUserWordsByWord(Long id, String words, String userWords);

    @Override
    UserWords save(UserWords userWords);
}
