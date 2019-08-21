package com.sms.utils;

import com.github.pagehelper.Dialect;
import com.github.pagehelper.Page;
import com.github.pagehelper.dialect.AbstractHelperDialect;
import com.github.pagehelper.page.PageAutoDialect;
import com.github.pagehelper.page.PageMethod;
import com.github.pagehelper.page.PageParams;
import org.apache.ibatis.cache.CacheKey;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.session.RowBounds;

import java.util.List;
import java.util.Properties;

/**
 * @author luo
 */
public class PageHelperNew extends PageMethod implements Dialect {
    private PageParams pageParams;
    private PageAutoDialect autoDialect;
    private static Integer PAGE_SIZE = 10;
    private static Integer PAGE_NUM = 1;
    public PageHelperNew() {
    }

    @Override
    public boolean skip(MappedStatement ms, Object parameterObject, RowBounds rowBounds) {
        Page page = this.pageParams.getPage(parameterObject, rowBounds);
        if (page == null) {
            return true;
        } else {
            this.autoDialect.initDelegateDialect(ms);
            return false;
        }
    }

    @Override
    public boolean beforeCount(MappedStatement ms, Object parameterObject, RowBounds rowBounds) {
        return this.autoDialect.getDelegate().beforeCount(ms, parameterObject, rowBounds);
    }

    @Override
    public String getCountSql(MappedStatement ms, BoundSql boundSql, Object parameterObject, RowBounds rowBounds, CacheKey countKey) {
        return this.autoDialect.getDelegate().getCountSql(ms, boundSql, parameterObject, rowBounds, countKey);
    }

    @Override
    public boolean afterCount(long count, Object parameterObject, RowBounds rowBounds) {
        return this.autoDialect.getDelegate().afterCount(count, parameterObject, rowBounds);
    }

    @Override
    public Object processParameterObject(MappedStatement ms, Object parameterObject, BoundSql boundSql, CacheKey pageKey) {
        return this.autoDialect.getDelegate().processParameterObject(ms, parameterObject, boundSql, pageKey);
    }

    @Override
    public boolean beforePage(MappedStatement ms, Object parameterObject, RowBounds rowBounds) {
        return this.autoDialect.getDelegate().beforePage(ms, parameterObject, rowBounds);
    }

    @Override
    public String getPageSql(MappedStatement ms, BoundSql boundSql, Object parameterObject, RowBounds rowBounds, CacheKey pageKey) {
        return this.autoDialect.getDelegate().getPageSql(ms, boundSql, parameterObject, rowBounds, pageKey);
    }

    public String getPageSql(String sql, Page page, RowBounds rowBounds, CacheKey pageKey) {
        return this.autoDialect.getDelegate().getPageSql(sql, page, pageKey);
    }

    @Override
    public Object afterPage(List pageList, Object parameterObject, RowBounds rowBounds) {
        AbstractHelperDialect delegate = this.autoDialect.getDelegate();
        return delegate != null ? delegate.afterPage(pageList, parameterObject, rowBounds) : pageList;
    }

    @Override
    public void afterAll() {
        AbstractHelperDialect delegate = this.autoDialect.getDelegate();
        if (delegate != null) {
            delegate.afterAll();
            this.autoDialect.clearDelegate();
        }

        clearPage();
    }

    @Override
    public void setProperties(Properties properties) {
        this.pageParams = new PageParams();
        this.autoDialect = new PageAutoDialect();
        this.pageParams.setProperties(properties);
        this.autoDialect.setProperties(properties);
    }
    public static <E> Page<E> startPage(Integer pageNum, Integer pageSize) {
        if(pageSize == null){
            pageSize = PAGE_SIZE;
        }
        if(pageNum == null){
            pageNum = PAGE_NUM;
        }
        return startPage(pageNum, pageSize, true);
    }
}
