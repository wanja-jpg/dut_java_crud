package sjtu.edu.cn.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import sjtu.edu.cn.entity.MemberInfo;

public interface MemberInfoDao extends JpaRepository<MemberInfo, Long>, JpaSpecificationExecutor<MemberInfo> {
}
