package com.demo.test;

import com.demo.database.SessionFactory;
import com.demo.database.data.TDemoFile;
import com.demo.mapper.ITDemoFileMapper;
import org.apache.ibatis.session.SqlSession;


import java.sql.Timestamp;
import java.util.List;

/**
 * @ClassName TestMybatis
 * 测试Mybatis数据库访问
 * @Description TODO
 * @Author Zoran
 * @CreateDate 2019年10月17日  14:45:18
 * @Version 1.0.0
 */


public class TestMybatis {
    public static void main(String[] args) {
        SqlSession session = SessionFactory.getSession();
        //插入数据
        TDemoFile tDemoFile = new TDemoFile("bg.png","sc5dd95d55de8w5d",
                "image/jpeg", 10240,new Timestamp(System.currentTimeMillis()));
        session.insert("fileMapper.insert",tDemoFile);
       /* //修改数据
        TDemoFile tDemoFile1 = session.selectOne("fileMapper.getById",6);
        tDemoFile1.setFileName("背景.png");
        tDemoFile1.setFileType("image/png");
        tDemoFile1.setOperTime(new Timestamp(System.currentTimeMillis()));
        session.update("fileMapper.uodate",tDemoFile1);
        //删除
        session.delete("fileMapper.delete","9,10,11");
        session.delete("fileMapper.deleteBatch",new String[]{"12","13","14"});*/
        //提交事务
        session.commit();
        //查询
        List<TDemoFile> list = session.selectList("fileMapper.selectAll");
        for (TDemoFile file:list){
            System.out.println(file.getFileName()+", "+file.getFileType()+", "+file.getFileSize());
        }

        //使用映射接口查询数据
       /* try{
            //获得映射接口
            ITDemoFileMapper fileMapper = session.getMapper(ITDemoFileMapper.class);
            List<TDemoFile> list = fileMapper.selectAll();
            for (TDemoFile file:list){
                System.out.println(file.getFileID()+", "+file.getFileName()+", "+
                        file.getFileType()+", "+file.getFileSize());
            }
            session.close();
        }catch (Exception e){
            e.printStackTrace();
        }*/

    }
}
