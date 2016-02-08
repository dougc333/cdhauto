#/bin/bash -p

impala-shell -p -q "create database jbod;"
impala-shell -p -q "create table jbod.table100chars2(id int, col1 string, col2 string, col3 string, col4 string, col5 string, col6 string, col7 string, col8 string, col9 string, col10 string, age int, d string) row format delimited fields terminated by ',' location '/impaladata2' tblproperties( 'serialization.format'='');"

