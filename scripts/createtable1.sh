#/bin/bash -p

impala-shell -p -q "create database blkdev;"

impala-shell -p -q "create table blkdev.table100chars(id int, col1 string, col2 string, col3 string, col4 string, col5 string, col6 string, col7 string, col8 string, col9 string, col10 string, age int, d string) row format delimited fields terminated by ',' location '/impaladata' tblproperties( 'serialization.format'='');"

