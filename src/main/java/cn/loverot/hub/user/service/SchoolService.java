package cn.loverot.hub.user.service;

import cn.loverot.hub.user.pojo.School;

public interface SchoolService {

    /**
     * 通过ID获取学校
     * @param id
     * @return
     */
    School findById(Integer id);
}
