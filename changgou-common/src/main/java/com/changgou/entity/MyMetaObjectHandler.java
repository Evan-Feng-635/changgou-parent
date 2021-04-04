package com.changgou.entity;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 自動填充器
 *
 * @author xin.hu
 */
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(MyMetaObjectHandler.class);

    @Override
    public void insertFill(MetaObject metaObject) {
        LOGGER.info("start insert fill ....");
        //避免使用metaObject.setValue()
//
//        this.setFieldValByName("cityCode", sessionUser == null ? null : sessionUser.getCityCode(), metaObject);
//        this.setFieldValByName("createBy", sessionUser == null ? "SYSTEM" : sessionUser.getId(), metaObject);
//        this.setFieldValByName("updateBy", sessionUser == null ? "SYSTEM" : sessionUser.getId(), metaObject);
//        this.setFieldValByName("companyId", sessionUser == null ? null: sessionUser.getCompId(), metaObject);
        this.setFieldValByName("createTime", new Date(), metaObject);
        this.setFieldValByName("updateTime", new Date(), metaObject);
        this.setFieldValByName("deleted", 0, metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        LOGGER.info("start update fill ....");
//        SessionUser sessionUser = uamSessionService.getSessionUser();
//        this.setFieldValByName("updateBy", sessionUser == null ? "SYSTEM" : sessionUser.getId(), metaObject);
        this.setFieldValByName("updateTime", new Date(), metaObject);
    }
}
