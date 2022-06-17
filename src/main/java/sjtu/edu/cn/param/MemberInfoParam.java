package sjtu.edu.cn.param;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Data
@NoArgsConstructor
public class MemberInfoParam {
    private Long id;
    private String name;
    private String company;
    private String telephone;
    private String lessYear;
    private String endYear;
    private String memberNo;
    private Integer status;
    private Date updatedAt;
    private Date createdAt;
    private PageParam page;
    private String fuzzy;
}
