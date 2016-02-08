#/bin/bash -p
#this is a remote create, creating table for data on datanode us33

impala-shell -p -q "create table blkdev.table2100chars(id int, col1 string, col2 string, col3 string, col4 string, col5 string, col6 string, col7 string, col8 string, col9 string, col10 string, age int, d string) row format delimited fields terminated by ',' location '/impaladata2' tblproperties( 'serialization.format'='');"

