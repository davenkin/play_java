#!/bin/sh
export PATH=/usr/local/mysql/bin:$PATH
mysql -u root < create_database.sql
