package pl.smuga.moviesweb.english.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name = "userwords")
public class UserWords {

    @Id
    @GeneratedValue
    private int id;

    @ManyToOne (cascade= CascadeType.ALL)
    private Words word;

    @ManyToOne(cascade= CascadeType.ALL)
    private Users user;

    @Column(name = "startDate")
    private Date startDate;
    @Column(name = "endDate")
    private Date endDate;

}



