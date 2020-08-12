INSERT INTO AUTHOR (ID, FIRST_NAME,LAST_NAME) VALUES
(1, 'Harper', 'Lee'),
(2, 'J. K.', 'Rowling'),
(3, 'J. R. R', 'Tolkein');

INSERT INTO PUBLISHER(ID, NAME, ADDRESS) VALUES
(1, 'Bloombury Publisher', 'London, uk'),
(2, 'Pottermore', 'Newyork, USA'),
(3, 'Kingsburry', 'Paris, France');

INSERT INTO BOOK(ID, TITLE, ISBN, PUBLISHER_ID) VALUES
(1, 'To kill a mocking bird', '1111', 1),
(2, 'Harry Potter and Philosophers stone','2222', 2),
(3, 'The lord of rings: Two towers', '3333', 3),
(4, 'Harry Potter and The prisoner of Azkaban','2223', 2),
(5, 'The lord of the rings: Fellowship of the King', '3334', 3);

INSERT INTO BOOK_AUTHOR (BOOK_ID, AUTHOR_ID) VALUES
(1, 1),
(2, 2),
(3, 3),
(4, 2),
(5, 3);
