package sjtu.edu.cn.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemberInfoVo {
    private Long id;
    private String name;
    private String company;
    private String telephone;
    private String endYear;
    private String memberNo;
    private Integer status;
    private String createdAt;
    private String updatedAt;
}
