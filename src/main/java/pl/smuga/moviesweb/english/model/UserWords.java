package pl.smuga.moviesweb.english.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.catalina.User;
import org.graalvm.compiler.word.Word;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserWords {

    private int id;
    private Word word;
    private User user;
    private Date startDate;
    private Date endDate;

}



