-- public Employee(long id,String name,String phoneNumber,int age,
--             String email,String address,String password,String role){
--         this.id=id;
--         this.name=name;
--         this.password=password;
--         this.phoneNumber=phoneNumber;
--         this.age=age;
--         this.email=email;
--         this.address=address;
--         this.role=role;
-- }
CREATE TABLE IF NOT EXISTS Employee(
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    name TEXT NOT NULL,
    phoneNumber TEXT NOT NULL UNIQUE,
    age INTEGER NOT NULL CHECK(age >= 18) CHECK(age <= 60),
    email TEXT NOT NULL UNIQUE CHECK(email LIKE '%@%') CHECK(email LIKE '%.%'),
    address TEXT NOT NULL,
    password TEXT CHECK(length(password) >= 8) NOT NULL,
    role TEXT CHECK(role IN ('Marketing','Inventory','Sales','Admin')) NOT NULL
);

INSERT INTO Employee(name,phoneNumber,age,email,address,password,role) VALUES('Ahmed','01000000000',20,'ww@ww.w','Cairo','12345678','Marketing');


-- public Product(long id,String name,int quantity,int minQuantity,
--             Date expireDate,double price,String description){
--         this.id=id;
--         this.name=name;
--         this.quantity=quantity;
--         this.minQuantity=minQuantity;
--         this.expireDate=expireDate;
--         this.price=price;
--         this.description=description;
--     }
CREATE TABLE IF NOT EXISTS Product(
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    name TEXT NOT NULL UNIQUE CHECK(length(name) >= 3) CHECK(length(name) <= 20),
    quantity INTEGER NOT NULL CHECK(quantity >= 0) CHECK(quantity <= 1000),
    minQuantity INTEGER NOT NULL CHECK(minQuantity >= 0) CHECK(minQuantity <= 1000),
    expireDate DATE NOT NULL,
    price REAL NOT NULL CHECK(price >= 0),
    description TEXT NOT NULL CHECK(length(description) >= 10) CHECK(length(description) <= 100),
    offer REAL  NOT NULL CHECK(price >= 0.0) CHECK(price > 100.0)
);

INSERT INTO Product(name,quantity,minQuantity,expireDate,price,description,offer) VALUES('lol',50,10,'2023-12-12',600,'best product ever',0);

INSERT INTO Product(name,quantity,minQuantity,expireDate,price,description,offer) VALUES('wwww',50,10,'2021-12-12',600,'best product ever',0);

INSERT INTO Product(name,quantity,minQuantity,expireDate,price,description,offer) VALUES('wdwdwdw',5,10,'2021-12-12',600,'best product ever',0);

INSERT INTO Product(name,quantity,minQuantity,expireDate,price,description,offer) VALUES('dadawdd',5,10,'2025-12-12',600,'best product ever',0);

INSERT INTO Product(name,quantity,minQuantity,expireDate,price,description,offer) VALUES('zczzce',50,10,'2025-12-12',600,'best product ever',0);


-- order table
CREATE TABLE IF NOT EXISTS "Order"(
    id INTEGER PRIMARY KEY AUTOINCREMENT
);

-- order details table
CREATE TABLE IF NOT EXISTS OrderDetails(
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    orderId INTEGER NOT NULL ,
    productId INTEGER NOT NULL,
    quantity INTEGER NOT NULL CHECK(quantity >= 0) CHECK(quantity <= 1000),
    FOREIGN KEY("orderId") REFERENCES "Order"(id),
    FOREIGN KEY("productId") REFERENCES "Product"(id)
);