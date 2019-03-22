package com.edu.pattern.template;

import com.edu.pattern.template.dao.MemberDao;

public class MemberDaoTest {

    public static void main(String[] args) {
        MemberDao memberDao = new MemberDao();
        memberDao.query();
    }
}
