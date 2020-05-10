# spring-boot-rest-mokito-mongodb
spring boot rest using mokito and mongodb example <br>

# MongoDB, BSON, and JSON
The MongoDB BSON implementation is lightweight, fast and highly traversable. Like JSON, MongoDB's BSON implementation supports embedding objects and arrays within other objects and arrays – MongoDB can even 'reach inside' BSON objects to build indexes and match objects against query expressions on both top-level and nested BSON keys. This means that MongoDB gives users the ease of use and flexibility of JSON documents together with the speed and richness of a lightweight binary format.


# create db and data using below command
1. use students <br>
2. db.studentdata.insertMany([{},{},...]) : add data in studentData collection <br>
```
db.studentdata.insertMany([
{
	"name": "Bhawani",
	"email": "bhawani@gmail.com",
	"contact": "9999999999",
	"courseCount": 4,
	"isVerified": true
},
{
	"name": "Mark",
	"email": "mark@example.com",
	"contact": "9999999888",
	"courseCount": 2,
	"isVerified": false
},
{
	"name": "M1",
	"email": "m1@gmial.com",
	"contact": "9999999888",
	"courseCount": 2,
	"isVerified": false
}])
```
<br>
3. to verify : db.studentdata.find().pretty(); <br>
4. get request : http://localhost:8083/studentdatas

# Some DB commands
•	db.collection.insertOne() New in version 3.2
•	db.collection.insertMany() New in version 3.2

bulkWrite() supports the following write operations:
•	insertOne
•	updateOne
•	updateMany
•	replaceOne
•	deleteOne
•	deleteMany
```
try {
   db.characters.bulkWrite(
      [
         { insertOne :
            {
               "document" :
               {
                  "_id" : 4, "char" : "Dithras", "class" : "barbarian", "lvl" : 4
               }
            }
         },
         { insertOne :
            {
               "document" :
               {
                  "_id" : 5, "char" : "Taeln", "class" : "fighter", "lvl" : 3
               }
            }
         },
         { updateOne :
            {
               "filter" : { "char" : "Eldon" },
               "update" : { $set : { "status" : "Critical Injury" } }
            }
         },
         { deleteOne :
            { "filter" : { "char" : "Brisbane"} }
         },
         { replaceOne :
            {
               "filter" : { "char" : "Meldane" },
               "replacement" : { "char" : "Tanys", "class" : "oracle", "lvl" : 4 }
            }
         }
      ]
   );
}

```
Log Into MongoDB ``` mongo -u <username> -p <password> --authenticationDatabase <dbname> ```
Show All Databases ``` show dbs```
Select Database to Work With ``` use databaseName ```
Authenticate and Log Out From Database  
```

//
// Authenticate
//
db.auth("username", "password");
//
// Logout
//
db.logout()
```
List Down Collections, Users, Roles, etc.
```
//
// List down collections of the current database
//
show collections;
db.getCollectionNames();
//
// List down all the users of current database
//
show users;
db.getUsers();
//
// List down all the roles
//
show roles
```
Create a Collection
```
db.createCollection("collectionName");
```
Insert a Document in a Collection
```
//
// Insert single document
//
db.<collectionName>.insert({field1: "value", field2: "value"})
//
// Insert multiple documents
//
db.<collectionName>.insert([{field1: "value1"}, {field1: "value2"}])
db.<collectionName>.insertMany([{field1: "value1"}, {field1: "value2"}])
```
Save or Update Document
```
//
// Matching document will be updated; In case, no document matching the ID is found, a new document is created
//
db.<collectionName>.save({"_id": new ObjectId("jhgsdjhgdsf"), field1: "value", field2: "value"});
```
Display Collection Records
```
//
// Retrieve all records
//
db.<collectionName>.find();
//
// Retrieve limited number of records; Following command will print 10 results;
//
db.<collectionName>.find().limit(10);
//
// Retrieve records by id
//
db.<collectionName>.find({"_id": ObjectId("someid")});
//
// Retrieve values of specific collection attributes by passing an object having 
// attribute names assigned to 1 or 0 based on whether that attribute value needs 
// to be included in the output or not, respectively.
//
db.<collectionName>.find({"_id": ObjectId("someid")}, {field1: 1, field2: 1});
db.<collectionName>.find({"_id": ObjectId("someid")}, {field1: 0}); // Exclude field1
//
// Collection count
//
db.<collectionName>.count();
```
Administrative Commands
```
//
// Get the collection statistics 
//
db.<collectionName>.stats()
db.printCollectionStats()
//
// Latency statistics for read, writes operations including average time taken for reads, writes
// and related umber of operations performed
//
db.<collectionName>.latencyStats()
//
// Get collection size for data and indexes
//
db.<collectionName>.dataSize() // Size of the collection
db.<collectionName>.storageSize() // Total size of document stored in the collection
db.<collectionName>.totalSize() // Total size in bytes for both collection data and indexes
db.<collectionName>.totalIndexSize() // Total size of all indexes in the collection

```
*Tip: To show a better visual / representation, add pretty() at the end, like: 
```db.posts.find().pretty()```



Ref :  https://docs.mongodb.com/manual/reference/command/ <br>
https://dzone.com/articles/top-10-most-common-commands-for-beginners <br>
https://itnext.io/mongodb-from-zero-to-rock-16-most-important-commands-to-start-using-this-nosql-database-b46728bc0e41
