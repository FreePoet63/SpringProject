delete from user_role;
delete from usr;

insert into usr(id, active, password, username) values
(1, true, '$2a$08$74qr2EYqR/8UbPSd5CEPi.dco67D7XskNvdveqmv8KAGgiWf5hneW', 'Natasha'),
(2, true, '"$2a$08$74qr2EYqR/8UbPSd5CEPi.dco67D7XskNvdveqmv8KAGgiWf5hneW"', 'Olesya');

insert into user_role(user_id, roles) values
(1, 'USER'), (1, 'ADMIN'),
(2, 'USER') ;