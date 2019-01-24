package com.sunyx.handler;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class BooleanTypeHandler implements TypeHandler {
    @Override public Object getResult(ResultSet resultSet, String param) throws SQLException {
        String str = resultSet.getString(param);
        Boolean rt = Boolean.FALSE;
        if ("Y".equalsIgnoreCase(str)){
            rt = Boolean.TRUE;
        }
        return rt;
    }

    @Override
    public Object getResult(ResultSet resultSet, int columnIndex) throws SQLException {
        String str = resultSet.getString(columnIndex);
        Boolean rt = Boolean.FALSE;
        if ("Y".equalsIgnoreCase(str)){
            rt = Boolean.TRUE;
        }
        return rt;
    }

    @Override public Object getResult(CallableStatement callableStatement, int i) throws SQLException {
        Boolean b = callableStatement.getBoolean(i);
        return b == true ? "Y" : "N";
    }
    @Override public void setParameter(PreparedStatement preparedStatement, int i, Object object, JdbcType arg3) throws SQLException {
        Boolean b = (Boolean) object;
        String value = (Boolean) b == true ? "Y" : "N";
        preparedStatement.setString(i, value);
    }
}  