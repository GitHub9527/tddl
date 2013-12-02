package com.taobao.tddl.executor.spi;

import com.taobao.tddl.optimizer.config.table.TableMeta;

/**
 * 临时表
 * 
 * @author mengshi.sunmengshi 2013-11-27 下午4:00:11
 * @since 5.1.0
 */
public interface TempTable {

    /**
     * 获取一个临时表对象
     * 
     * @param meta
     * @param groupNode
     * @param isTempTable
     * @return
     * @throws Exception
     */
    Table getTable(TableMeta meta, String groupNode, boolean isTempTable, long requestID) throws Exception;

}
