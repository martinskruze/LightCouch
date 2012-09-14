## CouchDB Java API

The main differences compared to ahmedyha's version are:
1. couchdb-lucene integration
2. _revs_info support
3. refactored design document loading
4. fixed various JRuby classloader issues
5. fixed design document loading on Windows
6. does not lockup under multithreaded load
7. // !code couchapp-style js macros 
