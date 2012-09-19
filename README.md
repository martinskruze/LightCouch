## CouchDB Java API

The main differences compared to ahmedyha's version are:

0. couchdb-lucene integration
1. \_revs\_info support
2. refactored design document loading
3. fixed various JRuby classloader issues
4. fixed design document loading on Windows
5. does not lockup under multithreaded load
6. // !code couchapp-style js macros 
