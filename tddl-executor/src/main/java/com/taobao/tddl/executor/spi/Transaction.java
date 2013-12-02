package com.taobao.tddl.executor.spi;

import java.util.List;

import com.taobao.tddl.common.exception.TddlException;
import com.taobao.tddl.executor.cursor.Cursor;

/**
 * 事务对象
 * 
 * @author mengshi.sunmengshi 2013-11-27 下午4:00:49
 * @since 5.1.0
 */
public interface Transaction {

    long getId();

    void commit() throws TddlException;

    void rollback() throws TddlException;

    boolean isAutoCommit() throws TddlException;

    public ITHLog getHistoryLog();

    public void addCursor(Cursor cursor);

    public List<Cursor> getCursors();

    public void close() throws TddlException;

    public void setAutoCommit(boolean autoCommit);

}
