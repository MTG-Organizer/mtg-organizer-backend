CREATE TABLE IF NOT EXISTS media_metadata
(
    id  BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    url VARCHAR UNIQUE NOT NULL
);

-- cards: 1...19
INSERT INTO media_metadata (url) VALUES ('https://draftsim.com/wp-content/uploads/mtg-card-DB/cards/0/9/09aa3482-a068-4018-bbbf-8097a8d1482b.jpg');
INSERT INTO media_metadata (url) VALUES ('https://draftsim.com/wp-content/uploads/2021/10/Elspeth-Suns-Champion.jpg');
INSERT INTO media_metadata (url) VALUES ('https://draftsim.com/wp-content/uploads/mtg-card-DB/cards/9/9/9964629e-d79e-46e4-b3fd-e7d1759cbc60.jpg');
INSERT INTO media_metadata (url) VALUES ('https://draftsim.com/wp-content/uploads/2021/10/Legions-Landing.png');
INSERT INTO media_metadata (url) VALUES ('https://draftsim.com/wp-content/uploads/mtg-card-DB/cards/a/b/abcd0e32-2e6b-419b-9e8a-af38f2b48a66.jpg');
INSERT INTO media_metadata (url) VALUES ('https://images.saymedia-content.com/.image/c_limit%2Ccs_srgb%2Cq_auto:eco%2Cw_672/MTc5ODE2MDU3MzYyOTgyNTEx/best-11-counter-cards-mtg.webp');
INSERT INTO media_metadata (url) VALUES ('https://gatherer.wizards.com/Handlers/Image.ashx?multiverseid=201143&type=card');
INSERT INTO media_metadata (url) VALUES ('https://gatherer.wizards.com/Handlers/Image.ashx?multiverseid=479156&type=card');
INSERT INTO media_metadata (url) VALUES ('https://www.cardplace.ru/pictures/ONE/23.jpg');
INSERT INTO media_metadata (url) VALUES ('https://cards.scryfall.io/normal/front/f/c/fc38fe5d-6c35-4fff-8f1b-726a0685c6f8.jpg?1591226756');
INSERT INTO media_metadata (url) VALUES ('https://cdn11.bigcommerce.com/s-641uhzxs7j/images/stencil/1280x1280/products/355775/406962/ONE301__86899.1674022925.jpg?c=1');
INSERT INTO media_metadata (url) VALUES ('https://gatherer.wizards.com/Handlers/Image.ashx?multiverseid=484858&type=card');
INSERT INTO media_metadata (url) VALUES ('https://static.wikia.nocookie.net/mtgsalvation_gamepedia/images/6/60/Architect_of_the_Untamed.png/revision/latest?cb=20171229105902');
INSERT INTO media_metadata (url) VALUES ('https://cards.scryfall.io/normal/front/1/d/1de8b26f-1afb-4a87-9766-3b7961d81987.jpg?1676398716');
INSERT INTO media_metadata (url) VALUES ('https://gatherer.wizards.com/Handlers/Image.ashx?multiverseid=385736&type=card');
INSERT INTO media_metadata (url) VALUES ('https://gatherer.wizards.com/Handlers/Image.ashx?multiverseid=449387&type=card');
INSERT INTO media_metadata (url) VALUES ('https://gatherer.wizards.com/Handlers/Image.ashx?multiverseid=412977&type=card');
INSERT INTO media_metadata (url) VALUES ('https://gatherer.wizards.com/Handlers/Image.ashx?multiverseid=469121&type=card');
INSERT INTO media_metadata (url) VALUES ('https://gatherer.wizards.com/Handlers/Image.ashx?multiverseid=487402&type=card');

-- tokens: 20...24
INSERT INTO media_metadata (url) VALUES ('https://repositorio.sbrauble.com/arquivos/in/magic/251907/5f424412bc01a-bkhpdr-xfv4ls-abd16a189dcd382ff3dbc02c903df078.jpg');
INSERT INTO media_metadata (url) VALUES ('https://www.mtg.onl/static/faece6c2f495f5aacf9d1beb1623cd12/4d406/M20_002_Soldier_W_1_1.jpg');
INSERT INTO media_metadata (url) VALUES ('https://d33wubrfki0l68.cloudfront.net/9ca76c340146355175fd7047df43d5d333d9728e/e17ef/static/d5407a7663a9a2fdfc4fd479c2d6c83a/4d406/m15_003_spirit_w_1_1.jpg');
INSERT INTO media_metadata (url) VALUES ('https://product-images.tcgplayer.com/145812.jpg');
INSERT INTO media_metadata (url) VALUES ('https://www.mtg-forum.de/db/picture.php?utf8=1&lng=it&card=Monk&set=L15&collector_number=1&language_code=en');

-- permanent_counters: 25
INSERT INTO media_metadata (url) VALUES ('https://static.wikia.nocookie.net/mtgsalvation_gamepedia/images/6/6d/SNC_punch_card_2.png/revision/latest?cb=20220420035044');

-- player_counters: 26...29
INSERT INTO media_metadata (url) VALUES ('https://product-images.tcgplayer.com/480340.jpg');
INSERT INTO media_metadata (url) VALUES ('https://static.wikia.nocookie.net/mtgsalvation_gamepedia/images/c/cd/C15_Experience_counter_card.jpg/revision/latest?cb=20180608103554');
INSERT INTO media_metadata (url) VALUES ('https://static.wikia.nocookie.net/mtgsalvation_gamepedia/images/3/3a/KLD_Energy_Reserve.png/revision/latest/scale-to-width-down/599?cb=20160915162342');
INSERT INTO media_metadata (url) VALUES ('https://i.ebayimg.com/images/g/EfoAAOSw3ENjQvoi/s-l1200.jpg');
