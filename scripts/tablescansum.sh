#!/bin/bash -p

#make sure we arent reading the metadata
#a sum has to touch all the rows w/a read

impala-shell -p -q "select sum(id) sumId, sum(age) sumAge from blkdev.table100chars group by id,age order by id;" | tee file.txt



