DROP TABLE IF EXISTS TODO;

CREATE TABLE TODO (
                             id SERIAL PRIMARY KEY ,
                             username VARCHAR(250) NOT NULL,
                             description VARCHAR(250) NOT NULL,
                             target_date DATE DEFAULT NULL,
                             is_done bit
);