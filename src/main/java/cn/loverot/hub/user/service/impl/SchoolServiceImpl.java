package cn.loverot.hub.user.service.impl;

import cn.loverot.hub.user.mapper.SchoolMapper;
import cn.loverot.hub.user.pojo.School;
import cn.loverot.hub.user.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SchoolServiceImpl implements SchoolService {
    @Autowired
    private SchoolMapper schoolMapper;
    @Override
    public School findById(Integer id) {
        return schoolMapper.findById(id);
    }
}
