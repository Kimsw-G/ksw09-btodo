package com.example.ksw09.dao;

import com.example.ksw09.model.DdayTodoVO;
import com.example.ksw09.model.LoginInfo;
import com.example.ksw09.model.MemberVO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("ddayTodoDAO")
public interface DdayTodoDAO {

    public List<DdayTodoVO> selectDdayTodoList(LoginInfo param);
    public int insertDdayTodo(DdayTodoVO param);
}
