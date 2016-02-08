#!/bin/bash -p

#assumes table blkdev.testbigdata exists
#all table scan;test reads 
impala-shell -p -q "select count(*) from jbod.table100chars2;" | tee jbodremote.txt



