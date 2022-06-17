package sjtu.edu.cn.jqgrid;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class JQGridFilterParam {
    private String groupOp;
    private List<JQGridRule> rules;
}
