    create table if not exists animal(
        id int,
        name varchar(256),
        age varchar(256),
        category varchar(256),
        zoo_name varchar(256),
        zoo_location varchar(256),
        primary key (id)
    )ENGINE=InnoDB CHARACTER SET=utf8mb4 COLLATE=utf8mb4_general_ci ROW_FORMAT=DYNAMIC COMMENT='Animal表';
    create table if not exists zoo(
        z_name varchar(256),
        age int,
        location varchar(256),
        
        primary key (z_name,location)
    )ENGINE=InnoDB CHARACTER SET=utf8mb4 COLLATE=utf8mb4_general_ci ROW_FORMAT=DYNAMIC COMMENT='Zoo表';

