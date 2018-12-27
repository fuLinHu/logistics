package com.aiwen.logistics.pojo;

import java.io.Serializable;

/**
 * Created by ASUS on 2018/4/27.
 */
public class Page implements Serializable{
        //定义常量 每页数
        public final static int DEFAULT_SIZE = 10;
        //每页数
        protected int pageSize = DEFAULT_SIZE;
        //起始行
        protected int startRow;//起始行
        //页码
        protected int pageNo = 1;


        public int getPageNo() {
            return pageNo;
        }
        public void setPageNo(int pageNo) {
            this.pageNo = pageNo;
            this.startRow = (pageNo-1)*this.pageSize;
        }
        public int getPageSize() {
            return pageSize;
        }
        public Page setPageSize(int pageSize) {
            this.pageSize = pageSize;
            this.startRow = (pageNo-1)*this.pageSize;
            return this;
        }
        public int getStartRow() {
            return startRow;
        }
        public void setStartRow(int startRow) {
            this.startRow = startRow;
        }

}
