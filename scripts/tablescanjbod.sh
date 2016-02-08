#!/bin/bash -p

#all table scan;test reads 
impala-shell -p -q "select count(*) from jbod.table100chars;" | tee jbod.txt



