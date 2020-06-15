package com.test;

import com.eneity.food;
import com.util.jdbcUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

public class demo {

    public food findById(int id) {
        String sql="SELECT * from food where id=?";
        try {
            QueryRunner  qr=	jdbcUtil.getQueryRunner();
            food food = qr.query(sql,  new BeanHandler<food>(food.class),id);
            return food;
        } catch (Exception e) {
            throw new RuntimeException(e);

        }

    }

    public static void main(String[] args) {
        demo d =new demo();
        System.out.println(d.findById(4));
    }
}
