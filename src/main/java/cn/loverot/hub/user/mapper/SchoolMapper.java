package cn.loverot.hub.user.mapper;

import cn.loverot.hub.user.pojo.School;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface SchoolMapper {
    @Select({"SELECT *",
            "FROM school",
            "WHERE id = #{value}"})
    School findById(int id);
}
