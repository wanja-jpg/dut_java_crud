package sjtu.edu.cn.jqgrid;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@NoArgsConstructor
public class JQGridParam {
    private String search;
    private String filters;
    private Integer rows;
    private Integer page;
    private String sidx;
    private String sord;
    private Map<String,Object> others;
}
