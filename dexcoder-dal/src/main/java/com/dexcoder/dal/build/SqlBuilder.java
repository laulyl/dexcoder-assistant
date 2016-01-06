package com.dexcoder.dal.build;

import com.dexcoder.dal.BoundSql;
import com.dexcoder.dal.handler.NameHandler;

/**
 * Created by liyd on 2015-12-4.
 */
public interface SqlBuilder {

    /**
     * 添加操作字段
     *
     * @param fieldName     the field name
     * @param sqlOperator   the sql operator
     * @param fieldOperator the field operator
     * @param type          the type
     * @param value         the value
     */
    void addField(String fieldName, String sqlOperator, String fieldOperator, AutoFieldType type, Object value);

    /**
     * 添加操作条件
     *
     * @param fieldName the field name
     * @param sqlOperator the sql operator
     * @param fieldOperator the field operator
     * @param type the type
     * @param value the value
     */
    void addCondition(String fieldName, String sqlOperator, String fieldOperator, AutoFieldType type, Object value);

    //    /**
    //     * 获取表别名
    //     *
    //     * @return
    //     */
    //    String getTableAlias();

    //    /**
    //     * 是否拥有操作字段
    //     *
    //     * @return
    //     */
    //    boolean hasFields();

    /**
     * 获取操作表对象
     *
     * @return
     */
    MetaTable getMetaTable();

    //    /**
    //     * 获取所有操作字段
    //     *
    //     * @return
    //     */
    //    Map<String, AutoField> getFields();

    /**
     * 构建BoundSql
     *
     * @param clazz 不能为空
     * @param entity 可以为空
     * @param isIgnoreNull entity不为空的情况下是否忽略null属性
     * @param nameHandler 名称处理器，如果注解指定了单独的nameHandler则会被覆盖
     * @return bound sql
     */
    BoundSql build(Class<?> clazz, Object entity, boolean isIgnoreNull, NameHandler nameHandler);

}
