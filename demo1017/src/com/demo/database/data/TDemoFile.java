package com.demo.database.data;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @ClassName TDemoFile
 * 文件表的持久化类
 * @Description TODO
 * @Author Zoran
 * @CreateDate 2019年10月17日  11:02:39
 * @Version 1.0.0
 */

public class TDemoFile implements Serializable {
    private Integer fileId;//文件ID
    private String fileName;//文件名（逻辑名称——展示给用户看）
    private String fileUrl;//文件路径（物理名称——在磁盘中的名称）
    private String fileType;//文件类型
    private Integer fileSize;//文件大小
    private Timestamp operTime;//操作时间

    public TDemoFile() {
    }

    public TDemoFile( String fileName, String fileUrl, String fileType,
                      Integer fileSize, Timestamp operTime) {
        this.fileName = fileName;
        this.fileUrl = fileUrl;
        this.fileType = fileType;
        this.fileSize = fileSize;
        this.operTime = operTime;
    }

    public Integer getFileID() {
        return fileId;
    }

    public void setFileID(Integer fileID) {
        this.fileId = fileID;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public Integer getFileSize() {
        return fileSize;
    }

    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }

    public Timestamp getOperTime() {
        return operTime;
    }

    public void setOperTime(Timestamp operTime) {
        this.operTime = operTime;
    }
}
