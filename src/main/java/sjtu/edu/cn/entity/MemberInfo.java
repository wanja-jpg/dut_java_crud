package sjtu.edu.cn.entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@EqualsAndHashCode
@RequiredArgsConstructor
@ToString
public class MemberInfo {
    @NonNull
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
    @Column(columnDefinition = "char(20)")
    private String name;
    private String company;
    @Column(columnDefinition = "char(20)")
    private String telephone;
    @Column(columnDefinition = "char(4)")
    private String endYear;
    private String memberNo;
    private Integer status;
    @CreationTimestamp
    private Date createdAt;
    @UpdateTimestamp
    private Date updatedAt;
}
