package com.example.demo.register;

import com.example.demo.Dao.userBankIdMapper;
import com.example.demo.bean.UserBankIdentify;
import org.springframework.beans.factory.annotation.Autowired;

public class identify {
    @Autowired
    userBankIdMapper userBankIdMapper;

    public void identify(UserBankIdentify userBankIdentify){
        userBankIdMapper.addUserBankIdentify(userBankIdentify);
        //调用银行的接口，将银行卡认证信息传过去
    }
}
