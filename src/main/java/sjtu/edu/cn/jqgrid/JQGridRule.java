package sjtu.edu.cn.jqgrid;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class JQGridRule {
    private String field;
    private String op;
    private String data;
}
