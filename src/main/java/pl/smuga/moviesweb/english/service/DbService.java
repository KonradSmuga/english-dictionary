package pl.smuga.moviesweb.english.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.smuga.moviesweb.english.model.UserWords;
import pl.smuga.moviesweb.english.repository.WordsRepository;

import java.util.List;
import java.util.Optional;

@Service
public class DbService {

    @Autowired
    private WordsRepository wordsRepository;

    public List<UserWords> getAllWords() {

        return wordsRepository.findAll();
    }

    public Optional<UserWords> findById(final Long UserWordsId) {

        return wordsRepository.findById(UserWordsId);
    }


}


