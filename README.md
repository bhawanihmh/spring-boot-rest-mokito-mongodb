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
Ref :  https://docs.mongodb.com/manual/reference/command/ <br>
https://dzone.com/articles/top-10-most-common-commands-for-beginners <br>
https://itnext.io/mongodb-from-zero-to-rock-16-most-important-commands-to-start-using-this-nosql-database-b46728bc0e41
