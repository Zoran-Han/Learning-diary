package com.demo.database;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 * @ClassName SessionFactory
 * 数据访问会话工厂
 * @Description TODO
 * @Author Zoran
 * @CreateDate 2019年10月17日  17:29:13
 * @Version 1.0.0
 */

public class SessionFactory {
    private static SqlSessionFactory sessionFactory;
    static {
        try{
            Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
            sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static SqlSession getSession(){
        //return sessionFactory.openSession(true);//true 自动提交事务，false手动提交事务（默认）
        return sessionFactory.openSession();
    }
}
