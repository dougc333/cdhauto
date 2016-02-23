#!/usr/bin/python



class Constants(object):
	dict={}
	num=1
	def __init__(self):
		with open('/etc/cloudera-scm-server/db.mgmt.properties','r') as f:
			for line in f:
			#print line
				if '=' in line:
					print "line:%s" % line
	   				key,value = line.split('=')
					print 'key:%s' % key, 'value:%s' % value
					self.num+=1
					self.dict[key]=value
			print len(self.dict)
			print self.num

