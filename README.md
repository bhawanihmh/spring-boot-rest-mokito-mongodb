# spring-boot-rest-mokito-mongodb
spring boot rest using mokito and mongodb example <br>

# create db and data using below command
1. use students <br>
2. db.studentdata.insertMany([{},{},...]) : add data in studentData collection <br>
[
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
}
]
<br>
3. to verify : db.studendat.find().pretty(); <br>
