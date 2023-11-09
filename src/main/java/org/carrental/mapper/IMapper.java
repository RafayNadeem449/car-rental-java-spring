package org.carrental.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public interface IMapper<T> {

   List<T>  resultToList(ResultSet rs) throws SQLException;

   T resultToObject(ResultSet rs) throws SQLException;

}
