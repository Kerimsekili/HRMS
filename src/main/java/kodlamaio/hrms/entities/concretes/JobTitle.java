package kodlamaio.hrms.entities.concretes;

import lombok.*;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "job_titles")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class JobTitle {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    @Column(name = "title")
    private String title;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobTitle jobTitle = (JobTitle) o;
        return id == jobTitle.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
