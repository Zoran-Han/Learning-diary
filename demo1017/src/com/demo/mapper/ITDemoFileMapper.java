package com.demo.mapper;

import com.demo.database.data.TDemoFile;

import java.util.List;

/**
 * @InterfaceName ITDemoFileMapper
 * 数据访问的映射接口
 * @Description TODO
 * @Author Zoran
 * @CreateDate 2019年10月17日  16:48:45
 * @Version 1.0.0
 */
public interface ITDemoFileMapper {
    /**
     * 查询所有数据
     *
     * @return
     * @throws Exception
     */
    public List<TDemoFile> selectAll() throws Exception;

    /**
     * 查根据ID获得文件数据
     *
     * @return
     * @throws Exception
     */
    public TDemoFile getById(Integer id) throws Exception;

    /**
     * 添加文件数据
     *
     * @return
     * @throws Exception
     */
    public void insert(TDemoFile tDemoFile) throws Exception;

    /**
     * 修改文件数据
     *
     * @return
     * @throws Exception
     */
    public void update(TDemoFile tDemoFile) throws Exception;

    /**
     * 删除文件数据
     *支持批量删除
     * @return
     * @throws Exception
     */
    public void delete(TDemoFile tDemoFile) throws Exception;

    /**
     * 删除文件数据
     *支持批量删除
     * @return
     * @throws Exception
     */
    public void deleteBatch(String[] id) throws Exception;
}
