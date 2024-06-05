package com.rookie.bigdata.netty204.domain;

/**
 * @Class FileTransferProtocol
 * @Description 文件传输协议
 * @Author rookie
 * @Date 2024/6/5 15:11
 * @Version 1.0
 */
public class FileTransferProtocol {

    private Integer transferType; //0请求传输文件、1文件传输指令、2文件传输数据
    private Object transferObj;   //数据对象；(0)FileDescInfo、(1)FileBurstInstruct、(2)FileBurstData


    public Object getTransferObj() {
        return transferObj;
    }

    public void setTransferObj(Object transferObj) {
        this.transferObj = transferObj;
    }

    public Integer getTransferType() {
        return transferType;
    }

    public void setTransferType(Integer transferType) {
        this.transferType = transferType;
    }
}
