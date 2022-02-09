
db.createUser(
    {
        user : "writer",
        pwd : "writer",
        roles : [
            {
                role : "readWrite",
                db : "books"
            }
        ]
    }
)

db.createUser(
    {
        user : "dev",
        pwd : "dev",
        roles : [
            {
                role : "root",
                db : "admin"
            },
            {
                role : "readWrite",
                db : "books"
            }
            
        ]
    }
)

