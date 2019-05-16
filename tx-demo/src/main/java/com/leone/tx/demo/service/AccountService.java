package com.leone.tx.demo.service;

import com.leone.tx.demo.entity.Account;
import com.leone.tx.demo.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *
 * @author leone
 * @since 2019-05-15
 **/
@Service
// @Transactional
public class AccountService {

    @Autowired
    private AccountMapper accountMapper;

    /**
     * 模拟转账
     *
     * @param from
     * @param to
     * @param total
     * @return
     */
    // @Transactional
    public String transfer(String from, String to, Integer total) {
        int i1 = accountMapper.updateMoney(-total, from);

        int i = 1 / 0;

        int i2 = accountMapper.updateMoney(total, to);
        return i1 == i2 ? "success" : "error";
    }

    /**
     * @param accountId
     * @return
     */
    public Account findOne(Long accountId) {
        return accountMapper.selectByPrimaryKey(accountId);
    }

}
