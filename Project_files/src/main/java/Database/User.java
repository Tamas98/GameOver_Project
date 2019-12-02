package Database;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class User {

    @Id
    @GeneratedValue
    @Column
    private Integer userid;

    @Column
    private String username;

    @Column
    private String password;

    @ElementCollection
    private List<Game> library;
}
