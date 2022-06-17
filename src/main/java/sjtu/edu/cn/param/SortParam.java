package sjtu.edu.cn.param;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SortParam {
    @NonNull
    private String attr;
    @NonNull
    private String direction;
}
