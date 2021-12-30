delete from message;

insert into message(id, text, tag, user_id) values
(1, 'Messi', 'football', 1),
(2, 'Crosby', 'hockey', 1),
(3, 'Ronaldo', 'football', 2),
(4, 'Kabaeva', 'gymnastic', 2);

alter sequence hibernate_sequence restart with 7;