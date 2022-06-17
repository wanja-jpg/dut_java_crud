package sjtu.edu.cn.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageVo<T> {
    private Integer totalPages;
    private Long totalElements;
    private List<T> data;
}
